package com.nkandukashimilo.zamtelassessment.model;

public class ExtendedAddress{
    public int extendedAddressID;
    public String landMark;
    public String road;
    public String neighborhood;
    public String sectionName;
    public String createdAt;
    public String updatedAt;
    public String unitNumber;

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
}
