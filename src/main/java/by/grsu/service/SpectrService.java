package by.grsu.service;

import by.grsu.responseModel.SpectrResponse;

import java.util.List;

/**
 * Created by alek on 19.3.17.
 */
public interface SpectrService {

    List<SpectrResponse> getByFilter(String waveLength, String intensity, String chemicalElementName, String spectrLineName , Integer paramCount);

    List<SpectrResponse> getAllSpectrs();

}
