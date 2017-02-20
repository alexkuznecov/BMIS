package by.grsu.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by alek on 20.2.17.
 */
@Entity
@Table(name = "SpectrLineLibrary")
public class MaterialHasQualityStandart {

    @Column(name = "qsid")
    private Integer qsid;

    @Column(name = "bmid")
    private Integer bmid;

    public MaterialHasQualityStandart() {

    }

    public Integer getQsid() {
        return qsid;
    }

    public void setQsid(Integer qsid) {
        this.qsid = qsid;
    }

    public Integer getBmid() {
        return bmid;
    }

    public void setBmid(Integer bmid) {
        this.bmid = bmid;
    }
}
