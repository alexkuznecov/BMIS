package by.grsu.converters;

import by.grsu.entity.Material;
import by.grsu.responseModel.MaterialResponse;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by alek on 9.3.17.
 */
public class MaterialConverter {

    public static List<MaterialResponse> convertToMaterialResponse(List<Material> materials) {
        List<MaterialResponse> materialResponses = new ArrayList<>();
        for (Material material : materials) {
            MaterialResponse materialResponse = new MaterialResponse();
            materialResponse.setName(material.getName());
            materialResponse.setProbeDate(material.getProbeDate());
            materialResponse.setProbePlace(material.getProbePlace());
            materialResponse.setDescription(material.getDescription());
            materialResponses.add(materialResponse);
        }
        return materialResponses;
    }
}
