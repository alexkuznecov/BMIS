package by.grsu.dao.impl;

import by.grsu.dao.AbstractDao;
import by.grsu.dao.ManufacturerDao;
import by.grsu.entity.Manufacturer;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by alek on 23.2.17.
 */
@Repository("manufacturerDao")
public class ManufacturerDaoImpl extends AbstractDao implements ManufacturerDao {

    @Override
    public void saveManufacturer(Manufacturer manufacturer) {
        persist(manufacturer);
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<Manufacturer> findAllManufacturers() {
        Criteria criteria = getSession().createCriteria(Manufacturer.class);
        return (List<Manufacturer>) criteria.list();
    }

    @Override
    public void deleteManufacturerById(Integer mnfid) {
        Query query = getSession().createSQLQuery("delete from Manufacturer where mnfid = :mnfid");
        query.setInteger("mnfid", mnfid);
        query.executeUpdate();
    }

    @Override
    public Manufacturer findById(Integer mnfid) {
        Criteria criteria = getSession().createCriteria(Manufacturer.class);
        criteria.add(Restrictions.eq("mnfid",mnfid));
        return (Manufacturer) criteria.uniqueResult();
    }

    @Override
    public void updateManufacturer(Manufacturer manufacturer) {
        getSession().update(manufacturer);
    }

    @Override
    public List<Integer> getIdByName(String name) {
        List<Integer> ids = new ArrayList<>();
        Criteria criteria = getSession().createCriteria(Manufacturer.class);
        criteria.add(Restrictions.eq("name", name));
        for (Manufacturer manufacturer : (List<Manufacturer>) criteria.list()) {
            ids.add(manufacturer.getMnfid());
        }
        return ids;
    }
}
