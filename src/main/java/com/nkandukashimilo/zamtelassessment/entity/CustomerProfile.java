package com.nkandukashimilo.zamtelassessment.entity;

import javax.persistence.*;

@Entity
@Table(name="CustomerProfile")
public class CustomerProfile{

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="customerProfileID")
    public int customerProfileID;

    @Column(name="fName")
    public String fName;

    @Column(name="lName")
    public String lName;

    @Column(name="otherName")
    public String otherNames;

    @Column(name="dateOfBirth")
    public String dateOfBirth;

    @Column(name="idNumber")
    public String idNumber;

    @Column(name="gender")
    public String gender;

    @Column(name="customerType")
    public String customerType;

    @Column(name="customerProfileStatusCode")
    public String customerProfileStatusCode;

    @Column(name="occupation")
    public String occupation;

    @Column(name="village")
    public String village;

    @Column(name="chiefdom")
    public String chiefdom;

    @Column(name="longitude")
    public double longitude;

    @Column(name="latitude")
    public double latitude;

    @Column(name="country")
    public String country;

    @Column(name="createdAt")
    public String createdAt;

    @Column(name="updatedAt")
    public String updatedAt;

    public int getCustomerProfileID() {
        return customerProfileID;
    }

    public void setCustomerProfileID(int customerProfileID) {
        this.customerProfileID = customerProfileID;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getOtherNames() {
        return otherNames;
    }

    public void setOtherNames(String otherNames) {
        this.otherNames = otherNames;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    public String getCustomerProfileStatusCode() {
        return customerProfileStatusCode;
    }

    public void setCustomerProfileStatusCode(String customerProfileStatusCode) {
        this.customerProfileStatusCode = customerProfileStatusCode;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getVillage() {
        return village;
    }

    public void setVillage(String village) {
        this.village = village;
    }

    public String getChiefdom() {
        return chiefdom;
    }

    public void setChiefdom(String chiefdom) {
        this.chiefdom = chiefdom;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
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

}
