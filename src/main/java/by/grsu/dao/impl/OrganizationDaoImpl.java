package by.grsu.dao.impl;

import by.grsu.dao.AbstractDao;
import by.grsu.dao.OrganizationDao;
import by.grsu.entity.Organization;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by alek on 23.2.17.
 */
@Repository("organizationDao")
public class OrganizationDaoImpl extends AbstractDao implements OrganizationDao {

    @Override
    public void saveOrganization(Organization organization) {

    }

    @Override
    public List<Organization> findAllOrganizations() {
        return null;
    }

    @Override
    public void deleteOrganizationById(Integer oid) {

    }

    @Override
    public Organization findById(Integer oid) {
        return null;
    }

    @Override
    public void updateOrganization(Organization organization) {

    }
}
