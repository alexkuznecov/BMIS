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

    List<EthalonSpectr> getByVariableParameters(String waveLength, Integer buildMaterialId, Integer materialId, Integer chemicalElementId,  Integer spectrLineId, Integer paramCount);

    void updateEthalonSpectr(EthalonSpectr ethalonSpectr);

}
