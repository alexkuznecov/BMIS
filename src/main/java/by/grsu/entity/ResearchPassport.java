package by.grsu.entity;

import javax.persistence.*;

/**
 * Created by alek on 21.2.17.
 */
@Entity
@Table(name = "ResearchPassport")
public class ResearchPassport {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "rpid", length = 6, nullable = false)
    private Integer rpid;

    @Column(name = "spectr_file")
    private String spectrFile;

    @Column(name = "description")
    private String description;

    @Column(name = "intensity")
    private String intensity;

    @Column(name = "rmid")
    private Integer rmid;

    @Column(name = "rmid")
    private Integer roid;

    public ResearchPassport() {

    }

    public Integer getRpid() {
        return rpid;
    }

    public void setRpid(Integer rpid) {
        this.rpid = rpid;
    }

    public String getSpectrFile() {
        return spectrFile;
    }

    public void setSpectrFile(String spectrFile) {
        this.spectrFile = spectrFile;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getIntensity() {
        return intensity;
    }

    public void setIntensity(String intensity) {
        this.intensity = intensity;
    }

    public Integer getRmid() {
        return rmid;
    }

    public void setRmid(Integer rmid) {
        this.rmid = rmid;
    }

    public Integer getRoid() {
        return roid;
    }

    public void setRoid(Integer roid) {
        this.roid = roid;
    }
}
