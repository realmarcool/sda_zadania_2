package com.company;

import java.util.Scanner;

public class Prezes extends Pracownik implements AkcjePracownicze{
    String dodatkowePolePrezesa;
    Scanner pobierzString = new Scanner(System.in);
    @Override
    public void dodaj() {
        System.out.println("Podaj imię:");
        imie = pobierzString.nextLine();
        System.out.println("Podaj nazwisko:");
        nazwisko = pobierzString.nextLine();
        oddzial = new Oddzialy().podajOddzial();
        stanowisko = Stanowiska.PREZES;



    }
}
