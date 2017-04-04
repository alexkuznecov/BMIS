package by.grsu.controller;

import by.grsu.enums.Filter;
import by.grsu.dto.MaterialDTO;
import by.grsu.service.MaterialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

/**
 * Created by alek on 9.3.17.
 */
@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/materials")
public class MaterialController {

    @Autowired
    private MaterialService materialService;

    @RequestMapping("/all")
    public List<MaterialDTO> getAll() {
        return materialService.getAllMaterials();
    }

    @RequestMapping("/filters")
    public List<MaterialDTO> filter(@RequestParam Map<String, String> filters) {
        try {
            String name = "", probDate = "", probPlace = "", description = "";
            Integer paramCount = 0;
            for (Map.Entry<String, String> filter : filters.entrySet()) {
                if (Filter.NAME.toString().equals(filter.getKey().toUpperCase())) {
                    name = filter.getValue();
                    paramCount ++;
                }
                if (Filter.PROBEDATE.toString().equals(filter.getKey().toUpperCase())) {
                    probDate = filter.getValue();
                    paramCount ++;
                }
                if (Filter.PROBEPLACE.toString().equals(filter.getKey().toUpperCase())) {
                    probPlace = filter.getValue();
                    paramCount ++;
                }
                if (Filter.DESCRIPTION.toString().equals(filter.getKey().toUpperCase())) {
                    description = filter.getValue();
                    paramCount ++;
                }
            }
            return materialService.getByFilter(name, probDate, probPlace, description, paramCount);
        } catch (Exception e) {
            return null;
        }

    }

    @RequestMapping("/gethello")
    public String getHello(@RequestParam Map<String, String> params) {
        return "Hello";
    }
}
