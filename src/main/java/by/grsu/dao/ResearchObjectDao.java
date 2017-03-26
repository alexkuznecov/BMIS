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

    List<ResearchObject> getByVariableParameters(String name, List<Integer> organizationId, String date, String description, Integer paramCount);

    void updateResearchObject(ResearchObject researchObject);

}
