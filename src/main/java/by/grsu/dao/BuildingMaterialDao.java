package by.grsu.dao;

import by.grsu.entity.BuildingMaterial;

import java.util.List;

/**
 * Created by alek on 23.2.17.
 */
public interface BuildingMaterialDao {

    void saveBuildingMaterial(BuildingMaterial buildingMaterial);

    List<BuildingMaterial> findAllBuildingMaterials();

    void deleteBuildingMaterialById(Integer bmid);

    BuildingMaterial findById(Integer bmid);

    void updateBuildingMaterial(BuildingMaterial buildingMaterial);

    List<BuildingMaterial> getByVariableParameters(String name, String creationDate, Integer manufacturerId, Integer researchObjectTypeId, Integer paramCount);

}
