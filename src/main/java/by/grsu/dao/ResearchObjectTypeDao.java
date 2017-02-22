package by.grsu.dao;

import by.grsu.entity.ResearchObjectType;

import java.util.List;

/**
 * Created by alek on 23.2.17.
 */
public interface ResearchObjectTypeDao {

    void saveResearchObjectType(ResearchObjectType researchObjectType);

    List<ResearchObjectType> findAllResearchObjectTypes();

    void deleteResearchObjectTypeById(Integer mgid);

    ResearchObjectType findById(Integer mgid);

    void updateResearchObjectType(ResearchObjectType researchObjectType);

}
