package by.grsu.dao.impl;

import by.grsu.dao.AbstractDao;
import by.grsu.dao.BuildingMaterialDao;
import by.grsu.entity.BuildingMaterial;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

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
    public Integer getIdByName(String name) {
        Query query = getSession().createSQLQuery("select bmid from BuildingMaterial where short_name = :name");
        query.setString("name", name);
        return query.getFirstResult();
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<BuildingMaterial> getByVariableParameters(String name, String creationDate, Integer manufacturerId, Integer researchObjectTypeId, Integer paramCount) {
        StringBuilder queryParameters = new StringBuilder("select * from BuildingMaterial where ");
        if (!name.equals("")) {
            queryParameters.append("name like :name");
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
        if (manufacturerId != -1) {
            queryParameters.append("mnfid like :mnfid");
            paramCount --;
            if (paramCount != 0) {
                queryParameters.append(" and ");
            }
        }
        if (researchObjectTypeId != -1) {
            queryParameters.append("rotid like :rotid");
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
        if (manufacturerId != -1) {
            query.setParameter("mnfid", manufacturerId + "%");
        }
        if (researchObjectTypeId != -1) {
            query.setParameter("rotid", researchObjectTypeId + "%");
        }
        System.out.println(query.getQueryString());
        return (List<BuildingMaterial>) query.list();
    }

    @Override
    public void updateBuildingMaterial(BuildingMaterial buildingMaterial) {
        getSession().update(buildingMaterial);
    }
}
