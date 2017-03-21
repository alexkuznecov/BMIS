package by.grsu.service.impl;

import by.grsu.responseModel.ResearchObjectResponse;
import by.grsu.service.ResearchObjectService;

import java.util.List;

/**
 * Created by alek on 19.3.17.
 */
public class ResearchObjectServiceImpl implements ResearchObjectService {

    @Override
    public List<ResearchObjectResponse> getByFilter(String name, String organizationName, String date, String description, Integer paramCount) {
        return null;
    }

    @Override
    public List<ResearchObjectResponse> getAllResearchObjects() {
        return null;
    }
}
