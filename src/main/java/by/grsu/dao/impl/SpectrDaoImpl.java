package by.grsu.dao.impl;

import by.grsu.dao.AbstractDao;
import by.grsu.dao.SpectrDao;
import by.grsu.entity.Spectr;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by alek on 23.2.17.
 */
@Repository("spectrDao")
public class SpectrDaoImpl extends AbstractDao implements SpectrDao {

    @Override
    public void saveSpectr(Spectr spectr) {

    }

    @Override
    public List<Spectr> findAllSpectrs() {
        return null;
    }

    @Override
    public void deleteSpectrById(Integer spcid) {

    }

    @Override
    public Spectr findById(Integer spcid) {
        return null;
    }

    @Override
    public void updateSpectr(Spectr spectr) {

    }
}
