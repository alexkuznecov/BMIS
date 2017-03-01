package by.grsu.dao.impl;

import by.grsu.dao.AbstractDao;
import by.grsu.dao.SpectrLineDao;
import by.grsu.entity.SpectrLine;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by alek on 23.2.17.
 */
@Repository("spectrLineDao")
public class SpectrLineDaoImpl extends AbstractDao implements SpectrLineDao{

    @Override
    public void saveSpectrLine(SpectrLine spectrLine) {
        persist(spectrLine);
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<SpectrLine> findAllSpectrLines() {
        Criteria criteria = getSession().createCriteria(SpectrLine.class);
        return (List<SpectrLine>) criteria.list();
    }

    @Override
    public void deleteSpectrLineById(Integer slid) {
        Query query = getSession().createSQLQuery("delete from SpectrLine where slid = :slid");
        query.setInteger("slid", slid);
        query.executeUpdate();
    }

    @Override
    public SpectrLine findById(Integer slid) {
        Criteria criteria = getSession().createCriteria(SpectrLine.class);
        criteria.add(Restrictions.eq("slid",slid));
        return (SpectrLine) criteria.uniqueResult();
    }

    @Override
    public void updateSpectrLine(SpectrLine spectrLine) {
        getSession().update(spectrLine);
    }
}
