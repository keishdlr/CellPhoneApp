package com.pluralsight;

public class CellPhone {

    // in this clas

    private int serialNumber = 0;
    private String phoneNumber = "";
   private String model = "";
   private String carrier = "";
   private String owner = "";

    public CellPhone(String model,String carrier, String owner, String phoneNumber, int serialNumber) {
        this.phoneNumber = phoneNumber;
        this.serialNumber = serialNumber;
        this.model = model;
        this.carrier = carrier;
        this.owner = owner;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getSerialNumber() {
        return this.serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCarrier() {
        return this.carrier;
    }

    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }

    public String getOwner() {
        return this.owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

}
