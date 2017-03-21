package by.grsu.converters;

import by.grsu.dao.ManufacturerDao;
import by.grsu.dao.ResearchObjectTypeDao;
import by.grsu.entity.BuildingMaterial;
import by.grsu.responseModel.BuildingMaterialsResponse;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by alek on 20.3.17.
 */
public class BuildingMaterialConverter {

    public static List<BuildingMaterialsResponse> convertToBuildingMaterialResponse(List<BuildingMaterial> buildingMaterials,
                                                                                    ManufacturerDao manufacturerDao,
                                                                                    ResearchObjectTypeDao researchObjectTypeDao) {
        List<BuildingMaterialsResponse> buildingMaterialsResponses = new ArrayList<>();

        for (BuildingMaterial buildingMaterial : buildingMaterials) {
            BuildingMaterialsResponse buildingMaterialsResponse = new BuildingMaterialsResponse();
            buildingMaterialsResponse.setName(buildingMaterial.getShortName());
            buildingMaterialsResponse.setCreationDate(buildingMaterial.getYear());
            buildingMaterialsResponse.setManufactorerName(manufacturerDao.findById(buildingMaterial.getMnfid()).getName());
            buildingMaterialsResponse.setResearchObjectTypeName(researchObjectTypeDao.findById(buildingMaterial.getRotid()).getName());
            buildingMaterialsResponses.add(buildingMaterialsResponse);
        }

        return buildingMaterialsResponses;

    }

}
