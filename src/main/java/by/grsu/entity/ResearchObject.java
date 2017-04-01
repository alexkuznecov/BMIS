package by.grsu.entity;

import javax.persistence.*;

/**
 * Created by alek on 21.2.17.
 */
@Entity
@Table(name = "ResearchObject")
public class ResearchObject {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "roid", length = 6, nullable = false)
    private Integer roid;

    @Column(name = "description")
    protected String description;

    @Column(name = "date")
    protected String date;

    @Column(name = "name")
    protected String name;

    @Column(name = "oid")
    private Integer oid;

    public ResearchObject() {

    }

    public Integer getRoid() {
        return roid;
    }

    public void setRoid(Integer roid) {
        this.roid = roid;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getOid() {
        return oid;
    }

    public void setOid(Integer oid) {
        this.oid = oid;
    }
}
