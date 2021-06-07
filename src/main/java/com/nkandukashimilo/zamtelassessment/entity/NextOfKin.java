package com.nkandukashimilo.zamtelassessment.entity;


import javax.persistence.*;

@Entity
@Table(name="NextOfKin")
public class NextOfKin{

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="nextOfKinID")
    public int nextOfKinID;

    @Column(name="fName")
    public String fName;

    @Column(name="lName")
    public String lName;

    @Column(name="contactType")
    public String contactType;

    @Column(name="createdAt")
    public String createdAt;

    @Column(name="updatedAt")
    public String updatedAt;

    @ManyToOne(cascade= {CascadeType.PERSIST, CascadeType.MERGE,
            CascadeType.DETACH, CascadeType.REFRESH})
    @JoinColumn(name="customerProfileID")
    private CustomerProfile customerProfile;

    public int getNextOfKinID() {
        return nextOfKinID;
    }

    public void setNextOfKinID(int nextOfKinID) {
        this.nextOfKinID = nextOfKinID;
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

    public String getContactType() {
        return contactType;
    }

    public void setContactType(String contactType) {
        this.contactType = contactType;
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
