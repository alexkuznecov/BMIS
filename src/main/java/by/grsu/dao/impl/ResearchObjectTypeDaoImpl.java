package by.grsu.dao.impl;

import by.grsu.dao.AbstractDao;
import by.grsu.dao.ResearchObjectTypeDao;
import by.grsu.entity.ResearchObjectType;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by alek on 23.2.17.
 */
@Repository("researchObjectTypeDao")
public class ResearchObjectTypeDaoImpl extends AbstractDao implements ResearchObjectTypeDao {

    @Override
    public void saveResearchObjectType(ResearchObjectType researchObjectType) {
        persist(researchObjectType);
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<ResearchObjectType> findAllResearchObjectTypes() {
        Criteria criteria = getSession().createCriteria(ResearchObjectType.class);
        return (List<ResearchObjectType>) criteria.list();
    }

    @Override
    public void deleteResearchObjectTypeById(Integer rotid) {
        Query query = getSession().createSQLQuery("delete from ResearchObjectType where rotid = :rotid");
        query.setInteger("rotid", rotid);
        query.executeUpdate();
    }

    @Override
    public ResearchObjectType findById(Integer rotid) {
        Criteria criteria = getSession().createCriteria(ResearchObjectType.class);
        criteria.add(Restrictions.eq("rotid",rotid));
        return (ResearchObjectType) criteria.uniqueResult();
    }

    @Override
    public void updateResearchObjectType(ResearchObjectType researchObjectType) {
        getSession().update(researchObjectType);
    }

    @Override
    public List<Integer> getIdByName(String name) {
        List<Integer> ids = new ArrayList<>();
        Criteria criteria = getSession().createCriteria(ResearchObjectType.class);
        criteria.add(Restrictions.eq("name", name));
        for (ResearchObjectType researchObjectType : (List<ResearchObjectType>) criteria.list()) {
            ids.add(researchObjectType.getRotid());
        }
        return ids;
    }
}
