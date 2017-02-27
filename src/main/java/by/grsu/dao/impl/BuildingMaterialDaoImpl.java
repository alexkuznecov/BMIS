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
    public void updateBuildingMaterial(BuildingMaterial buildingMaterial) {
        getSession().update(buildingMaterial);
    }
}
