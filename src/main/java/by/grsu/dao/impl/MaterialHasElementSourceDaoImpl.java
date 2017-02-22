package by.grsu.dao.impl;

import by.grsu.dao.AbstractDao;
import by.grsu.dao.MaterialHasElementSourceDao;
import by.grsu.entity.MaterialHasElementSource;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by alek on 23.2.17.
 */
@Repository("materialHasElementSourceDao")
public class MaterialHasElementSourceDaoImpl extends AbstractDao implements MaterialHasElementSourceDao {

    @Override
    public void saveMaterialHasElementSource(MaterialHasElementSource materialHasElementSource) {

    }

    @Override
    public List<MaterialHasElementSource> findAllMaterialHasElementSources() {
        return null;
    }

    @Override
    public void deleteMaterialHasElementSourceById(Integer id) {

    }

    @Override
    public MaterialHasElementSource findById(Integer id) {
        return null;
    }

    @Override
    public void updateMaterialHasElementSource(MaterialHasElementSource materialHasElementSource) {

    }
}
