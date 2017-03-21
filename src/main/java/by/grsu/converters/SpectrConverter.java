package by.grsu.converters;

import by.grsu.dao.ChemicalElementDao;
import by.grsu.dao.ResearchPassportDao;
import by.grsu.dao.SpectrLineDao;
import by.grsu.entity.Spectr;
import by.grsu.responseModel.SpectrResponse;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by alek on 20.3.17.
 */
public class SpectrConverter {

    public static List<SpectrResponse> convertToSpectrResponse(List<Spectr> spectrs, ChemicalElementDao chemicalElementDao,
                                                               ResearchPassportDao researchPassportDao,
                                                               SpectrLineDao spectrLineDao) {

        List<SpectrResponse> spectrResponses = new ArrayList<>();

        for (Spectr spectr : spectrs) {
            SpectrResponse spectrResponse = new SpectrResponse();
            spectrResponse.setChemicalElementName(chemicalElementDao.findById(spectr.getCeid()).getName());
            spectrResponse.setIntensity(researchPassportDao.findById(spectr.getRpid()).getIntensity());
            spectrResponse.setSpectrLineName(spectrLineDao.findById(spectr.getSlid()).getPersonName());
            spectrResponse.setWaveLength(spectr.getWaveLength());
            spectrResponses.add(spectrResponse);
        }

        return spectrResponses;

    }

}
