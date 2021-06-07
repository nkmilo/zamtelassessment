package com.nkandukashimilo.zamtelassessment.entity;

import javax.persistence.*;

@Entity
@Table(name="SimCard")
public class SimCard{

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="simCardID")
    public int simCardID;

    @Column(name="msisdn")
    public String msisdn;

    @Column(name="imei")
    public String imei;

    @Column(name="serialNumber")
    public String serialNumber;

    @Column(name="puk")
    public String puk;

    @Column(name="pin")
    public String pin;

    @Column(name="createdAt")
    public String createdAt;

    @Column(name="updatedAt")
    public String updatedAt;

    @Column(name="simCardType")
    public String simCardType;

    @Column(name="simCardStatus")
    public String simCardStatus;

    @ManyToOne(cascade= {CascadeType.PERSIST, CascadeType.MERGE,
            CascadeType.DETACH, CascadeType.REFRESH})
    @JoinColumn(name="customerProfileID")
    private CustomerProfile customerProfile;


    public int getSimCardID() {
        return simCardID;
    }

    public void setSimCardID(int simCardID) {
        this.simCardID = simCardID;
    }

    public String getMsisdn() {
        return msisdn;
    }

    public void setMsisdn(String msisdn) {
        this.msisdn = msisdn;
    }

    public String getImei() {
        return imei;
    }

    public void setImei(String imei) {
        this.imei = imei;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getPuk() {
        return puk;
    }

    public void setPuk(String puk) {
        this.puk = puk;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
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

    public String getSimCardType() {
        return simCardType;
    }

    public void setSimCardType(String simCardType) {
        this.simCardType = simCardType;
    }

    public String getSimCardStatus() {
        return simCardStatus;
    }

    public void setSimCardStatus(String simCardStatus) {
        this.simCardStatus = simCardStatus;
    }

    public CustomerProfile getCustomerProfile() {
        return customerProfile;
    }

    public void setCustomerProfile(CustomerProfile customerProfile) {
        this.customerProfile = customerProfile;
    }

}
