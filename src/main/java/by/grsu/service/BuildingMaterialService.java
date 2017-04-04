package by.grsu.service;

import by.grsu.dto.BuildingMaterialsDTO;

import java.util.List;

/**
 * Created by alek on 19.3.17.
 */
public interface BuildingMaterialService {

    List<BuildingMaterialsDTO> getByFilter(String name, String creationDate, String manufacturerName, String researchObjectTypeName, Integer paramCount);

    List<BuildingMaterialsDTO> getAllBuildingMaterials();

}
