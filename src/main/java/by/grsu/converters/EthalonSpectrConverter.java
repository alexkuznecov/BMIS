package by.grsu.converters;

import by.grsu.dao.BuildingMaterialDao;
import by.grsu.dao.ChemicalElementDao;
import by.grsu.dao.MaterialDao;
import by.grsu.dao.SpectrLineDao;
import by.grsu.entity.EthalonSpectr;
import by.grsu.responseModel.EthalonSpectrResponse;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by alek on 20.3.17.
 */
public class EthalonSpectrConverter {

    public static List<EthalonSpectrResponse> convertToEthalonSpectrResponse(List<EthalonSpectr> ethalonSpectrs,
                                                                             BuildingMaterialDao buildingMaterialDao,
                                                                             MaterialDao materialDao, ChemicalElementDao chemicalElementDao,
                                                                             SpectrLineDao spectrLineDao) {

        List<EthalonSpectrResponse> ethalonSpectrResponses = new ArrayList<>();

        for (EthalonSpectr ethalonSpectr : ethalonSpectrs) {
            EthalonSpectrResponse ethalonSpectrResponse = new EthalonSpectrResponse();
            ethalonSpectrResponse.setWaveLength(ethalonSpectr.getWaveLength());
            ethalonSpectrResponse.setBuildMaterialName(buildingMaterialDao.findById(ethalonSpectr.getBmid()).getShortName());
            ethalonSpectrResponse.setChemicalElementName(chemicalElementDao.findById(ethalonSpectr.getCeid()).getName());
            ethalonSpectrResponse.setMaterialName(materialDao.findById(ethalonSpectr.getMid()).getName());
            ethalonSpectrResponse.setSpectrLinePersonName(spectrLineDao.findById(ethalonSpectr.getSlid()).getPersonName());
            ethalonSpectrResponses.add(ethalonSpectrResponse);
        }

        return ethalonSpectrResponses;

    }

}
