package by.grsu.controller;

import by.grsu.enums.Filter;
import by.grsu.responseModel.ResearchObjectResponse;
import by.grsu.service.ResearchObjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * Created by alek on 19.3.17.
 */
@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/resobjects")
public class ResearchObjectController {

    @Autowired
    private ResearchObjectService researchObjectService;

    @RequestMapping("/all")
    public List<ResearchObjectResponse> getAll() {
        return researchObjectService.getAllResearchObjects();
    }

    @RequestMapping("/filters")
    public List<ResearchObjectResponse> getByFilters(@RequestParam Map<String, String> filters) {
        try {
            String name = "", organizationName = "", date = "", description = "";
            Integer paramCount = 0;
            for (Map.Entry<String, String> filter : filters.entrySet()) {
                if (Filter.NAME.toString().equals(filter.getKey().toUpperCase())) {
                    name = filter.getValue();
                    paramCount ++;
                }
                if (Filter.ORGANIZATIONNAME.toString().equals(filter.getKey().toUpperCase())) {
                    organizationName = filter.getValue();
                    paramCount ++;
                }
                if (Filter.DATE.toString().equals(filter.getKey().toUpperCase())) {
                    date = filter.getValue();
                    paramCount ++;
                }
                if (Filter.DESCRIPTION.toString().equals(filter.getKey().toUpperCase())) {
                    description = filter.getValue();
                    paramCount ++;
                }
            }
            return researchObjectService.getByFilter(name, organizationName, date, description, paramCount);
        } catch (Exception e) {
            return null;
        }
    }
}
