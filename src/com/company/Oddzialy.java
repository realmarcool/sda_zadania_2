package com.company;

import java.util.Scanner;

public class Oddzialy {
    String oddzial;
    Scanner pobierzInt = new Scanner(System.in);

    public String podajOddzial() {
        System.out.println("Podaj oddział:");
        System.out.println("1 - SZCZECIN");
        System.out.println("2 - WROCŁAW");
        System.out.println("3 - POZNAŃ");
        System.out.println("4 - WARSZAWA");
        System.out.println("5 - GDAŃSK");
        int pobierz = pobierzInt.nextInt();
        switch (pobierz) {
            case 1:
                oddzial = "SZCZECIN";
                break;
            case 2:
                oddzial = "WROCŁAW";
                break;
            case 3:
                oddzial = "POZNAŃ";
                break;
            case 4:
                oddzial = "WARSZAWA";
                break;
            case 5:
                oddzial = "GDAŃSK";
                break;
            default:
                System.out.println("Nieprawidłowy wybór");
                break;

        }
        return oddzial;

    }
}
