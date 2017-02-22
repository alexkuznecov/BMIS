package by.grsu.dao.impl;

import by.grsu.dao.AbstractDao;
import by.grsu.dao.ResearchObjectDao;
import by.grsu.entity.ResearchObject;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by alek on 23.2.17.
 */
@Repository("researchObjectDao")
public class ResearchObjectDaoImpl extends AbstractDao implements ResearchObjectDao {

    @Override
    public void saveResearchObject(ResearchObject researchObject) {

    }

    @Override
    public List<ResearchObject> findAllResearchObjects() {
        return null;
    }

    @Override
    public void deleteResearchObjectById(Integer roid) {

    }

    @Override
    public ResearchObject findById(Integer roid) {
        return null;
    }

    @Override
    public void updateResearchObject(ResearchObject researchObject) {

    }
}
