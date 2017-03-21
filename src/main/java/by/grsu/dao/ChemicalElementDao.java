package by.grsu.dao;

import by.grsu.entity.ChemicalElement;

import java.util.List;

public interface ChemicalElementDao {

    void saveChemicalElement(ChemicalElement chemicalElement);

    List<ChemicalElement> findAllChemicalElement();

    void deleteChemicalElementById(Integer ceid);

    ChemicalElement findById(Integer ceid);

    void updateChemicalElement(ChemicalElement chemicalElement);

    Integer getIdByName(String name);

    String getAll();

}
