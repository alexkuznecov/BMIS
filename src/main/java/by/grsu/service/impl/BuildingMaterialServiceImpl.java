package by.grsu.service.impl;

import by.grsu.converters.BuildingMaterialConverter;
import by.grsu.dao.BuildingMaterialDao;
import by.grsu.dao.ManufacturerDao;
import by.grsu.dao.ResearchObjectDao;
import by.grsu.dao.ResearchObjectTypeDao;
import by.grsu.entity.BuildingMaterial;
import by.grsu.entity.ResearchObject;
import by.grsu.responseModel.BuildingMaterialsResponse;
import by.grsu.service.BuildingMaterialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by alek on 19.3.17.
 */
@Service("buildingMaterialService")
@Transactional
public class BuildingMaterialServiceImpl implements BuildingMaterialService {

    @Autowired
    private ManufacturerDao manufacturerDao;

    @Autowired
    private ResearchObjectTypeDao researchObjectTypeDao;

    @Autowired
    private BuildingMaterialDao buildingMaterialDao;

    @Override
    public List<BuildingMaterialsResponse> getByFilter(String name, String creationDate, String manufacturerName, String researchObjectTypeName, Integer paramCount) {

        Integer manufacturerId = -1, researchObjectId = -1;

        if (!manufacturerName.equals("")) {
            manufacturerId = manufacturerDao.getIdByName(manufacturerName);
        }
        if (!researchObjectTypeName.equals("")) {
            researchObjectId = researchObjectTypeDao.getIdByName(researchObjectTypeName);
        }

        return BuildingMaterialConverter.convertToBuildingMaterialResponse(buildingMaterialDao.getByVariableParameters(name, creationDate, manufacturerId, researchObjectId, paramCount),
                                                                                manufacturerDao, researchObjectTypeDao);
    }

    @Override
    public List<BuildingMaterialsResponse> getAllBuildingMaterials() {
        return null;
    }
}
