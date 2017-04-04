package by.grsu.converters;

import by.grsu.entity.Material;
import by.grsu.dto.MaterialDTO;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by alek on 9.3.17.
 */
public class MaterialConverter {

    public static List<MaterialDTO> convertToMaterialResponse(List<Material> materials) {
        List<MaterialDTO> materialDTOS = new ArrayList<>();
        for (Material material : materials) {
            MaterialDTO materialDTO = new MaterialDTO();
            materialDTO.setName(material.getName());
            materialDTO.setProbeDate(material.getProbeDate());
            materialDTO.setProbePlace(material.getProbePlace());
            materialDTO.setDescription(material.getDescription());
            materialDTOS.add(materialDTO);
        }
        return materialDTOS;
    }
}
