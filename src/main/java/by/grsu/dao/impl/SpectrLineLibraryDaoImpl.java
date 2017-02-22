package by.grsu.dao.impl;

import by.grsu.dao.AbstractDao;
import by.grsu.dao.SpectrLineLibraryDao;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by alek on 23.2.17.
 */
@Repository("spectrLineLibraryDao")
public class SpectrLineLibraryDaoImpl extends AbstractDao implements SpectrLineLibraryDao{

    @Override
    public void saveSpectrLineLibrary(SpectrLineLibraryDao spectrLineLibrary) {

    }

    @Override
    public List<SpectrLineLibraryDao> findAllSpectrLineLibrarys() {
        return null;
    }

    @Override
    public void deleteSpectrLineLibraryById(Integer sllid) {

    }

    @Override
    public SpectrLineLibraryDao findById(Integer sllid) {
        return null;
    }

    @Override
    public void updateSpectrLineLibrary(SpectrLineLibraryDao spectrLineLibrary) {

    }
}
