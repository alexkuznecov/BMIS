package by.grsu.entity;

import javax.persistence.*;

/**
 * Created by alek on 20.2.17.
 */
@Entity
@Table(name = "SpectrLine")
public class SpectrLine {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "slid", length = 6, nullable = false)
    private Integer slid;

    @Column(name = "date_line")
    protected String dateLine;

    @Column(name = "person_name")
    protected String personName;

    @Column(name = "wavelength_line")
    protected String waveLengthLine;

    @Column(name = "other_option")
    protected String otherOption;

    @Column(name = "sllid")
    private Integer sllid;

    public SpectrLine() {

    }

    public Integer getSlid() {
        return slid;
    }

    public void setSlid(Integer slid) {
        this.slid = slid;
    }

    public String getDateLine() {
        return dateLine;
    }

    public void setDateLine(String dateLine) {
        this.dateLine = dateLine;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public String getWaveLengthLine() {
        return waveLengthLine;
    }

    public void setWaveLengthLine(String waveLengthLine) {
        this.waveLengthLine = waveLengthLine;
    }

    public String getOtherOption() {
        return otherOption;
    }

    public void setOtherOption(String otherOption) {
        this.otherOption = otherOption;
    }

    public Integer getSllid() {
        return sllid;
    }

    public void setSllid(Integer sllid) {
        this.sllid = sllid;
    }
}
