package by.grsu.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by alek on 21.2.17.
 */
@Entity
@Table(name = "Material_has_ElementSource")
public class MaterialHasElementSource {

    @Column(name = "bmid")
    private Integer bmid;

    @Column(name = "mid")
    private Integer mid;

    public MaterialHasElementSource() {

    }

    public Integer getBmid() {
        return bmid;
    }

    public void setBmid(Integer bmid) {
        this.bmid = bmid;
    }

    public Integer getMid() {
        return mid;
    }

    public void setMid(Integer mid) {
        this.mid = mid;
    }
}
