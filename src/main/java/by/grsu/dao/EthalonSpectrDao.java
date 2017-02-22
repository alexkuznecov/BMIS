package by.grsu.dao;

import by.grsu.entity.EthalonSpectr;

import java.util.List;

/**
 * Created by alek on 23.2.17.
 */
public interface EthalonSpectrDao {

    void saveEthalonSpectr(EthalonSpectr ethalonSpectr);

    List<EthalonSpectr> findAllEthalonSpectrs();

    void deleteEthalonSpectrById(Integer etsid);

    EthalonSpectr findById(Integer etsid);

    void updateEthalonSpectr(EthalonSpectr ethalonSpectr);

}
