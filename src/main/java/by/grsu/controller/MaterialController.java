package by.grsu.controller;

import by.grsu.entity.Material;
import by.grsu.enums.MaterialFilter;
import by.grsu.responseModel.MaterialResponse;
import by.grsu.service.MaterialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * Created by alek on 9.3.17.
 */
@RestController
@RequestMapping("/materials")
public class MaterialController {

    @Autowired
    private MaterialService materialService;

    @RequestMapping("/filters")
    public List<MaterialResponse> filter(@RequestParam Map<String, String> filters) {
        try {
            String name = "", probDate = "", probPlace = "", description = "";
            Integer paramCount = 0;
            for (Map.Entry<String, String> filter : filters.entrySet()) {
                if (MaterialFilter.NAME.toString().equals(filter.getKey().toUpperCase())) {
                    name = filter.getValue();
                    paramCount ++;
                }
                if (MaterialFilter.PROBEDATE.toString().equals(filter.getKey().toUpperCase())) {
                    probDate = filter.getValue();
                    paramCount ++;
                }
                if (MaterialFilter.PROBEPLACE.toString().equals(filter.getKey().toUpperCase())) {
                    probPlace = filter.getValue();
                    paramCount ++;
                }
                if (MaterialFilter.DESCRIPTION.toString().equals(filter.getKey().toUpperCase())) {
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
