package by.grsu.converters;

import by.grsu.dao.BuildingMaterialDao;
import by.grsu.dao.ChemicalElementDao;
import by.grsu.dao.MaterialDao;
import by.grsu.dao.SpectrLineDao;
import by.grsu.entity.EthalonSpectr;
import by.grsu.dto.EthalonSpectrDTO;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by alek on 20.3.17.
 */
public class EthalonSpectrConverter {

    public static List<EthalonSpectrDTO> convertToEthalonSpectrResponse(List<EthalonSpectr> ethalonSpectrs,
                                                                        BuildingMaterialDao buildingMaterialDao,
                                                                        MaterialDao materialDao, ChemicalElementDao chemicalElementDao,
                                                                        SpectrLineDao spectrLineDao) {

        List<EthalonSpectrDTO> ethalonSpectrDTOS = new ArrayList<>();

        for (EthalonSpectr ethalonSpectr : ethalonSpectrs) {
            EthalonSpectrDTO ethalonSpectrDTO = new EthalonSpectrDTO();
            ethalonSpectrDTO.setWaveLength(ethalonSpectr.getWaveLength());
            ethalonSpectrDTO.setBuildMaterialName(buildingMaterialDao.findById(ethalonSpectr.getBmid()).getShortName());
            ethalonSpectrDTO.setChemicalElementName(chemicalElementDao.findById(ethalonSpectr.getCeid()).getName());
            ethalonSpectrDTO.setMaterialName(materialDao.findById(ethalonSpectr.getMid()).getName());
            ethalonSpectrDTO.setSpectrLinePersonName(spectrLineDao.findById(ethalonSpectr.getSlid()).getPersonName());
            ethalonSpectrDTOS.add(ethalonSpectrDTO);
        }

        return ethalonSpectrDTOS;

    }

}
