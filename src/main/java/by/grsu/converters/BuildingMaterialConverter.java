package by.grsu.converters;

import by.grsu.dao.ManufacturerDao;
import by.grsu.dao.ResearchObjectTypeDao;
import by.grsu.entity.BuildingMaterial;
import by.grsu.dto.BuildingMaterialsDTO;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by alek on 20.3.17.
 */
public class BuildingMaterialConverter {

    public static List<BuildingMaterialsDTO> convertToBuildingMaterialResponse(List<BuildingMaterial> buildingMaterials,
                                                                               ManufacturerDao manufacturerDao,
                                                                               ResearchObjectTypeDao researchObjectTypeDao) {
        List<BuildingMaterialsDTO> buildingMaterialsDTOS = new ArrayList<>();

        for (BuildingMaterial buildingMaterial : buildingMaterials) {
            BuildingMaterialsDTO buildingMaterialsDTO = new BuildingMaterialsDTO();
            buildingMaterialsDTO.setName(buildingMaterial.getShortName());
            buildingMaterialsDTO.setCreationDate(buildingMaterial.getYear());
            buildingMaterialsDTO.setManufactorerName(manufacturerDao.findById(buildingMaterial.getMnfid()).getName());
            buildingMaterialsDTO.setResearchObjectTypeName(researchObjectTypeDao.findById(buildingMaterial.getRotid()).getName());
            buildingMaterialsDTOS.add(buildingMaterialsDTO);
        }

        return buildingMaterialsDTOS;

    }

}
