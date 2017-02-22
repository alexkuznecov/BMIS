package by.grsu.dao;

import by.grsu.entity.ResearchMethod;

import java.util.List;

/**
 * Created by alek on 23.2.17.
 */
public interface ResearchMethodDao {

    void saveResearchMethod(ResearchMethod researchMethod);

    List<ResearchMethod> findAllResearchMethods();

    void deleteResearchMethodById(Integer rmid);

    ResearchMethod findById(Integer rmid);

    void updateResearchMethod(ResearchMethod researchMethod);

}
