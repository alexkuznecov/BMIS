package by.grsu.service;

import by.grsu.responseModel.MaterialResponse;

import java.util.List;

/**
 * Created by alek on 8.3.17.
 */
public interface MaterialService {

    List<MaterialResponse> getByFilter(String name, String probDate, String probPlace, String description, Integer paramCount);

    List<MaterialResponse> getAllMaterials();

}
