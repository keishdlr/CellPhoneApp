package com.pluralsight;

public class CellPhone {

    // in this clas
    int phoneNumber = 0;
    int serialNumber = 0;
    String model = "";
    String carrier = "";
    String owner = "";

    public CellPhone(int phoneNumber, int serialNumber, String model, String carrier, String owner) {
        this.phoneNumber = phoneNumber;
        this.serialNumber = serialNumber;
        this.model = model;
        this.carrier = carrier;
        this.owner = owner;
    }
}
