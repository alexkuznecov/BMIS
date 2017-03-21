package by.grsu.controller;

import by.grsu.enums.Filter;
import by.grsu.responseModel.BuildingMaterialsResponse;
import by.grsu.service.BuildingMaterialService;
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
@RequestMapping("/bmaterials")
public class BuildingMaterialsController {

    @Autowired
    private BuildingMaterialService buildingMaterialService;

    @RequestMapping("/all")
    public List<BuildingMaterialsResponse> getAll() {
        return buildingMaterialService.getAllBuildingMaterials();
    }

    @RequestMapping("/filters")
    public List<BuildingMaterialsResponse> getByFilters(@RequestParam Map<String, String> filters) {
        try {
            String name = "", creationDate = "", manufactorerName = "", researchObjectTypeName = "";
            Integer paramCount = 0;
            for (Map.Entry<String, String> filter : filters.entrySet()) {
                if (Filter.NAME.toString().equals(filter.getKey().toUpperCase())) {
                    name = filter.getValue();
                    paramCount ++;
                }
                if (Filter.CREATIONDATE.toString().equals(filter.getKey().toUpperCase())) {
                    creationDate = filter.getValue();
                    paramCount ++;
                }
                if (Filter.MANUFACTORERNAME.toString().equals(filter.getKey().toUpperCase())) {
                    manufactorerName = filter.getValue();
                    paramCount ++;
                }
                if (Filter.RESEARCHOBJECTTYPENAME.toString().equals(filter.getKey().toUpperCase())) {
                    researchObjectTypeName = filter.getValue();
                    paramCount ++;
                }
            }
            return buildingMaterialService.getByFilter(name, creationDate, manufactorerName, researchObjectTypeName, paramCount);
        } catch (Exception e) {
            return null;
        }
    }
}
