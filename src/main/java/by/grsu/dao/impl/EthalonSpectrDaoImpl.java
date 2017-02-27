package by.grsu.dao.impl;

import by.grsu.dao.AbstractDao;
import by.grsu.dao.EthalonSpectrDao;
import by.grsu.entity.EthalonSpectr;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by alek on 23.2.17.
 */
@Repository("ethalonSpectrDao")
public class EthalonSpectrDaoImpl extends AbstractDao implements EthalonSpectrDao {

    @Override
    public void saveEthalonSpectr(EthalonSpectr ethalonSpectr) {
        persist(ethalonSpectr);
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<EthalonSpectr> findAllEthalonSpectrs() {
        Criteria criteria = getSession().createCriteria(EthalonSpectr.class);
        return (List<EthalonSpectr>) criteria.list();
    }

    @Override
    public void deleteEthalonSpectrById(Integer etsid) {
        Query query = getSession().createSQLQuery("delete from EthalonSpectr where etsid = :etsid");
        query.setInteger("etsid", etsid);
        query.executeUpdate();
    }

    @Override
    public EthalonSpectr findById(Integer etsid) {
        Criteria criteria = getSession().createCriteria(EthalonSpectr.class);
        criteria.add(Restrictions.eq("etsid",etsid));
        return (EthalonSpectr) criteria.uniqueResult();
    }

    @Override
    public void updateEthalonSpectr(EthalonSpectr ethalonSpectr) {
        getSession().update(ethalonSpectr);
    }
}
