package by.grsu.entity;

import javax.persistence.*;

/**
 * Created by alek on 20.2.17.
 */
@Entity
@Table(name = "ResearchObjectType")
public class ResearchObjectType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "rotid", length = 6, nullable = false)
    private Integer rotid;

    @Column(name = "name")
    protected String name;

    public ResearchObjectType() {

    }

    public Integer getRotid() {
        return rotid;
    }

    public void setRotid(Integer rotid) {
        this.rotid = rotid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
