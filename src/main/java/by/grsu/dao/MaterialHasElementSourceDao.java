package by.grsu.dao;

import by.grsu.entity.MaterialHasElementSource;

import java.util.List;

/**
 * Created by alek on 23.2.17.
 */
public interface MaterialHasElementSourceDao {

    void saveMaterialHasElementSource(MaterialHasElementSource materialHasElementSource);

    List<MaterialHasElementSource> findAllMaterialHasElementSources();

    void deleteMaterialHasElementSourceById(Integer id);

    MaterialHasElementSource findById(Integer id);

    void updateMaterialHasElementSource(MaterialHasElementSource materialHasElementSource);

}
