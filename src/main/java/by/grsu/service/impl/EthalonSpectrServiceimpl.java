package by.grsu.service.impl;

import by.grsu.converters.EthalonSpectrConverter;
import by.grsu.dao.*;
import by.grsu.entity.BuildingMaterial;
import by.grsu.responseModel.EthalonSpectrResponse;
import by.grsu.service.EthalonSpectrService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by alek on 19.3.17.
 */
public class EthalonSpectrServiceimpl implements EthalonSpectrService {

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
    public List<EthalonSpectrResponse> getByFilter(String waveLength, String buildMaterialName, String materialName, String chemicalElementName, String spectrLinePersonName, Integer paramCount) {

        Integer buildMaterialId = -1, materialId = -1, chemicalElementId = -1, spectrLineId = -1;

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
    public List<EthalonSpectrResponse> getAllEthalonSpectrs() {
        return null;
    }
}
