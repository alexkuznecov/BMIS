package by.grsu.service.impl;

import by.grsu.converters.EthalonSpectrConverter;
import by.grsu.dao.*;
import by.grsu.dto.EthalonSpectrDTO;
import by.grsu.service.EthalonSpectrService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by alek on 19.3.17.
 */
@Service("ethalonSpectrService")
@Transactional
public class EthalonSpectrServiceImpl implements EthalonSpectrService {

    @Autowired
    private EthalonSpectrDao ethalonSpectrDao;

    @Autowired
    private BuildingMaterialDao buildingMaterialDao;

    @Autowired
    private MaterialDao materialDao;

    @Autowired
    private ChemicalElementDao chemicalElementDao;

    @Autowired
    private SpectrLineDao spectrLineDao;

    @Override
    public List<EthalonSpectrDTO> getByFilter(String waveLength, String buildMaterialName, String materialName, String chemicalElementName, String spectrLinePersonName, Integer paramCount) {

        List<Integer> buildMaterialId = new ArrayList<>();
        List<Integer> materialId = new ArrayList<>();
        List<Integer> chemicalElementId = new ArrayList<>();
        List<Integer> spectrLineId = new ArrayList<>();

        if (!buildMaterialName.equals("")) {
            buildMaterialId = buildingMaterialDao.getIdByName(buildMaterialName);
        }
        if (!materialName.equals("")) {
            materialId = materialDao.getIdByName(materialName);
        }
        if (!chemicalElementName.equals("")) {
            chemicalElementId = chemicalElementDao.getIdByName(chemicalElementName);
        }
        if(!spectrLinePersonName.equals("")) {
            spectrLineId = spectrLineDao.getIdByName(spectrLinePersonName);
        }

        return EthalonSpectrConverter.convertToEthalonSpectrResponse(ethalonSpectrDao.getByVariableParameters(waveLength, buildMaterialId, materialId, chemicalElementId, spectrLineId, paramCount),
                                                        buildingMaterialDao, materialDao, chemicalElementDao, spectrLineDao);
    }

    @Override
    public List<EthalonSpectrDTO> getAllEthalonSpectrs() {

        return EthalonSpectrConverter.convertToEthalonSpectrResponse(ethalonSpectrDao.findAllEthalonSpectrs(),
                                                        buildingMaterialDao, materialDao, chemicalElementDao, spectrLineDao);
    }
}
