package by.grsu.dao.impl;

import by.grsu.dao.AbstractDao;
import by.grsu.dao.ChemicalElementDao;
import by.grsu.entity.ChemicalElement;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by alek on 19.2.17.
 */
@Repository("chemicalElementDao")
public class ChemicalElementDaoImpl extends AbstractDao implements ChemicalElementDao {

    @Override
    public void saveChemicalElement(ChemicalElement chemicalElement) {
        persist(chemicalElement);
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<ChemicalElement> findAllChemicalElement() {
        Criteria criteria = getSession().createCriteria(ChemicalElement.class);
        return (List<ChemicalElement>) criteria.list();
    }

    @Override
    public void deleteChemicalElementById(Integer ceid) {
        Query query = getSession().createSQLQuery("delete from ChemicalElement where ceid = :ceid");
        query.setInteger("ceid", ceid);
        query.executeUpdate();
    }

    @Override
    public ChemicalElement findById(Integer ceid) {
        Criteria criteria = getSession().createCriteria(ChemicalElement.class);
        criteria.add(Restrictions.eq("ceid",ceid));
        return (ChemicalElement) criteria.uniqueResult();
    }

    @Override
    public void updateChemicalElement(ChemicalElement chemicalElement) {
        getSession().update(chemicalElement);
    }

    public String getAll() {
        return "Simple Input";
    }
}
