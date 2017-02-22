package by.grsu.dao.impl;

import by.grsu.dao.AbstractDao;
import by.grsu.dao.ResearchObjectTypeDao;
import by.grsu.entity.ResearchObjectType;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by alek on 23.2.17.
 */
@Repository("researchObjectTypeDao")
public class ResearchObjectTypeDaoImpl extends AbstractDao implements ResearchObjectTypeDao {

    @Override
    public void saveResearchObjectType(ResearchObjectType researchObjectType) {

    }

    @Override
    public List<ResearchObjectType> findAllResearchObjectTypes() {
        return null;
    }

    @Override
    public void deleteResearchObjectTypeById(Integer mgid) {

    }

    @Override
    public ResearchObjectType findById(Integer mgid) {
        return null;
    }

    @Override
    public void updateResearchObjectType(ResearchObjectType researchObjectType) {

    }
}
