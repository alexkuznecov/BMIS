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
    protected String name;

    @Column(name = "symbol")
    protected String symbol;

    @Column(name = "atomic_weight")
    protected String atomicWeight;

    @Column(name = "atomic_number")
    protected String atomicNumber;

    @Column(name = "description")
    protected String description;

    @Column(name = "ions")
    protected String ions;

    @Column(name = "group_number")
    protected String groupNumber;

    @Column(name = "period")
    protected String period;

    @Column(name = "density")
    protected String density;

    @Column(name = "melting_point")
    protected String meltingPoint;

    @Column(name = "boiling_point")
    protected String boilingPoint;

    @Column(name = "abundance")
    protected String abundance;

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

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getAtomicWeight() {
        return atomicWeight;
    }

    public void setAtomicWeight(String atomicWeight) {
        this.atomicWeight = atomicWeight;
    }

    public String getAtomicNumber() {
        return atomicNumber;
    }

    public void setAtomicNumber(String atomicNumber) {
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

    public String getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(String groupNumber) {
        this.groupNumber = groupNumber;
    }

    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
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
