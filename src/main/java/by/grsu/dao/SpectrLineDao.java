package by.grsu.dao;

import by.grsu.entity.SpectrLine;

import java.util.List;

/**
 * Created by alek on 23.2.17.
 */
public interface SpectrLineDao {

    void saveSpectrLine(SpectrLine spectrLine);

    List<SpectrLine> findAllSpectrLines();

    void deleteSpectrLineById(Integer slid);

    SpectrLine findById(Integer slid);

    List<Integer> getIdByName(String name);

    void updateSpectrLine(SpectrLine spectrLine);

}
