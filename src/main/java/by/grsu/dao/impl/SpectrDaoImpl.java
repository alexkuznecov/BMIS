package by.grsu.dao.impl;

import by.grsu.dao.AbstractDao;
import by.grsu.dao.SpectrDao;
import by.grsu.entity.Spectr;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by alek on 23.2.17.
 */
@Repository("spectrDao")
public class SpectrDaoImpl extends AbstractDao implements SpectrDao {

    @Override
    public void saveSpectr(Spectr spectr) {
        persist(spectr);
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<Spectr> findAllSpectrs() {
        Criteria criteria = getSession().createCriteria(Spectr.class);
        return (List<Spectr>) criteria.list();
    }

    @Override
    public void deleteSpectrById(Integer spcid) {
        Query query = getSession().createSQLQuery("delete from Spectr where spcid = :spcid");
        query.setInteger("spcid", spcid);
        query.executeUpdate();
    }

    @Override
    public Spectr findById(Integer spcid) {
        Criteria criteria = getSession().createCriteria(Spectr.class);
        criteria.add(Restrictions.eq("spcid",spcid));
        return (Spectr) criteria.uniqueResult();
    }

    @Override
    public void updateSpectr(Spectr spectr) {
        getSession().update(spectr);
    }
}
