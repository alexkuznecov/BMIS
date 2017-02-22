package by.grsu.dao;

import by.grsu.entity.Material;

import java.util.List;

/**
 * Created by alek on 23.2.17.
 */
public interface MaterialDao {

    void saveMaterial(Material material);

    List<Material> findAllMaterials();

    void deleteMaterialById(Integer mid);

    Material findById(Integer mid);

    void updateMaterial(Material material);

}
