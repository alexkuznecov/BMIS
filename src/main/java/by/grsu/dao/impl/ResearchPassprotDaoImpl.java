package by.grsu.dao.impl;

import by.grsu.dao.AbstractDao;
import by.grsu.dao.ResearchPassportDao;
import by.grsu.entity.ResearchPassport;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by alek on 23.2.17.
 */
@Repository("researchPassportDao")
public class ResearchPassprotDaoImpl extends AbstractDao implements ResearchPassportDao {

    @Override
    public void saveResearchPassport(ResearchPassport researchPassport) {
        persist(researchPassport);
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<ResearchPassport> findAllResearchPassports() {
        Criteria criteria = getSession().createCriteria(ResearchPassport.class);
        return (List<ResearchPassport>) criteria.list();
    }

    @Override
    public void deleteResearchPassportById(Integer rpid) {
        Query query = getSession().createSQLQuery("delete from ResearchPassport where rpid = :rpid");
        query.setInteger("rpid", rpid);
        query.executeUpdate();
    }

    @Override
    public Integer getIdByIntencity(String intensity) {
        Query query = getSession().createSQLQuery("select rpid from ResearchPassport where intensity = :intensity");
        query.setString("intensity", intensity);
        return query.getFirstResult();
    }

    @Override
    public ResearchPassport findById(Integer rpid) {
        Criteria criteria = getSession().createCriteria(ResearchPassport.class);
        criteria.add(Restrictions.eq("rpid",rpid));
        return (ResearchPassport) criteria.uniqueResult();
    }

    @Override
    public void updateResearchPassport(ResearchPassport researchPassport) {
        getSession().update(researchPassport);
    }
}
