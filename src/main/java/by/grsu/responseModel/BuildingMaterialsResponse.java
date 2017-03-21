package by.grsu.responseModel;

/**
 * Created by alek on 19.3.17.
 */
public class BuildingMaterialsResponse {

    private String name;

    private String creationDate;

    private String manufactorerName;

    private String researchObjectTypeName;

    public BuildingMaterialsResponse() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    public String getManufactorerName() {
        return manufactorerName;
    }

    public void setManufactorerName(String manufactorerName) {
        this.manufactorerName = manufactorerName;
    }

    public String getResearchObjectTypeName() {
        return researchObjectTypeName;
    }

    public void setResearchObjectTypeName(String researchObjectTypeName) {
        this.researchObjectTypeName = researchObjectTypeName;
    }
}
