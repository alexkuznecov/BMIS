package by.grsu.dao;

import by.grsu.entity.QualityStandart;

import java.util.List;

/**
 * Created by alek on 23.2.17.
 */
public interface QualityStandartDao {

    void saveQualityStandart(QualityStandart qualityStandart);

    List<QualityStandart> findAllQualityStandarts();

    void deleteQualityStandartById(Integer qsid);

    QualityStandart findById(Integer qsid);

    void updateQualityStandart(QualityStandart QualityStandart);

}
