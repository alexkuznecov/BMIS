package by.grsu.service;

import by.grsu.dto.MaterialDTO;

import java.util.List;

/**
 * Created by alek on 8.3.17.
 */
public interface MaterialService {

    List<MaterialDTO> getByFilter(String name, String probDate, String probPlace, String description, Integer paramCount);

    List<MaterialDTO> getAllMaterials();

}
