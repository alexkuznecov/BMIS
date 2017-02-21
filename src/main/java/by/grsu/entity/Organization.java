package by.grsu.entity;

import javax.persistence.*;

/**
 * Created by alek on 21.2.17.
 */
@Entity
@Table(name = "Organization")
public class Organization {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "oid", length = 6, nullable = false)
    private Integer oid;

    @Column(name = "full_title")
    private String fullTitle;

    @Column(name = "short_title")
    private String shortTitle;

    public Organization() {

    }

    public Integer getOid() {
        return oid;
    }

    public void setOid(Integer oid) {
        this.oid = oid;
    }

    public String getFullTitle() {
        return fullTitle;
    }

    public void setFullTitle(String fullTitle) {
        this.fullTitle = fullTitle;
    }

    public String getShortTitle() {
        return shortTitle;
    }

    public void setShortTitle(String shortTitle) {
        this.shortTitle = shortTitle;
    }
}
