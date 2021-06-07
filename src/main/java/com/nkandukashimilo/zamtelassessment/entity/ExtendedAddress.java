package com.nkandukashimilo.zamtelassessment.entity;

import javax.persistence.*;

@Entity
@Table(name="ExtendedAddress")
public class ExtendedAddress{

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="extendedAddressID")
    public int extendedAddressID;

    @Column(name="landMark")
    public String landMark;

    @Column(name="road")
    public String road;

    @Column(name="neighborhood")
    public String neighborhood;

    @Column(name="sectionName")
    public String sectionName;

    @Column(name="unitNumber")
    public String unitNumber;

    @Column(name="createdAt")
    public String createdAt;

    @Column(name="updatedAt")
    public String updatedAt;

    @ManyToOne(cascade= {CascadeType.PERSIST, CascadeType.MERGE,
            CascadeType.DETACH, CascadeType.REFRESH})
    @JoinColumn(name="addressID")
    private Address address;

    public int getExtendedAddressID() {
        return extendedAddressID;
    }

    public void setExtendedAddressID(int extendedAddressID) {
        this.extendedAddressID = extendedAddressID;
    }

    public String getLandMark() {
        return landMark;
    }

    public void setLandMark(String landMark) {
        this.landMark = landMark;
    }

    public String getRoad() {
        return road;
    }

    public void setRoad(String road) {
        this.road = road;
    }

    public String getNeighborhood() {
        return neighborhood;
    }

    public void setNeighborhood(String neighborhood) {
        this.neighborhood = neighborhood;
    }

    public String getSectionName() {
        return sectionName;
    }

    public void setSectionName(String sectionName) {
        this.sectionName = sectionName;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getUnitNumber() {
        return unitNumber;
    }

    public void setUnitNumber(String unitNumber) {
        this.unitNumber = unitNumber;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
