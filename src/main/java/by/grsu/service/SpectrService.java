package by.grsu.service;

import by.grsu.dto.SpectrDTO;

import java.util.List;

/**
 * Created by alek on 19.3.17.
 */
public interface SpectrService {

    List<SpectrDTO> getByFilter(String waveLength, String intensity, String chemicalElementName, String spectrLineName , Integer paramCount);

    List<SpectrDTO> getAllSpectrs();

}
