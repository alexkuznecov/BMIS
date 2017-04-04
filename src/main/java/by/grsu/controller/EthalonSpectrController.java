package by.grsu.controller;

import by.grsu.enums.Filter;
import by.grsu.dto.EthalonSpectrDTO;
import by.grsu.service.EthalonSpectrService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * Created by alek on 19.3.17.
 */
@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/etspectrs")
public class EthalonSpectrController {

    @Autowired
    private EthalonSpectrService ethalonSpectrService;

    @RequestMapping("/all")
    public List<EthalonSpectrDTO> getAll() {
        return ethalonSpectrService.getAllEthalonSpectrs();
    }

    @RequestMapping("/filters")
    public List<EthalonSpectrDTO> getByFilters(@RequestParam Map<String, String> filters) {
        try {
            String waveLength = "", buildMaterialName = "", materialName = "", chemicalElementName = "", spectrLinePersonName = "";
            Integer paramCount = 0;
            for (Map.Entry<String, String> filter : filters.entrySet()) {
                if (Filter.WAVELENGTH.toString().equals(filter.getKey().toUpperCase())) {
                    waveLength = filter.getValue();
                    paramCount ++;
                }
                if (Filter.BUILDMATERIALNAME.toString().equals(filter.getKey().toUpperCase())) {
                    buildMaterialName = filter.getValue();
                    paramCount ++;
                }
                if (Filter.MATERIALNAME.toString().equals(filter.getKey().toUpperCase())) {
                    materialName = filter.getValue();
                    paramCount ++;
                }
                if (Filter.CHEMICALELEMENTNAME.toString().equals(filter.getKey().toUpperCase())) {
                    chemicalElementName = filter.getValue();
                    paramCount ++;
                }
                if (Filter.SPECTRLINEPERSONNAME.toString().equals(filter.getKey().toUpperCase())) {
                    spectrLinePersonName = filter.getValue();
                    paramCount ++;
                }
            }
            return ethalonSpectrService.getByFilter(waveLength, buildMaterialName, materialName, chemicalElementName, spectrLinePersonName, paramCount);
        } catch (Exception e) {
            return null;
        }
    }
}
