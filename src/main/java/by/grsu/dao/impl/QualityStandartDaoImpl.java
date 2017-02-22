package by.grsu.dao.impl;

import by.grsu.dao.AbstractDao;
import by.grsu.dao.QualityStandartDao;
import by.grsu.entity.QualityStandart;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by alek on 23.2.17.
 */
@Repository("qualityStandartDao")
public class QualityStandartDaoImpl extends AbstractDao implements QualityStandartDao {

    @Override
    public void saveQualityStandart(QualityStandart qualityStandart) {

    }

    @Override
    public List<QualityStandart> findAllQualityStandarts() {
        return null;
    }

    @Override
    public void deleteQualityStandartById(Integer qsid) {

    }

    @Override
    public QualityStandart findById(Integer qsid) {
        return null;
    }

    @Override
    public void updateQualityStandart(QualityStandart QualityStandart) {

    }
}
