package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApp {
public static Scanner myScanner = new Scanner(System.in);
    public static void main(String[] args) {

        CellPhone phone1 = null; // Creating the variable
        phone1 = new CellPhone(phone1.getModel(), phone1.getPhoneNumber(), phone1.getCarrier(), phone1.getOwner(), phone1.getSerialNumber());// Creating the instance of a class

        System.out.println("What is the serial number?");
        int serialNumber = myScanner.nextInt();
        phone1.setSerialNumber(phone1.getSerialNumber());

        System.out.println("What model is the phone?");
        String model = myScanner.nextLine();
        phone1.setModel(phone1.getModel());

        System.out.println("Who is the carrier?");
        String carrier = myScanner.nextLine();
        phone1.setCarrier(phone1.getCarrier());

        System.out.println("What is the phone number?");
        int phoneNumber = myScanner.nextInt();
        phone1.setPhoneNumber(phone1.getPhoneNumber());

        System.out.println("Who is the owner of the phone?");
        String owner = myScanner.nextLine();
        phone1.setOwner(phone1.getOwner());

        System.out.println("The owner is: ");
    }

}
