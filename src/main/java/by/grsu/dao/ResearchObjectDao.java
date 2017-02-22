package by.grsu.dao;

import by.grsu.entity.ResearchObject;

import java.util.List;

/**
 * Created by alek on 23.2.17.
 */
public interface ResearchObjectDao {

    void saveResearchObject(ResearchObject researchObject);

    List<ResearchObject> findAllResearchObjects();

    void deleteResearchObjectById(Integer roid);

    ResearchObject findById(Integer roid);

    void updateResearchObject(ResearchObject researchObject);

}
