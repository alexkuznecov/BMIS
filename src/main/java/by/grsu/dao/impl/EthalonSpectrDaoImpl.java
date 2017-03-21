package by.grsu.dao.impl;

import by.grsu.dao.AbstractDao;
import by.grsu.dao.EthalonSpectrDao;
import by.grsu.entity.BuildingMaterial;
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
    @SuppressWarnings("unchecked")
    public List<EthalonSpectr> getByVariableParameters(String waveLength, Integer buildMaterialId, Integer materialId, Integer chemicalElementId,  Integer spectrLineId, Integer paramCount) {
        StringBuilder queryParameters = new StringBuilder("select * from EthalonSpectr where ");
        if (!waveLength.equals("")) {
            queryParameters.append("wave_length like :waveLength");
            paramCount --;
            if (paramCount != 0) {
                queryParameters.append(" and ");
            }
        }
        if (buildMaterialId != -1) {
            queryParameters.append("bmid like :buildMaterialId");
            paramCount --;
            if (paramCount != 0) {
                queryParameters.append(" and ");
            }
        }
        if (materialId != -1) {
            queryParameters.append("mid like :materialId");
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

        Query query = getSession().createSQLQuery(queryParameters.toString()).addEntity(EthalonSpectr.class);

        if (!waveLength.equals("")) {
            query.setParameter("waveLength", waveLength + "%");
        }
        if (buildMaterialId != -1) {
            query.setParameter("buildMaterialId", buildMaterialId + "%");
        }
        if (materialId != -1) {
            query.setParameter("materialId", materialId + "%");
        }
        if (chemicalElementId != -1) {
            query.setParameter("chemicalElementId", chemicalElementId + "%");
        }
        if (spectrLineId != -1) {
            query.setParameter("spectrLineId", spectrLineId + "%");
        }
        System.out.println(query.getQueryString());
        return (List<EthalonSpectr>) query.list();
    }

    @Override
    public void updateEthalonSpectr(EthalonSpectr ethalonSpectr) {
        getSession().update(ethalonSpectr);
    }
}
