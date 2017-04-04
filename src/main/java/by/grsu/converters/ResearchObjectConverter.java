package by.grsu.converters;

import by.grsu.dao.OrganizationDao;
import by.grsu.entity.ResearchObject;
import by.grsu.dto.ResearchObjectDTO;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by alek on 20.3.17.
 */
public class ResearchObjectConverter {

    public static List<ResearchObjectDTO> convertToResearchObjectResponse(List<ResearchObject> researchObjects, OrganizationDao organizationDao) {

        List<ResearchObjectDTO> researchObjectDTOS = new ArrayList<>();

        for (ResearchObject researchObject : researchObjects) {
            ResearchObjectDTO researchObjectDTO = new ResearchObjectDTO();
            researchObjectDTO.setName(researchObject.getName());
            researchObjectDTO.setDescription(researchObject.getDescription());
            researchObjectDTO.setDate(researchObject.getDate());
            researchObjectDTO.setOrganizationName(organizationDao.findById(researchObject.getOid()).getFullTitle());
            researchObjectDTOS.add(researchObjectDTO);
        }
        return researchObjectDTOS;

    }

}
