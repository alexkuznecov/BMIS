package by.grsu.dao.impl;

import by.grsu.dao.AbstractDao;
import by.grsu.dao.MaterialHasQualityStandartDao;
import by.grsu.entity.MaterialHasQualityStandart;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by alek on 23.2.17.
 */
@Repository("materialHasQualityStandartDao")
public class MaterialHasQualityStandartDaoImpl extends AbstractDao implements MaterialHasQualityStandartDao {

    @Override
    public void saveMaterialHasQualityStandart(MaterialHasQualityStandart materialHasQualityStandart) {

    }

    @Override
    public List<MaterialHasQualityStandart> findAllMaterialHasQualityStandarts() {
        return null;
    }

    @Override
    public void deleteMaterialHasQualityStandartById(Integer id) {

    }

    @Override
    public MaterialHasQualityStandart findById(Integer id) {
        return null;
    }

    @Override
    public void updateMaterialHasQualityStandart(MaterialHasQualityStandart materialHasQualityStandart) {

    }
}
