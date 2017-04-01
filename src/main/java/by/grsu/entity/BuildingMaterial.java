package by.grsu.entity;

import javax.persistence.*;

/**
 * Created by alek on 20.2.17.
 */
@Entity
@Table(name = "BuildingMaterial")
public class BuildingMaterial {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "bmid", length = 6, nullable = false)
    private Integer bmid;

    @Column(name = "mark")
    protected String mark;

    @Column(name = "short_name")
    protected String shortName;

    @Column(name = "frost_resistance")
    protected String frostResistance;

    @Column(name = "mechanical_stress")
    protected String mechanicalStress;

    @Column(name = "made_year")
    protected  String year;

    @Column(name = "spectr_file")
    protected String spectrFile;

    @Column(name = "rotid")
    private Integer rotid;

    @Column(name = "mnfid")
    private Integer mnfid;

    public BuildingMaterial() {

    }

    public Integer getBmid() {
        return bmid;
    }

    public void setBmid(Integer bmid) {
        this.bmid = bmid;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public String getFrostResistance() {
        return frostResistance;
    }

    public void setFrostResistance(String frostResistance) {
        this.frostResistance = frostResistance;
    }

    public String getMechanicalStress() {
        return mechanicalStress;
    }

    public void setMechanicalStress(String mechanicalStress) {
        this.mechanicalStress = mechanicalStress;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getSpectrFile() {
        return spectrFile;
    }

    public void setSpectrFile(String spectrFile) {
        this.spectrFile = spectrFile;
    }

    public Integer getRotid() {
        return rotid;
    }

    public void setRotid(Integer rotid) {
        this.rotid = rotid;
    }

    public Integer getMnfid() {
        return mnfid;
    }

    public void setMnfid(Integer mnfid) {
        this.mnfid = mnfid;
    }
}
