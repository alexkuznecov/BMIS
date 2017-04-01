package by.grsu.entity;

import javax.persistence.*;

/**
 * Created by alek on 20.2.17.
 */
@Entity
@Table(name = "SpectrLineLibrary")
public class SpectrLineLibrary {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "sllid", length = 6, nullable = false)
    private Integer sllid;

    @Column(name = "name")
    protected String name;

    @Column(name = "description")
    protected String description;

    @Column(name = "comments_library")
    protected String commentsLibrary;

    public SpectrLineLibrary() {

    }

    public Integer getSllid() {
        return sllid;
    }

    public void setSllid(Integer sllid) {
        this.sllid = sllid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCommentsLibrary() {
        return commentsLibrary;
    }

    public void setCommentsLibrary(String commentsLibrary) {
        this.commentsLibrary = commentsLibrary;
    }
}
