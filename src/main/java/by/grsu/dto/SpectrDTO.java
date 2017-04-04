package by.grsu.dto;

/**
 * Created by alek on 19.3.17.
 */
public class SpectrDTO {

    private String waveLength;

    private String intensity;

    private String chemicalElementName;

    private String spectrLineName;

    public SpectrDTO() {

    }

    public String getWaveLength() {
        return waveLength;
    }

    public void setWaveLength(String waveLength) {
        this.waveLength = waveLength;
    }

    public String getIntensity() {
        return intensity;
    }

    public void setIntensity(String intensity) {
        this.intensity = intensity;
    }

    public String getChemicalElementName() {
        return chemicalElementName;
    }

    public void setChemicalElementName(String chemicalElementName) {
        this.chemicalElementName = chemicalElementName;
    }

    public String getSpectrLineName() {
        return spectrLineName;
    }

    public void setSpectrLineName(String spectrLineName) {
        this.spectrLineName = spectrLineName;
    }
}
