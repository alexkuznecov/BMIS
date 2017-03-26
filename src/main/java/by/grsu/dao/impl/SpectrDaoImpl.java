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
    public List<Spectr> getByVariableParameters(String waveLength, List<Integer> researchPassportId, List<Integer> chemicalElementId, List<Integer> spectrLineId, Integer paramCount) {
        StringBuilder queryParameters = new StringBuilder("select * from Spectr where ");
        if (!waveLength.equals("")) {
            queryParameters.append("wave_length like :waveLength");
            paramCount --;
            if (paramCount != 0) {
                queryParameters.append(" and ");
            }
        }
        if (researchPassportId.size() != 0) {
            int size = researchPassportId.size();
            for (int i = 0; i < size; i++) {
                queryParameters.append("rpid like :researchPassportId");
                queryParameters.append(i);
                if (i != size-1) {
                    queryParameters.append(" or ");
                }
            }
            paramCount --;
            if (paramCount != 0) {
                queryParameters.append(" and ");
            }
        }
        if (chemicalElementId.size() != 0) {
            int size = chemicalElementId.size();
            for (int i = 0; i < size; i++) {
                queryParameters.append("ceid like :chemicalElementId");
                queryParameters.append(i);
                if (i != size -1) {
                    queryParameters.append(" or ");
                }
            }
            paramCount --;
            if (paramCount != 0) {
                queryParameters.append(" and ");
            }
        }
        if (spectrLineId.size() != 0) {
            int size = spectrLineId.size();
            for (int i = 0; i < size; i++) {
                queryParameters.append("slid like :spectrLineId");
                queryParameters.append(i);
                if (i != size - 1) {
                    queryParameters.append(" or ");
                }
            }
            paramCount --;
            if (paramCount != 0) {
                queryParameters.append(" and ");
            }
        }

        Query query = getSession().createSQLQuery(queryParameters.toString()).addEntity(Spectr.class);

        if (!waveLength.equals("")) {
            query.setParameter("waveLength", waveLength + "%");
        }
        if (researchPassportId.size() != 0) {
            int size = researchPassportId.size();
            for (int i = 0; i < size; i++) {
                query.setParameter("researchPassportId" + i, researchPassportId.get(i) + "%");
            }
        }
        if (chemicalElementId.size() != 0) {
            int size = chemicalElementId.size();
            for (int i = 0; i < size; i++) {
                query.setParameter("chemicalElementId" + i, chemicalElementId.get(i) + "%");
            }
        }
        if (spectrLineId.size() != 0) {
            int size = spectrLineId.size();
            for (int i = 0; i < size; i++) {
                query.setParameter("spectrLineId" + i, spectrLineId.get(i) + "%");
            }
        }
        System.out.println(query.getQueryString());
        return (List<Spectr>) query.list();
    }

    @Override
    public void updateSpectr(Spectr spectr) {
        getSession().update(spectr);
    }
}
