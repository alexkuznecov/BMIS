package by.grsu.service.impl;

import by.grsu.dao.ChemicalElementDao;
import by.grsu.entity.ChemicalElement;
import by.grsu.service.ChemicalElementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by alek on 15.2.17.
 */
@Service("chemicalElementService")
@Transactional
public class ChemicalElementServiceImpl implements ChemicalElementService {
    @Autowired
    private ChemicalElementDao dao;

    public void saveChemicalElement(ChemicalElement chemicalElement) {
        dao.saveChemicalElement(chemicalElement);
    }

    public List<ChemicalElement> findAllChemicalElement() {
        return dao.findAllChemicalElement();
    }

    public void deleteChemicalElementById(Integer id) {
        dao.deleteChemicalElementById(id);
    }

    public ChemicalElement findById(Integer id) {
        return dao.findById(id);
    }

    public void updateChemicalElement(ChemicalElement chemicalElement){
        dao.updateChemicalElement(chemicalElement);
    }

    public String getAll() {
        return dao.getAll();
    }
}
