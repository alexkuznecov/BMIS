package by.grsu.dao.impl;

import by.grsu.dao.AbstractDao;
import by.grsu.dao.OrganizationDao;
import by.grsu.entity.Organization;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by alek on 23.2.17.
 */
@Repository("organizationDao")
public class OrganizationDaoImpl extends AbstractDao implements OrganizationDao {

    @Override
    public void saveOrganization(Organization organization) {
        persist(organization);
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<Organization> findAllOrganizations() {
        Criteria criteria = getSession().createCriteria(Organization.class);
        return (List<Organization>) criteria.list();
    }

    @Override
    public void deleteOrganizationById(Integer oid) {
        Query query = getSession().createSQLQuery("delete from Organization where oid = :oid");
        query.setInteger("oid", oid);
        query.executeUpdate();
    }

    @Override
    public Integer getIdByName(String name) {
        Query query = getSession().createSQLQuery("select oid from Organization where full_title = :name");
        query.setString("name", name);
        return query.getFirstResult();
    }

    @Override
    public Organization findById(Integer oid) {
        Criteria criteria = getSession().createCriteria(Organization.class);
        criteria.add(Restrictions.eq("oid",oid));
        return (Organization) criteria.uniqueResult();
    }

    @Override
    public void updateOrganization(Organization organization) {
        getSession().update(organization);
    }
}
