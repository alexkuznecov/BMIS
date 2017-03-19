package by.grsu.service.impl;

import by.grsu.converters.MaterialConverter;
import by.grsu.dao.MaterialDao;
import by.grsu.entity.Material;
import by.grsu.responseModel.MaterialResponse;
import by.grsu.service.MaterialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by alek on 8.3.17.
 */
@Service("materialService")
@Transactional
public class MaterialServiceImpl implements MaterialService {

    @Autowired
    private MaterialDao materialDao;

    @Override
    public List<MaterialResponse> getByFilter(String name, String probDate, String probPlace, String description, Integer paramCount) {
        List<Material> materials = materialDao.getByVariableParameters(name, probDate, probPlace, description, paramCount);
        return MaterialConverter.convertToMaterialResponse(materials);
    }

    public List<MaterialResponse> getAllMaterials() {
        return MaterialConverter.convertToMaterialResponse(materialDao.findAllMaterials());
    }
}
