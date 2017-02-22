package by.grsu.dao.impl;

import by.grsu.dao.AbstractDao;
import by.grsu.dao.ResearchPassportDao;
import by.grsu.entity.ResearchPassport;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by alek on 23.2.17.
 */
@Repository("researchPassportDao")
public class ResearchPassprotDaoImpl extends AbstractDao implements ResearchPassportDao {

    @Override
    public void saveResearchPassport(ResearchPassport researchPassport) {

    }

    @Override
    public List<ResearchPassport> findAllResearchPassports() {
        return null;
    }

    @Override
    public void deleteResearchPassportById(Integer rpid) {

    }

    @Override
    public ResearchPassport findById(Integer rpid) {
        return null;
    }

    @Override
    public void updateResearchPassport(ResearchPassport researchPassport) {

    }
}
