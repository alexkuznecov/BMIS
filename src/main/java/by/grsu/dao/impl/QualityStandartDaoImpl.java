package by.grsu.dao.impl;

import by.grsu.dao.AbstractDao;
import by.grsu.dao.QualityStandartDao;
import by.grsu.entity.QualityStandart;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by alek on 23.2.17.
 */
@Repository("qualityStandartDao")
public class QualityStandartDaoImpl extends AbstractDao implements QualityStandartDao {

    @Override
    public void saveQualityStandart(QualityStandart qualityStandart) {
        persist(qualityStandart);
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<QualityStandart> findAllQualityStandarts() {
        Criteria criteria = getSession().createCriteria(QualityStandart.class);
        return (List<QualityStandart>) criteria.list();
    }

    @Override
    public void deleteQualityStandartById(Integer qsid) {
        Query query = getSession().createSQLQuery("delete from QualityStandart where qsid = :qsid");
        query.setInteger("qsid", qsid);
        query.executeUpdate();
    }

    @Override
    public QualityStandart findById(Integer qsid) {
        Criteria criteria = getSession().createCriteria(QualityStandart.class);
        criteria.add(Restrictions.eq("qsid",qsid));
        return (QualityStandart) criteria.uniqueResult();
    }

    @Override
    public void updateQualityStandart(QualityStandart qualityStandart) {
        getSession().update(qualityStandart);
    }
}
