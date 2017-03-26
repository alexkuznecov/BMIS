package by.grsu.dao;

import by.grsu.entity.Organization;

import java.util.List;

/**
 * Created by alek on 23.2.17.
 */
public interface OrganizationDao {

    void saveOrganization(Organization organization);

    List<Organization> findAllOrganizations();

    void deleteOrganizationById(Integer oid);

    Organization findById(Integer oid);

    List<Integer> getIdByName(String name);

    void updateOrganization(Organization organization);

}
