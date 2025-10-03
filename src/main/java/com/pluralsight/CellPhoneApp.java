package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApp {
public static Scanner myScanner = new Scanner(System.in);
    public static void main(String[] args) {

        CellPhone phone1; // Creating the variable
        phone1= new CellPhone();// Creating the instance of a class

        System.out.println("What is the serial number?");
        int serialNumber = myScanner.nextInt();
        phone1.setSerialNumber();

        System.out.println("What model is the phone?");
        String model = myScanner.nextLine();
        phone1.setModel();

        System.out.println("Who is the carrier?");
        String carrier = myScanner.nextLine();
        phone1.setCarrier();

        System.out.println("What is the phone number?");
        int phoneNumber = myScanner.nextInt();
        phone1.setPhoneNumber();

        System.out.println("Who is the owner of the phone?");
        String owner = myScanner.nextLine();

        System.out.println("The owner is: " + phone1.setOwner());
        phone1.getSerialNumber();
        phone1.getModel();
        phone1.getCarrier();
        phone1.getPhoneNumber();
        phone1.getOwner();
    }

}
