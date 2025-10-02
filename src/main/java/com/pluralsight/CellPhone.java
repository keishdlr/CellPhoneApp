package com.pluralsight;

public class CellPhone {

    // in this clas
    int phoneNumber = 0;
    int serialNumber = 0;
    String model = "";
    String carrier = "";
    String owner = "";

    public CellPhone(String keisha) {
        this.phoneNumber = phoneNumber;
        this.serialNumber = serialNumber;
        this.model = model;
        this.carrier = carrier;
        this.owner = owner;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCarrier() {
        return carrier;
    }

    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
}
