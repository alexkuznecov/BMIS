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
    public List<EthalonSpectr> getByVariableParameters(String waveLength, List<Integer> buildMaterialId, List<Integer> materialId, List<Integer> chemicalElementId,  List<Integer> spectrLineId, Integer paramCount) {
        StringBuilder queryParameters = new StringBuilder("select * from EthalonSpectr where ");
        if (!waveLength.equals("")) {
            queryParameters.append("wave_length like :waveLength");
            paramCount --;
            if (paramCount != 0) {
                queryParameters.append(" and ");
            }
        }
        if (buildMaterialId.size() != 0) {
            int size = buildMaterialId.size();
            for (int i = 0; i < size; i++) {
                queryParameters.append("bmid like :buildMaterial");
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
        if (materialId.size() != 0) {
            int size = materialId.size();
            for (int i = 0; i < size; i++) {
                queryParameters.append("mid like :materialId");
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
        if (chemicalElementId.size() != 0) {
            int size = chemicalElementId.size();
            for (int i = 0; i < size; i++) {
                queryParameters.append("ceid like :chemicalElementId");
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
        if (spectrLineId.size() != 0) {
            int size = spectrLineId.size();
            for (int i = 0; i <size; i++) {
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

        Query query = getSession().createSQLQuery(queryParameters.toString()).addEntity(EthalonSpectr.class);

        if (!waveLength.equals("")) {
            query.setParameter("waveLength", waveLength + "%");
        }
        if (buildMaterialId.size() != 0) {
            int size = buildMaterialId.size();
            for (int i = 0; i < size; i++) {
                query.setParameter("buildMaterialId" + i, buildMaterialId.get(i) + "%");
            }
        }
        if (materialId.size() != 0) {
            int size = materialId.size();
            for (int i = 0; i < size; i++) {
                query.setParameter("materialId" + i, materialId.get(i) + "%");
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
        return (List<EthalonSpectr>) query.list();
    }

    @Override
    public void updateEthalonSpectr(EthalonSpectr ethalonSpectr) {
        getSession().update(ethalonSpectr);
    }
}
