package by.grsu.dao.impl;

import by.grsu.dao.AbstractDao;
import by.grsu.dao.ResearchMethodDao;
import by.grsu.entity.ResearchMethod;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by alek on 23.2.17.
 */
@Repository("researchMethodDao")
public class ResearchMethodDaoImpl extends AbstractDao implements ResearchMethodDao {

    @Override
    public void saveResearchMethod(ResearchMethod researchMethod) {
        persist(researchMethod);
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<ResearchMethod> findAllResearchMethods() {
        Criteria criteria = getSession().createCriteria(ResearchMethod.class);
        return (List<ResearchMethod>) criteria.list();
    }

    @Override
    public void deleteResearchMethodById(Integer rmid) {
        Query query = getSession().createSQLQuery("delete from ResearchMethod where rmid = :rmid");
        query.setInteger("rmid", rmid);
        query.executeUpdate();
    }

    @Override
    public ResearchMethod findById(Integer rmid) {
        Criteria criteria = getSession().createCriteria(ResearchMethod.class);
        criteria.add(Restrictions.eq("rmid",rmid));
        return (ResearchMethod) criteria.uniqueResult();
    }

    @Override
    public void updateResearchMethod(ResearchMethod researchMethod) {
        getSession().update(researchMethod);
    }
}
