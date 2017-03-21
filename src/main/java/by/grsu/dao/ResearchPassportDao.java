package by.grsu.dao;

import by.grsu.entity.ResearchPassport;

import java.util.List;

/**
 * Created by alek on 23.2.17.
 */
public interface ResearchPassportDao {

    void saveResearchPassport(ResearchPassport researchPassport);

    List<ResearchPassport> findAllResearchPassports();

    void deleteResearchPassportById(Integer rpid);

    ResearchPassport findById(Integer rpid);

    Integer getIdByIntencity(String intensity);

    void updateResearchPassport(ResearchPassport researchPassport);

}
