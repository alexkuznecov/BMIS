package by.grsu.converters;

import by.grsu.dao.ChemicalElementDao;
import by.grsu.dao.ResearchPassportDao;
import by.grsu.dao.SpectrLineDao;
import by.grsu.entity.Spectr;
import by.grsu.dto.SpectrDTO;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by alek on 20.3.17.
 */
public class SpectrConverter {

    public static List<SpectrDTO> convertToSpectrResponse(List<Spectr> spectrs, ChemicalElementDao chemicalElementDao,
                                                          ResearchPassportDao researchPassportDao,
                                                          SpectrLineDao spectrLineDao) {

        List<SpectrDTO> spectrDTOS = new ArrayList<>();

        for (Spectr spectr : spectrs) {
            SpectrDTO spectrDTO = new SpectrDTO();
            spectrDTO.setChemicalElementName(chemicalElementDao.findById(spectr.getCeid()).getName());
            spectrDTO.setIntensity(researchPassportDao.findById(spectr.getRpid()).getIntensity());
            spectrDTO.setSpectrLineName(spectrLineDao.findById(spectr.getSlid()).getPersonName());
            spectrDTO.setWaveLength(spectr.getWaveLength());
            spectrDTOS.add(spectrDTO);
        }

        return spectrDTOS;

    }

}
