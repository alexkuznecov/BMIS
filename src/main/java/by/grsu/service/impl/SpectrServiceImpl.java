package by.grsu.service.impl;

import by.grsu.converters.SpectrConverter;
import by.grsu.dao.ChemicalElementDao;
import by.grsu.dao.ResearchPassportDao;
import by.grsu.dao.SpectrDao;
import by.grsu.dao.SpectrLineDao;
import by.grsu.entity.ResearchPassport;
import by.grsu.responseModel.SpectrResponse;
import by.grsu.service.SpectrService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by alek on 19.3.17.
 */
@Service("spectrService")
@Transactional
public class SpectrServiceImpl implements SpectrService {

    @Autowired
    private SpectrDao spectrDao;

    @Autowired
    private ChemicalElementDao chemicalElementDao;

    @Autowired
    private ResearchPassportDao researchPassportDao;

    @Autowired
    private SpectrLineDao spectrLineDao;

    @Override
    public List<SpectrResponse> getByFilter(String waveLength, String intensity, String chemicalElementName, String spectrLineName, Integer paramCount) {

        List<Integer> chemicalElementId = new ArrayList<>();
        List<Integer> researchPassportId = new ArrayList<>();
        List<Integer> spectrLineId = new ArrayList<>();

        if (!chemicalElementName.equals("")) {
            chemicalElementId = chemicalElementDao.getIdByName(chemicalElementName);
        }
        if (!intensity.equals("")) {
            researchPassportId = researchPassportDao.getIdByIntencity(intensity);
        }
        if (!spectrLineName.equals("")) {
            spectrLineId = spectrLineDao.getIdByName(spectrLineName);
        }

        return SpectrConverter.convertToSpectrResponse(spectrDao.getByVariableParameters(waveLength, researchPassportId, chemicalElementId, spectrLineId, paramCount),
                                                        chemicalElementDao, researchPassportDao, spectrLineDao);
    }

    @Override
    public List<SpectrResponse> getAllSpectrs() {

        return SpectrConverter.convertToSpectrResponse(spectrDao.findAllSpectrs(), chemicalElementDao, researchPassportDao, spectrLineDao);

    }
}
