package by.grsu.service;

import by.grsu.dto.EthalonSpectrDTO;

import java.util.List;

/**
 * Created by alek on 19.3.17.
 */
public interface EthalonSpectrService {

    List<EthalonSpectrDTO> getByFilter(String waveLength, String buildMaterialName, String materialName, String chemicalElementName, String spectrLinePersonName , Integer paramCount);

    List<EthalonSpectrDTO> getAllEthalonSpectrs();

}
