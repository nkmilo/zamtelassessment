package com.nkandukashimilo.zamtelassessment.model;

public class Address{
    public int addressID;
    public String plotNumber;
    public String streetName;
    public String area;
    public ExtendedAddress extendedAddress;
    public String createdAt;
    public String updatedAt;
    public Town town;


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

    public ExtendedAddress getExtendedAddress() {
        return extendedAddress;
    }

    public void setExtendedAddress(ExtendedAddress extendedAddress) {
        this.extendedAddress = extendedAddress;
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

    public Town getTown() {
        return town;
    }

    public void setTown(Town town) {
        this.town = town;
    }
}
