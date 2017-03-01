package by.grsu.dao;

import by.grsu.entity.SpectrLineLibrary;

import java.util.List;

/**
 * Created by alek on 23.2.17.
 */
public interface SpectrLineLibraryDao {

    void saveSpectrLineLibrary(SpectrLineLibrary spectrLineLibrary);

    List<SpectrLineLibrary> findAllSpectrLineLibrarys();

    void deleteSpectrLineLibraryById(Integer sllid);

    SpectrLineLibrary findById(Integer sllid);

    void updateSpectrLineLibrary(SpectrLineLibrary spectrLineLibrary);

}
