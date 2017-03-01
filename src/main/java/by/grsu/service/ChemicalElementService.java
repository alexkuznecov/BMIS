package by.grsu.service;

import by.grsu.entity.ChemicalElement;

import java.util.List;

/**
 * Created by alek on 15.2.17.
 */
public interface ChemicalElementService {

    void saveChemicalElement(ChemicalElement chemicalElement);

    void saveChemicalElements(List<ChemicalElement> chemicalElements);

    List<ChemicalElement> findAllChemicalElement();

    void deleteChemicalElementById(Integer id);

    ChemicalElement findById(Integer id);

    void updateChemicalElement(ChemicalElement chemicalElement);

    String getAll();

}
