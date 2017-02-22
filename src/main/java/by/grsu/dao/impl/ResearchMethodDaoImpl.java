package by.grsu.dao.impl;

import by.grsu.dao.AbstractDao;
import by.grsu.dao.ResearchMethodDao;
import by.grsu.entity.ResearchMethod;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by alek on 23.2.17.
 */
@Repository("researchMethodDao")
public class ResearchMethodDaoImpl extends AbstractDao implements ResearchMethodDao {

    @Override
    public void saveResearchMethod(ResearchMethod researchMethod) {

    }

    @Override
    public List<ResearchMethod> findAllResearchMethods() {
        return null;
    }

    @Override
    public void deleteResearchMethodById(Integer rmid) {

    }

    @Override
    public ResearchMethod findById(Integer rmid) {
        return null;
    }

    @Override
    public void updateResearchMethod(ResearchMethod researchMethod) {

    }
}
