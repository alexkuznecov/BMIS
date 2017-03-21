package by.grsu.dao.impl;

import by.grsu.dao.AbstractDao;
import by.grsu.dao.ResearchObjectDao;
import by.grsu.entity.Material;
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
    @SuppressWarnings("unchecked")
    public List<ResearchObject> getByVariableParameters(String name, Integer organizationId, String date, String description, Integer paramCount) {
        StringBuilder queryParameters = new StringBuilder("select * from ResearchObject where ");
        if (!name.equals("")) {
            queryParameters.append("name like :name");
            paramCount --;
            if (paramCount != 0) {
                queryParameters.append(" and ");
            }
        }
        if (organizationId != -1) {
            queryParameters.append("oid like :organizationId");
            paramCount --;
            if (paramCount != 0) {
                queryParameters.append(" and ");
            }
        }
        if (!date.equals("")) {
            queryParameters.append("date like :date");
            paramCount --;
            if (paramCount != 0) {
                queryParameters.append(" and ");
            }
        }
        if (!description.equals("")) {
            queryParameters.append("description like :description");
            paramCount --;
            if (paramCount != 0) {
                queryParameters.append(" and ");
            }
        }

        Query query = getSession().createSQLQuery(queryParameters.toString()).addEntity(ResearchObject.class);

        if (!name.equals("")) {
            query.setParameter("name", name + "%");
        }
        if (organizationId != -1) {
            query.setParameter("organizationId", organizationId + "%");
        }
        if (!date.equals("")) {
            query.setParameter("date", date + "%");
        }
        if (!description.equals("")) {
            query.setParameter("description", description + "%");
        }
        System.out.println(query.getQueryString());
        return (List<ResearchObject>) query.list();
    }

    @Override
    public void updateResearchObject(ResearchObject researchObject) {
        getSession().update(researchObject);
    }
}
