package by.grsu.controller;

import by.grsu.entity.ChemicalElement;
import by.grsu.service.ChemicalElementService;
import org.springframework.beans.factory.ListableBeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by alek on 2.3.17.
 */
@RestController
public class ChemicalElementController {

    @Autowired
    ChemicalElementService chemicalElementService;

    /**
     * Controller
     * @param id
     * @return one chemical element
     */
    @RequestMapping("/getChemicalElements/{id}")
    public ChemicalElement getChemicalElement(@PathVariable Integer id) {
        return chemicalElementService.findById(id);
    }

    @RequestMapping("/getChemicalElements")
    public List<ChemicalElement> getChemicalElements() {
        return chemicalElementService.findAllChemicalElement();
    }

}
