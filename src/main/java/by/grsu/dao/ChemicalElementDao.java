package by.grsu.dao;

import by.grsu.entity.ChemicalElement;

import java.util.List;

public interface ChemicalElementDao {

    void saveChemicalElement(ChemicalElement chemicalElement);

    List<ChemicalElement> findAllChemicalElement();

    void deleteChemicalElementById(Integer id);

    ChemicalElement findById(Integer id);

    void updateChemicalElement(ChemicalElement chemicalElement);

    String getAll();

}
