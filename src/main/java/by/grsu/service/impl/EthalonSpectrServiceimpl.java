package by.grsu.service.impl;

import by.grsu.responseModel.EthalonSpectrResponse;
import by.grsu.service.EthalonSpectrService;

import java.util.List;

/**
 * Created by alek on 19.3.17.
 */
public class EthalonSpectrServiceimpl implements EthalonSpectrService {

    @Override
    public List<EthalonSpectrResponse> getByFilter(String waveLength, String buildMaterialName, String materialName, String chemicalElementName, String spectrLinePersonName, Integer paramCount) {
        return null;
    }

    @Override
    public List<EthalonSpectrResponse> getAllEthalonSpectrs() {
        return null;
    }
}
