package by.grsu.entity;

import javax.persistence.*;

/**
 * Created by alek on 15.2.17.
 */
@Entity
@Table(name = "ChemicalElement")
public class ChemicalElement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ceid", length = 6, nullable = false)
    private Integer ceid;

    @Column(name = "name")
    private String name;

    @Column(name = "atomic_weight")
    private String atomicWeight;

    @Column(name = "atomic_number")
    private Integer atomicNumber;

    @Column(name = "description")
    private String description;

    @Column(name = "ions")
    private String ions;

    @Column(name = "group_number")
    private Integer groupNumber;

    @Column(name = "period")
    private Integer period;

    @Column(name = "density")
    private String density;

    @Column(name = "melting_point")
    private String meltingPoint;

    @Column(name = "boiling_point")
    private String boilingPoint;

    @Column(name = "abundance")
    private String abundance;

    public ChemicalElement() {

    }

    public Integer getCeid() {
        return ceid;
    }

    public void setCeid(Integer ceid) {
        this.ceid = ceid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAtomicWeight() {
        return atomicWeight;
    }

    public void setAtomicWeight(String atomicWeight) {
        this.atomicWeight = atomicWeight;
    }

    public Integer getAtomicNumber() {
        return atomicNumber;
    }

    public void setAtomicNumber(Integer atomicNumber) {
        this.atomicNumber = atomicNumber;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getIons() {
        return ions;
    }

    public void setIons(String ions) {
        this.ions = ions;
    }

    public Integer getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(Integer groupNumber) {
        this.groupNumber = groupNumber;
    }

    public Integer getPeriod() {
        return period;
    }

    public void setPeriod(Integer period) {
        this.period = period;
    }

    public String getDensity() {
        return density;
    }

    public void setDensity(String density) {
        this.density = density;
    }

    public String getMeltingPoint() {
        return meltingPoint;
    }

    public void setMeltingPoint(String meltingPoint) {
        this.meltingPoint = meltingPoint;
    }

    public String getBoilingPoint() {
        return boilingPoint;
    }

    public void setBoilingPoint(String boilingPoint) {
        this.boilingPoint = boilingPoint;
    }

    public String getAbundance() {
        return abundance;
    }

    public void setAbundance(String abundance) {
        this.abundance = abundance;
    }
}
