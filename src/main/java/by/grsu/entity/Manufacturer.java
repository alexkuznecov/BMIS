package by.grsu.entity;

import javax.persistence.*;

/**
 * Created by alek on 21.2.17.
 */
@Entity
@Table(name = "Manufacturer")
public class Manufacturer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "mnfid", length = 6, nullable = false)
    private Integer mnfid;

    @Column(name = "name")
    private String name;

    @Column(name = "year_of_creation")
    private String yearOfCreation;

    @Column(name = "description")
    private String description;

    public Manufacturer() {

    }

    public Integer getMnfid() {
        return mnfid;
    }

    public void setMnfid(Integer mnfid) {
        this.mnfid = mnfid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getYearOfCreation() {
        return yearOfCreation;
    }

    public void setYearOfCreation(String yearOfCreation) {
        this.yearOfCreation = yearOfCreation;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
