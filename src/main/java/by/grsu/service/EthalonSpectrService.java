package by.grsu.service;

import by.grsu.responseModel.EthalonSpectrResponse;

import java.util.List;

/**
 * Created by alek on 19.3.17.
 */
public interface EthalonSpectrService {

    List<EthalonSpectrResponse> getByFilter(String waveLength, String buildMaterialName, String materialName, String chemicalElementName, String spectrLinePersonName ,Integer paramCount);

    List<EthalonSpectrResponse> getAllEthalonSpectrs();

}
