package by.grsu.controller;

import org.apache.commons.io.IOUtils;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.servlet.ServletInputStream;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.Produces;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.springframework.http.MediaType.valueOf;


/**
 * Created by alek on 22.3.17.
 */
@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/files")
@MultipartConfig(fileSizeThreshold = 20971520)
public class FileTransferController {

    private static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(FileTransferController.class);

    @RequestMapping(value = "/upload", method = RequestMethod.POST)
    @Produces("application/json;charset=UTF-8")
    public String continueFileUpload(HttpServletRequest request, HttpServletResponse response){String path = "/home/alek/up/";
        ServletInputStream reader = null;
        FileOutputStream writer = null;
        try {
            reader = request.getInputStream();
            String myString = IOUtils.toString(reader, "UTF-8");

            Pattern pattern = Pattern.compile("FormBoundary.*?(.*(Content-Disposition.*filename=\\\"(.*?)\\\").*?(.*?)(.*)).*------WebKitFormBoundary", Pattern.DOTALL | Pattern.MULTILINE);
            Matcher matcher = pattern.matcher(myString);
            String fileEntry = "";

            while (matcher.find()) {
                path += matcher.group(3);
                fileEntry = matcher.group(5);
            }

            fileEntry = fileEntry.replaceAll("(\\r\\nContent.*?\\r\\n\\r\\n)", "");

            File outputFile = new File(path);
            writer = new FileOutputStream(outputFile);
            outputFile.createNewFile();
            writer.write(fileEntry.getBytes());

        } catch (IOException e) {
            log.error(e.toString());
        } finally {
            try {
                reader.close();
                writer.close();
            } catch (IOException e) {
                log.error(e.toString());
            }
        }
        return "File succesfully uploaded";
    }
}
