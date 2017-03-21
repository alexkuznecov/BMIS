package by.grsu.converters;

import by.grsu.dao.OrganizationDao;
import by.grsu.entity.ResearchObject;
import by.grsu.responseModel.ResearchObjectResponse;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by alek on 20.3.17.
 */
public class ResearchObjectConverter {

    public static List<ResearchObjectResponse> convertToResearchObjectResponse(List<ResearchObject> researchObjects, OrganizationDao organizationDao) {

        List<ResearchObjectResponse> researchObjectResponses = new ArrayList<>();

        for (ResearchObject researchObject : researchObjects) {
            ResearchObjectResponse researchObjectResponse = new ResearchObjectResponse();
            researchObjectResponse.setName(researchObject.getName());
            researchObjectResponse.setDescription(researchObject.getDescription());
            researchObjectResponse.setDate(researchObject.getDate());
            researchObjectResponse.setOrganizationName(organizationDao.findById(researchObject.getOid()).getFullTitle());
            researchObjectResponses.add(researchObjectResponse);
        }
        return researchObjectResponses;

    }

}
