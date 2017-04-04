package by.grsu.service;

import by.grsu.dto.ResearchObjectDTO;

import java.util.List;

/**
 * Created by alek on 19.3.17.
 */
public interface ResearchObjectService {

    List<ResearchObjectDTO> getByFilter(String name, String organizationName, String date, String description, Integer paramCount);

    List<ResearchObjectDTO> getAllResearchObjects();

}
