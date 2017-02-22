package by.grsu.dao.impl;

import by.grsu.dao.AbstractDao;
import by.grsu.dao.SpectrLineDao;
import by.grsu.entity.SpectrLine;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by alek on 23.2.17.
 */
@Repository("spectrLineDao")
public class SpectrLineDaoImpl extends AbstractDao implements SpectrLineDao{

    @Override
    public void saveSpectrLine(SpectrLine spectrLine) {

    }

    @Override
    public List<SpectrLine> findAllSpectrLines() {
        return null;
    }

    @Override
    public void deleteSpectrLineById(Integer slid) {

    }

    @Override
    public SpectrLine findById(Integer slid) {
        return null;
    }

    @Override
    public void updateSpectrLine(SpectrLine spectrLine) {

    }
}
