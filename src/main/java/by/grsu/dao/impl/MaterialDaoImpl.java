package by.grsu.dao.impl;

import by.grsu.dao.AbstractDao;
import by.grsu.dao.MaterialDao;
import by.grsu.entity.Material;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by alek on 23.2.17.
 */
@Repository("materialDao")
public class MaterialDaoImpl extends AbstractDao implements MaterialDao {

    @Override
    public void saveMaterial(Material material) {
        persist(material);
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<Material> findAllMaterials() {
        Criteria criteria = getSession().createCriteria(Material.class);
        return (List<Material>) criteria.list();
    }

    @Override
    public void deleteMaterialById(Integer mid) {
        Query query = getSession().createSQLQuery("delete from Material where mid = :mid");
        query.setInteger("mid", mid);
        query.executeUpdate();
    }

    @Override
    public Material findById(Integer mid) {
        Criteria criteria = getSession().createCriteria(Material.class);
        criteria.add(Restrictions.eq("mid",mid));
        return (Material) criteria.uniqueResult();
    }

    @Override
    public void updateMaterial(Material material) {
        getSession().update(material);
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<Material> getByVariableParameters(String name, String probeDate, String probePlace, String description, Integer paramCount) {
        StringBuilder queryParameters = new StringBuilder("select * from Material where ");
        if (!name.equals("")) {
            queryParameters.append("name like :name");
            paramCount --;
            if (paramCount != 0) {
                queryParameters.append(" and ");
            }
        }
        if (!probeDate.equals("")) {
            queryParameters.append("probe_date like :probeDate");
            paramCount --;
            if (paramCount != 0) {
                queryParameters.append(" and ");
            }
        }
        if (!probePlace.equals("")) {
            queryParameters.append("probe_place like :probePlace");
            paramCount --;
            if (paramCount != 0) {
                queryParameters.append(" and ");
            }
        }
        if (!description.equals("")) {
            queryParameters.append("description like :description");
            paramCount --;
            if (paramCount != 0) {
                queryParameters.append(" and ");
            }
        }

        Query query = getSession().createSQLQuery(queryParameters.toString()).addEntity(Material.class);

        if (!name.equals("")) {
            query.setParameter("name", name + "%");
        }
        if (!probeDate.equals("")) {
            query.setParameter("probeDate", probeDate + "%");
        }
        if (!probePlace.equals("")) {
            query.setParameter("probePlace", probePlace + "%");
        }
        if (!description.equals("")) {
            query.setParameter("description", description + "%");
        }
        System.out.println(query.getQueryString());
        return (List<Material>) query.list();
    }
}
