package by.grsu.dao;

import by.grsu.entity.Spectr;

import java.util.List;

/**
 * Created by alek on 23.2.17.
 */
public interface SpectrDao {

    void saveSpectr(Spectr spectr);

    List<Spectr> findAllSpectrs();

    void deleteSpectrById(Integer spcid);

    Spectr findById(Integer spcid);

    void updateSpectr(Spectr spectr);

}
