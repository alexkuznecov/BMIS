package by.grsu.entity;

import javax.persistence.*;

/**
 * Created by alek on 20.2.17.
 */
@Entity
@Table(name = "EthalonSpectr")
public class EthalonSpectr {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "etsid", length = 6, nullable = false)
    private Integer etsid;

    @Column(name = "wave_length")
    private String waveLength;

    @Column(name = "line_description")
    private String lineDescription;

    @Column(name = "spectr_base")
    private String spectrBase;

    @Column(name = "mid")
    private Integer mid;

    @Column(name = "bmid")
    private Integer bmid;

    @Column(name = "ceid")
    private Integer ceid;

    @Column(name = "slid")
    private Integer slid;

    public EthalonSpectr() {

    }

    public Integer getEtsid() {
        return etsid;
    }

    public void setEtsid(Integer etsid) {
        this.etsid = etsid;
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

    public Integer getMid() {
        return mid;
    }

    public void setMid(Integer mid) {
        this.mid = mid;
    }

    public Integer getBmid() {
        return bmid;
    }

    public void setBmid(Integer bmid) {
        this.bmid = bmid;
    }

    public Integer getCeid() {
        return ceid;
    }

    public void setCeid(Integer ceid) {
        this.ceid = ceid;
    }

    public Integer getSlid() {
        return slid;
    }

    public void setSlid(Integer slid) {
        this.slid = slid;
    }
}
