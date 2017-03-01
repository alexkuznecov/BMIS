package by.grsu.dao.impl;

import by.grsu.dao.AbstractDao;
import by.grsu.dao.SpectrLineLibraryDao;
import by.grsu.entity.SpectrLineLibrary;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by alek on 23.2.17.
 */
@Repository("spectrLineLibraryDao")
public class SpectrLineLibraryDaoImpl extends AbstractDao implements SpectrLineLibraryDao {

    @Override
    public void saveSpectrLineLibrary(SpectrLineLibrary spectrLineLibrary) {
        persist(spectrLineLibrary);
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<SpectrLineLibrary> findAllSpectrLineLibrarys() {
        Criteria criteria = getSession().createCriteria(SpectrLineLibrary.class);
        return (List<SpectrLineLibrary>) criteria.list();
    }

    @Override
    public void deleteSpectrLineLibraryById(Integer sllid) {
        Query query = getSession().createSQLQuery("delete from SpectrLineLibrary where sllid = :sllid");
        query.setInteger("sllid", sllid);
        query.executeUpdate();
    }

    @Override
    public SpectrLineLibrary findById(Integer sllid) {
        Criteria criteria = getSession().createCriteria(SpectrLineLibrary.class);
        criteria.add(Restrictions.eq("sllid",sllid));
        return (SpectrLineLibrary) criteria.uniqueResult();
    }

    @Override
    public void updateSpectrLineLibrary(SpectrLineLibrary spectrLineLibrary) {
        getSession().update(spectrLineLibrary);
    }
}
