package by.grsu.service;

import by.grsu.responseModel.ResearchObjectResponse;

import java.util.List;

/**
 * Created by alek on 19.3.17.
 */
public interface ResearchObjectService {

    List<ResearchObjectResponse> getByFilter(String name, String organizationName, String date, String description, Integer paramCount);

    List<ResearchObjectResponse> getAllResearchObjects();

}
