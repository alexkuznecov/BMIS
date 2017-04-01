package by.grsu.entity;

import javax.persistence.*;

/**
 * Created by alek on 20.2.17.
 */
@Entity
@Table(name = "Spectr")
public class Spectr {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "spcid", length = 6, nullable = false)
    private Integer spcid;

    @Column(name = "wave_length")
    protected String waveLength;

    @Column(name = "line_description")
    protected String lineDescription;

    @Column(name = "spectr_base")
    protected String spectrBase;

    @Column(name = "rpid")
    private Integer rpid;

    @Column(name = "slid")
    private Integer slid;

    @Column(name = "ceid")
    private Integer ceid;

    public Spectr() {

    }

    public Integer getSpcid() {
        return spcid;
    }

    public void setSpcid(Integer spcid) {
        this.spcid = spcid;
    }

    public String getWaveLength() {
        return waveLength;
    }

    public void setWaveLength(String waveLength) {
        this.waveLength = waveLength;
    }

    public String getLineDescription() {
        return lineDescription;
    }

    public void setLineDescription(String lineDescription) {
        this.lineDescription = lineDescription;
    }

    public String getSpectrBase() {
        return spectrBase;
    }

    public void setSpectrBase(String spectrBase) {
        this.spectrBase = spectrBase;
    }

    public Integer getRpid() {
        return rpid;
    }

    public void setRpid(Integer rpid) {
        this.rpid = rpid;
    }

    public Integer getSlid() {
        return slid;
    }

    public void setSlid(Integer slid) {
        this.slid = slid;
    }

    public Integer getCeid() {
        return ceid;
    }

    public void setCeid(Integer ceid) {
        this.ceid = ceid;
    }
}
