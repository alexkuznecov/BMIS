package by.grsu.entity;

import javax.persistence.*;

/**
 * Created by alek on 20.2.17.
 */
@Entity
@Table(name = "QualityStandart")
public class QualityStandart {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "qsid", length = 6, nullable = false)
    private Integer qsid;

    @Column(name = "name")
    private String name;

    public QualityStandart() {

    }

    public Integer getQsid() {
        return qsid;
    }

    public void setQsid(Integer qsid) {
        this.qsid = qsid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
