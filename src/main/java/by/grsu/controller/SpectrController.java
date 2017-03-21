package by.grsu.controller;

import by.grsu.enums.Filter;
import by.grsu.responseModel.SpectrResponse;
import by.grsu.service.SpectrService;
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
@RequestMapping("/spectra")
public class SpectrController {

    @Autowired
    private SpectrService spectrService;

    @RequestMapping("/all")
    public List<SpectrResponse> getAll() {
        return spectrService.getAllSpectrs();
    }

    @RequestMapping("/filters")
    public List<SpectrResponse> getByFilters(@RequestParam Map<String, String> filters) {
        try {
            String waveLength = "", intensity = "", chemicalElementName = "", spectrLineName = "";
            Integer paramCount = 0;
            for (Map.Entry<String, String> filter : filters.entrySet()) {
                if (Filter.WAVELENGTH.toString().equals(filter.getKey().toUpperCase())) {
                    waveLength = filter.getValue();
                    paramCount++;
                }
                if (Filter.INTENSITY.toString().equals(filter.getKey().toUpperCase())) {
                    intensity = filter.getValue();
                    paramCount++;
                }
                if (Filter.CHEMICALELEMENTNAME.toString().equals(filter.getKey().toUpperCase())) {
                    chemicalElementName = filter.getValue();
                    paramCount++;
                }
                if (Filter.SPECTRLINENAME.toString().equals(filter.getKey().toUpperCase())) {
                    spectrLineName = filter.getValue();
                    paramCount++;
                }
            }
            return spectrService.getByFilter(waveLength, intensity, chemicalElementName, spectrLineName, paramCount);
        } catch (Exception e) {
            return null;
        }
    }
}
