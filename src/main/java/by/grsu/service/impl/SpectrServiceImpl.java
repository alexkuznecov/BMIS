package by.grsu.service.impl;

import by.grsu.responseModel.SpectrResponse;
import by.grsu.service.SpectrService;

import java.util.List;

/**
 * Created by alek on 19.3.17.
 */
public class SpectrServiceImpl implements SpectrService {

    @Override
    public List<SpectrResponse> getByFilter(String waveLength, String intensity, String chemicalElementName, String spectrLineName, Integer paramCount) {
        return null;
    }

    @Override
    public List<SpectrResponse> getAllSpectrs() {
        return null;
    }
}
