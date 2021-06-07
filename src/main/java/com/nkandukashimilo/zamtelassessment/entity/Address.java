package com.nkandukashimilo.zamtelassessment.entity;

import javax.persistence.*;

@Entity
@Table(name="Address")
public class Address{

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="addressID")
    public int addressID;

    @Column(name="plotNumber")
    public String plotNumber;

    @Column(name="streetName")
    public String streetName;

    @Column(name="area")
    public String area;

    @Column(name="province")
    public String province;

    @Column(name="town")
    public String town;

    @Column(name="createdAt")
    public String createdAt;

    @Column(name="updatedAt")
    public String updatedAt;

    @ManyToOne(cascade= {CascadeType.PERSIST, CascadeType.MERGE,
            CascadeType.DETACH, CascadeType.REFRESH})
    @JoinColumn(name="customerProfileID")
    private CustomerProfile customerProfile;


    public int getAddressID() {
        return addressID;
    }

    public void setAddressID(int addressID) {
        this.addressID = addressID;
    }

    public String getPlotNumber() {
        return plotNumber;
    }

    public void setPlotNumber(String plotNumber) {
        this.plotNumber = plotNumber;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
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

    public CustomerProfile getCustomerProfile() {
        return customerProfile;
    }

    public void setCustomerProfile(CustomerProfile customerProfile) {
        this.customerProfile = customerProfile;
    }
}
