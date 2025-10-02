package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApp {
public Scanner myScanner = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("What is the serial number?");
        int serialNumber = myScanner.nextInt();

        System.out.println("What model is the phone?");
        String model = myScanner.nextLine();

        System.out.println("Who is the carrier?");
        String carrier = myScanner.nextLine();

        System.out.println("What is the phone number?");
        int phoneNumber = myScanner.nextInt();

        System.out.println("Who is the owner of the phone?");
        String owner = myScanner.nextLine();





        // CellPhone serialNumber = new CellPhone(918);
       // CellPhone model = new CellPhone("Samsung S23 Ultra");
       // CellPhone carrier = new CellPhone("T-Mobile");
       // CellPhone phoneNumber = new CellPhone(7180102233);
       // CellPhone owner = new CellPhone("Keisha");
    }

}
