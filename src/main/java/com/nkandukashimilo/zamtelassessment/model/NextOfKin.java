package com.nkandukashimilo.zamtelassessment.model;

public class NextOfKin{
    public int nextOfKinID;
    public String fName;
    public String lName;
    public String createdAt;
    public String updatedAt;
    public ContactType contactType;

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

    public ContactType getContactType() {
        return contactType;
    }

    public void setContactType(ContactType contactType) {
        this.contactType = contactType;
    }
}
