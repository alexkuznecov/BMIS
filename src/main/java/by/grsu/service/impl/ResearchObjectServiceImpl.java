package by.grsu.service.impl;

import by.grsu.converters.ResearchObjectConverter;
import by.grsu.dao.OrganizationDao;
import by.grsu.dao.ResearchObjectDao;
import by.grsu.responseModel.ResearchObjectResponse;
import by.grsu.service.ResearchObjectService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by alek on 19.3.17.
 */
public class ResearchObjectServiceImpl implements ResearchObjectService {

    @Autowired
    private ResearchObjectDao researchObjectDao;

    @Autowired
    private OrganizationDao organizationDao;

    @Override
    public List<ResearchObjectResponse> getByFilter(String name, String organizationName, String date, String description, Integer paramCount) {

        Integer organizationId = -1;

        if (!organizationName.equals("")) {
            organizationId = organizationDao.getIdByName(organizationName);
        }

        return ResearchObjectConverter.convertToResearchObjectResponse(researchObjectDao.getByVariableParameters(name, organizationId, date, description, paramCount),
                                                                                    organizationDao);
    }

    @Override
    public List<ResearchObjectResponse> getAllResearchObjects() {
        return null;
    }
}
