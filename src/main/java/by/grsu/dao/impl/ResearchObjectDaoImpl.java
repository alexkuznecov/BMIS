package by.grsu.dao.impl;

import by.grsu.dao.AbstractDao;
import by.grsu.dao.ResearchObjectDao;
import by.grsu.entity.ResearchObject;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by alek on 23.2.17.
 */
@Repository("researchObjectDao")
public class ResearchObjectDaoImpl extends AbstractDao implements ResearchObjectDao {

    @Override
    public void saveResearchObject(ResearchObject researchObject) {
        persist(researchObject);
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<ResearchObject> findAllResearchObjects() {
        Criteria criteria = getSession().createCriteria(ResearchObject.class);
        return (List<ResearchObject>) criteria.list();
    }

    @Override
    public void deleteResearchObjectById(Integer roid) {
        Query query = getSession().createSQLQuery("delete from ResearchObject where roid = :roid");
        query.setInteger("roid", roid);
        query.executeUpdate();
    }

    @Override
    public ResearchObject findById(Integer roid) {
        Criteria criteria = getSession().createCriteria(ResearchObject.class);
        criteria.add(Restrictions.eq("roid",roid));
        return (ResearchObject) criteria.uniqueResult();
    }

    @Override
    public void updateResearchObject(ResearchObject researchObject) {
        getSession().update(researchObject);
    }
}
