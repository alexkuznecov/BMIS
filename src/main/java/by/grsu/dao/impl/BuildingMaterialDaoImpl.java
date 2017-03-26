package by.grsu.dao.impl;

import by.grsu.dao.AbstractDao;
import by.grsu.dao.BuildingMaterialDao;
import by.grsu.entity.BuildingMaterial;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by alek on 23.2.17.
 */
@Repository("buildingMaterialDao")
public class BuildingMaterialDaoImpl extends AbstractDao implements BuildingMaterialDao {

    @Override
    public void saveBuildingMaterial(BuildingMaterial buildingMaterial) {
        persist(buildingMaterial);
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<BuildingMaterial> findAllBuildingMaterials() {
        Criteria criteria = getSession().createCriteria(BuildingMaterial.class);
        return (List<BuildingMaterial>) criteria.list();
    }

    @Override
    public void deleteBuildingMaterialById(Integer bmid) {
        Query query = getSession().createSQLQuery("delete from BuildingMaterial where bmid = :bmid");
        query.setInteger("bmid", bmid);
        query.executeUpdate();
    }

    @Override
    public BuildingMaterial findById(Integer bmid) {
        Criteria criteria = getSession().createCriteria(BuildingMaterial.class);
        criteria.add(Restrictions.eq("bmid",bmid));
        return (BuildingMaterial) criteria.uniqueResult();
    }

    @Override
    public List<Integer> getIdByName(String name) {
        List<Integer> ids = new ArrayList<>();
        Criteria criteria = getSession().createCriteria(BuildingMaterial.class);
        criteria.add(Restrictions.eq("shortName", name));
        for (BuildingMaterial buildingMaterial : (List<BuildingMaterial>)criteria.list()) {
            ids.add(buildingMaterial.getBmid());
        }
        return ids;
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<BuildingMaterial> getByVariableParameters(String name, String creationDate, List<Integer> manufacturerId, List<Integer> researchObjectTypeId, Integer paramCount) {
        StringBuilder queryParameters = new StringBuilder("select * from BuildingMaterial where ");
        if (!name.equals("")) {
            queryParameters.append("short_name like :name");
            paramCount --;
            if (paramCount != 0) {
                queryParameters.append(" and ");
            }
        }
        if (!creationDate.equals("")) {
            queryParameters.append("made_year like :made_year");
            paramCount --;
            if (paramCount != 0) {
                queryParameters.append(" and ");
            }
        }
        if (manufacturerId.size() != 0) {
            int size = manufacturerId.size();
            for (int i = 0; i < size; i++) {
                queryParameters.append("mnfid like :mnfid");
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
        if (researchObjectTypeId.size() != 0) {
            int size = researchObjectTypeId.size();
            for (int i = 0; i < size; i++) {
                queryParameters.append("rotid like :rotid");
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

        Query query = getSession().createSQLQuery(queryParameters.toString()).addEntity(BuildingMaterial.class);

        if (!name.equals("")) {
            query.setParameter("name", name + "%");
        }
        if (!creationDate.equals("")) {
            query.setParameter("made_year", creationDate + "%");
        }
        if (manufacturerId.size() != 0) {
            int size = manufacturerId.size();
            for (int i = 0; i < size; i++) {
                query.setParameter("mnfid" + i, manufacturerId.get(i) + "%");
            }
        }
        if (researchObjectTypeId.size() != 0) {
            int size = researchObjectTypeId.size();
            for (int i = 0; i < size; i++) {
                query.setParameter("rotid" + i, researchObjectTypeId.get(i) + "%");
            }
        }
        System.out.println(query.getQueryString());
        return (List<BuildingMaterial>) query.list();
    }

    @Override
    public void updateBuildingMaterial(BuildingMaterial buildingMaterial) {
        getSession().update(buildingMaterial);
    }
}
