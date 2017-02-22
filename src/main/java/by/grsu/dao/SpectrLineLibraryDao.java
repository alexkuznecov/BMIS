package by.grsu.dao;

import java.util.List;

/**
 * Created by alek on 23.2.17.
 */
public interface SpectrLineLibraryDao {

    void saveSpectrLineLibrary(SpectrLineLibraryDao spectrLineLibrary);

    List<SpectrLineLibraryDao> findAllSpectrLineLibrarys();

    void deleteSpectrLineLibraryById(Integer sllid);

    SpectrLineLibraryDao findById(Integer sllid);

    void updateSpectrLineLibrary(SpectrLineLibraryDao spectrLineLibrary);

}
