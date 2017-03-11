package by.grsu.responseModel;

/**
 * Created by alek on 8.3.17.
 */
public class MaterialResponse {

    private String name;

    private String probeDate;

    private String probePlace;

    private String description;

    public MaterialResponse() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProbeDate() {
        return probeDate;
    }

    public void setProbeDate(String probeDate) {
        this.probeDate = probeDate;
    }

    public String getProbePlace() {
        return probePlace;
    }

    public void setProbePlace(String probePlace) {
        this.probePlace = probePlace;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
