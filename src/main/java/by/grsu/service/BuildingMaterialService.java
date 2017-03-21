package by.grsu.service;

import by.grsu.responseModel.BuildingMaterialsResponse;

import java.util.List;

/**
 * Created by alek on 19.3.17.
 */
public interface BuildingMaterialService {

    List<BuildingMaterialsResponse> getByFilter(String name, String creationDate, String manufacturerName, String researchObjectTypeName, Integer paramCount);

    List<BuildingMaterialsResponse> getAllBuildingMaterials();

}
