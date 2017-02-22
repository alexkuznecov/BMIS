package by.grsu.dao.impl;

import by.grsu.dao.AbstractDao;
import by.grsu.dao.BuildingMaterialDao;
import by.grsu.entity.BuildingMaterial;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by alek on 23.2.17.
 */
@Repository("buildingMaterialDao")
public class BuildingMaterialDaoImpl extends AbstractDao implements BuildingMaterialDao {

    @Override
    public void saveBuildingMaterial(BuildingMaterial buildingMaterial) {

    }

    @Override
    public List<BuildingMaterial> findAllBuildingMaterials() {
        return null;
    }

    @Override
    public void deleteBuildingMaterialById(Integer bmid) {

    }

    @Override
    public BuildingMaterial findById(Integer bmid) {
        return null;
    }

    @Override
    public void updateBuildingMaterial(BuildingMaterial buildingMaterial) {

    }
}
