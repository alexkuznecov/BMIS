package by.grsu.service.impl;

import by.grsu.converters.ResearchObjectConverter;
import by.grsu.dao.OrganizationDao;
import by.grsu.dao.ResearchObjectDao;
import by.grsu.dto.ResearchObjectDTO;
import by.grsu.service.ResearchObjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by alek on 19.3.17.
 */
@Service("researchObjectService")
@Transactional
public class ResearchObjectServiceImpl implements ResearchObjectService {

    @Autowired
    private ResearchObjectDao researchObjectDao;

    @Autowired
    private OrganizationDao organizationDao;

    @Override
    public List<ResearchObjectDTO> getByFilter(String name, String organizationName, String date, String description, Integer paramCount) {

        List<Integer> organizationId = new ArrayList<>();

        if (!organizationName.equals("")) {
            organizationId = organizationDao.getIdByName(organizationName);
        }

        return ResearchObjectConverter.convertToResearchObjectResponse(researchObjectDao.getByVariableParameters(name, organizationId, date, description, paramCount),
                                                                                    organizationDao);
    }

    @Override
    public List<ResearchObjectDTO> getAllResearchObjects() {
        return ResearchObjectConverter.convertToResearchObjectResponse(researchObjectDao.findAllResearchObjects(), organizationDao);
    }
}
