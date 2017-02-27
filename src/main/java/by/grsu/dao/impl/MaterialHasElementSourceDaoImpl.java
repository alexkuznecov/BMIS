package by.grsu.dao.impl;

import by.grsu.dao.AbstractDao;
import by.grsu.dao.MaterialHasElementSourceDao;
import by.grsu.entity.MaterialHasElementSource;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by alek on 23.2.17.
 */
@Repository("materialHasElementSourceDao")
public class MaterialHasElementSourceDaoImpl extends AbstractDao implements MaterialHasElementSourceDao {

    @Override
    public void saveMaterialHasElementSource(MaterialHasElementSource materialHasElementSource) {
        persist(materialHasElementSource);
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<MaterialHasElementSource> findAllMaterialHasElementSources() {
        Criteria criteria = getSession().createCriteria(MaterialHasElementSource.class);
        return (List<MaterialHasElementSource>) criteria.list();
    }

    @Override
    public void deleteMaterialHasElementSourceById(Integer id) {
        Query query = getSession().createSQLQuery("delete from Material_has_ElementSource where id = :id");
        query.setInteger("id", id);
        query.executeUpdate();
    }

    @Override
    public MaterialHasElementSource findById(Integer id) {
        Criteria criteria = getSession().createCriteria(MaterialHasElementSource.class);
        criteria.add(Restrictions.eq("id",id));
        return (MaterialHasElementSource) criteria.uniqueResult();
    }

    @Override
    public void updateMaterialHasElementSource(MaterialHasElementSource materialHasElementSource) {
        getSession().update(materialHasElementSource);
    }
}
