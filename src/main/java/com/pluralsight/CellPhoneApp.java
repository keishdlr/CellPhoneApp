package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApp {
public Scanner myScanner = new Scanner(System.in);
    public static void main(String[] args) {

        CellPhone serialNumber = new CellPhone(918);
        CellPhone model = new CellPhone("Samsung S23 Ultra");
        CellPhone carrier = new CellPhone("T-Mobile");
        CellPhone owner = new CellPhone("Keisha");
    }

}
