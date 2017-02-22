package by.grsu.dao.impl;

import by.grsu.dao.AbstractDao;
import by.grsu.dao.MaterialDao;
import by.grsu.entity.Material;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by alek on 23.2.17.
 */
@Repository("materialDao")
public class MaterialDaoImpl extends AbstractDao implements MaterialDao {

    @Override
    public void saveMaterial(Material material) {

    }

    @Override
    public List<Material> findAllMaterials() {
        return null;
    }

    @Override
    public void deleteMaterialById(Integer mid) {

    }

    @Override
    public Material findById(Integer mid) {
        return null;
    }

    @Override
    public void updateMaterial(Material material) {

    }
}
