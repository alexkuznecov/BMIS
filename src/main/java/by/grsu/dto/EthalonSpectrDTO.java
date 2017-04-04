package by.grsu.dto;

/**
 * Created by alek on 19.3.17.
 */
public class EthalonSpectrDTO {

    private String waveLength;

    private String buildMaterialName;

    private String materialName;

    private String chemicalElementName;

    private String spectrLinePersonName;

    public EthalonSpectrDTO() {

    }

    public String getWaveLength() {
        return waveLength;
    }

    public void setWaveLength(String waveLength) {
        this.waveLength = waveLength;
    }

    public String getBuildMaterialName() {
        return buildMaterialName;
    }

    public void setBuildMaterialName(String buildMaterialName) {
        this.buildMaterialName = buildMaterialName;
    }

    public String getMaterialName() {
        return materialName;
    }

    public void setMaterialName(String materialName) {
        this.materialName = materialName;
    }

    public String getChemicalElementName() {
        return chemicalElementName;
    }

    public void setChemicalElementName(String chemicalElementName) {
        this.chemicalElementName = chemicalElementName;
    }

    public String getSpectrLinePersonName() {
        return spectrLinePersonName;
    }

    public void setSpectrLinePersonName(String spectrLinePersonName) {
        this.spectrLinePersonName = spectrLinePersonName;
    }
}
