package by.grsu.dao;

import by.grsu.entity.MaterialHasQualityStandart;

import java.util.List;

/**
 * Created by alek on 23.2.17.
 */
public interface MaterialHasQualityStandartDao {

    void saveMaterialHasQualityStandart(MaterialHasQualityStandart materialHasQualityStandart);

    List<MaterialHasQualityStandart> findAllMaterialHasQualityStandarts();

    void deleteMaterialHasQualityStandartById(Integer id);

    MaterialHasQualityStandart findById(Integer id);

    void updateMaterialHasQualityStandart(MaterialHasQualityStandart materialHasQualityStandart);

}
