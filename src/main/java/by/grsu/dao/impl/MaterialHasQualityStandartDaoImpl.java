package by.grsu.dao.impl;

import by.grsu.dao.AbstractDao;
import by.grsu.dao.MaterialHasQualityStandartDao;
import by.grsu.entity.MaterialHasQualityStandart;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by alek on 23.2.17.
 */
@Repository("materialHasQualityStandartDao")
public class MaterialHasQualityStandartDaoImpl extends AbstractDao implements MaterialHasQualityStandartDao {

    @Override
    public void saveMaterialHasQualityStandart(MaterialHasQualityStandart materialHasQualityStandart) {
        persist(materialHasQualityStandart);
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<MaterialHasQualityStandart> findAllMaterialHasQualityStandarts() {
        Criteria criteria = getSession().createCriteria(MaterialHasQualityStandart.class);
        return (List<MaterialHasQualityStandart>) criteria.list();
    }

    @Override
    public void deleteMaterialHasQualityStandartById(Integer id) {
        Query query = getSession().createSQLQuery("delete from Material_has_QualityStandart where id = :id");
        query.setInteger("id", id);
        query.executeUpdate();
    }

    @Override
    public MaterialHasQualityStandart findById(Integer id) {
        Criteria criteria = getSession().createCriteria(MaterialHasQualityStandart.class);
        criteria.add(Restrictions.eq("id",id));
        return (MaterialHasQualityStandart) criteria.uniqueResult();
    }

    @Override
    public void updateMaterialHasQualityStandart(MaterialHasQualityStandart materialHasQualityStandart) {
        getSession().update(materialHasQualityStandart);
    }
}
