package by.grsu.entity;

import javax.persistence.*;

/**
 * Created by alek on 21.2.17.
 */
@Entity
@Table(name = "Material")
public class Material {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "mid", length = 6, nullable = false)
    private Integer mid;

    @Column(name = "name")
    protected String name;

    @Column(name = "probe_date")
    protected String probeDate;

    @Column(name = "probe_place")
    protected String probePlace;

    @Column(name = "description")
    protected String description;

    @Column(name = "spectr_file")
    protected String spectrFile;

    public Material() {

    }

    public Integer getMid() {
        return mid;
    }

    public void setMid(Integer mid) {
        this.mid = mid;
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

    public String getSpectrFile() {
        return spectrFile;
    }

    public void setSpectrFile(String spectrFile) {
        this.spectrFile = spectrFile;
    }
}
