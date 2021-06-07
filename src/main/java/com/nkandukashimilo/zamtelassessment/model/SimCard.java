package com.nkandukashimilo.zamtelassessment.model;

public class SimCard{
    public int simCardID;
    public String msisdn;
    public String imei;
    public String serialNumber;
    public String puk;
    public String pin;
    public String createdAt;
    public String updatedAt;
    public CustomerProfile customerProfile;
    public SimCardType simCardType;
    public SimCardStatus simCardStatus;

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

    public CustomerProfile getCustomerProfile() {
        return customerProfile;
    }

    public void setCustomerProfile(CustomerProfile customerProfile) {
        this.customerProfile = customerProfile;
    }

    public SimCardType getSimCardType() {
        return simCardType;
    }

    public void setSimCardType(SimCardType simCardType) {
        this.simCardType = simCardType;
    }

    public SimCardStatus getSimCardStatus() {
        return simCardStatus;
    }

    public void setSimCardStatus(SimCardStatus simCardStatus) {
        this.simCardStatus = simCardStatus;
    }
}
