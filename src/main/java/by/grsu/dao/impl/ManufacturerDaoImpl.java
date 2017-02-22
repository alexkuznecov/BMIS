package by.grsu.dao.impl;

import by.grsu.dao.AbstractDao;
import by.grsu.dao.ManufacturerDao;
import by.grsu.entity.Manufacturer;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by alek on 23.2.17.
 */
@Repository("manufacturerDao")
public class ManufacturerDaoImpl extends AbstractDao implements ManufacturerDao {

    @Override
    public void saveManufacturer(Manufacturer manufacturer) {

    }

    @Override
    public List<Manufacturer> findAllManufacturers() {
        return null;
    }

    @Override
    public void deleteManufacturerById(Integer mnfid) {

    }

    @Override
    public Manufacturer findById(Integer mnfid) {
        return null;
    }

    @Override
    public void updateManufacturer(Manufacturer manufacturer) {

    }
}
