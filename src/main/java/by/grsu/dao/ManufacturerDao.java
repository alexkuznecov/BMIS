package by.grsu.dao;

import by.grsu.entity.Manufacturer;

import java.util.List;

/**
 * Created by alek on 23.2.17.
 */
public interface ManufacturerDao {

    void saveManufacturer(Manufacturer manufacturer);

    List<Manufacturer> findAllManufacturers();

    void deleteManufacturerById(Integer mnfid);

    Manufacturer findById(Integer mnfid);

    List<Integer> getIdByName(String name);

    void updateManufacturer(Manufacturer manufacturer);

}
