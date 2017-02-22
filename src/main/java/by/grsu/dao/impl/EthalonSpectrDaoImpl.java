package by.grsu.dao.impl;

import by.grsu.dao.AbstractDao;
import by.grsu.dao.EthalonSpectrDao;
import by.grsu.entity.EthalonSpectr;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by alek on 23.2.17.
 */
@Repository("ethalonSpectrDao")
public class EthalonSpectrDaoImpl extends AbstractDao implements EthalonSpectrDao {

    @Override
    public void saveEthalonSpectr(EthalonSpectr ethalonSpectr) {

    }

    @Override
    public List<EthalonSpectr> findAllEthalonSpectrs() {
        return null;
    }

    @Override
    public void deleteEthalonSpectrById(Integer etsid) {

    }

    @Override
    public EthalonSpectr findById(Integer etsid) {
        return null;
    }

    @Override
    public void updateEthalonSpectr(EthalonSpectr ethalonSpectr) {

    }
}
