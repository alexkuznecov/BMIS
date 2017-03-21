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
    @SuppressWarnings("unchecked")
    public List<Spectr> getByVariableParameters(String waveLength, Integer researchPassportId, Integer chemicalElementId, Integer spectrLineId, Integer paramCount) {
        StringBuilder queryParameters = new StringBuilder("select * from Spectr where ");
        if (!waveLength.equals("")) {
            queryParameters.append("wave_length like :waveLength");
            paramCount --;
            if (paramCount != 0) {
                queryParameters.append(" and ");
            }
        }
        if (researchPassportId != -1) {
            queryParameters.append("rpid like :researchPassportId");
            paramCount --;
            if (paramCount != 0) {
                queryParameters.append(" and ");
            }
        }
        if (chemicalElementId != -1) {
            queryParameters.append("ceid like :chemicalElementId");
            paramCount --;
            if (paramCount != 0) {
                queryParameters.append(" and ");
            }
        }
        if (spectrLineId != -1) {
            queryParameters.append("slid like :spectrLineId");
            paramCount --;
            if (paramCount != 0) {
                queryParameters.append(" and ");
            }
        }

        Query query = getSession().createSQLQuery(queryParameters.toString()).addEntity(Spectr.class);

        if (!waveLength.equals("")) {
            query.setParameter("waveLength", waveLength + "%");
        }
        if (researchPassportId != -1) {
            query.setParameter("researchPassportId", researchPassportId + "%");
        }
        if (chemicalElementId != -1) {
            query.setParameter("chemicalElementId", chemicalElementId + "%");
        }
        if (spectrLineId != -1) {
            query.setParameter("spectrLineId", spectrLineId + "%");
        }
        System.out.println(query.getQueryString());
        return (List<Spectr>) query.list();
    }

    @Override
    public void updateSpectr(Spectr spectr) {
        getSession().update(spectr);
    }
}
