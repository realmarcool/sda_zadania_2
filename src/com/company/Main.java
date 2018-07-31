package com.company;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void menu() {
        System.out.println("MENU:\n1.Dodaj pracownika");
        System.out.println("2.Usunięcie pracownika");
        System.out.println("3.Wyszukanie pracownika");
        System.out.println("4.Wyświetlenie listy wszystkich pracowników");
        System.out.println("5.Wyświetlenie listy pracowników dla wybranego typu");
        System.out.println("6.WYJDŹ");
    }

    public static void menu1a() {
        System.out.println("Podaj stanowisko:\n1.PREZES");
        System.out.println("2.KSIĘGOWY/A");
        System.out.println("3.ROBOL");
        System.out.println("4.WYJDŹ");
    }


    public static void main(String[] args) throws FileNotFoundException {
        // write your code here

        Random generator = new Random();
        List<Pracownik> listaPracownikow = new ArrayList<>();
        Scanner pobierzInt = new Scanner(System.in);
        Scanner pobierzString = new Scanner(System.in);
        int wybor = 0;
        int wybor2 = 0;
        boolean istnieje = false;
        while (wybor != 6) {
            menu();
            wybor = pobierzInt.nextInt();
            switch (wybor) {
                case 1:
                    menu1a();
                    wybor2 = pobierzInt.nextInt();
                    switch (wybor2) {
                        case 1:
                            Prezes prezes = new Prezes();
                            prezes.dodaj();
                            int id = generator.nextInt(1000);
                            do {
                                for (Pracownik lista : listaPracownikow) {
                                    if (prezes.sprawdzID(id, lista.id)) {
                                        istnieje = true;
                                    } else istnieje = false;
                                }
                                id = generator.nextInt(1000);
                            }
                            while (istnieje);
                            prezes.id = id;
                            istnieje = false;
                            for (Pracownik lista : listaPracownikow) {
                                if (prezes.sprawdzImieiNazwisko(prezes.imie, prezes.nazwisko, lista.imie, lista.nazwisko)) {
                                    System.out.println("--------------------------------------------");
                                    System.out.println("Pracownik: " + prezes.imie + " " + prezes.nazwisko + " już istnieje!");
                                    System.out.println("--------------------------------------------");
                                    istnieje = true;
                                }
                            }
                            if (!istnieje) {
                                listaPracownikow.add(prezes);
                            }
                            break;
                        case 2:
                            Ksiegowy ksiegowy = new Ksiegowy();
                            ksiegowy.dodaj();
                            id = generator.nextInt(1000);
                            do {
                                for (Pracownik lista : listaPracownikow) {
                                    if (ksiegowy.sprawdzID(id, lista.id)) {
                                        istnieje = true;
                                    } else istnieje = false;
                                }
                                id = generator.nextInt(1000);
                            }
                            while (istnieje);
                            ksiegowy.id = id;
                            istnieje = false;
                            for (Pracownik lista : listaPracownikow) {
                                if (ksiegowy.sprawdzImieiNazwisko(ksiegowy.imie, ksiegowy.nazwisko, lista.imie, lista.nazwisko)) {
                                    System.out.println("--------------------------------------------");
                                    System.out.println("Pracownik: " + ksiegowy.imie + " " + ksiegowy.nazwisko + " już istnieje!");
                                    System.out.println("--------------------------------------------");
                                    istnieje = true;
                                }
                            }
                            if (!istnieje) {
                                listaPracownikow.add(ksiegowy);
                            }
                            break;
                        case 3:
                            Robol robol = new Robol();
                            robol.dodaj();
                            id = generator.nextInt(1000);
                            do {
                                for (Pracownik lista : listaPracownikow) {
                                    if (robol.sprawdzID(id, lista.id)) {
                                        istnieje = true;
                                    } else istnieje = false;
                                }
                                id = generator.nextInt(1000);
                            }
                            while (istnieje);
                            robol.id = id;
                            istnieje = false;
                            for (Pracownik lista : listaPracownikow) {
                                if (robol.sprawdzImieiNazwisko(robol.imie, robol.nazwisko, lista.imie, lista.nazwisko)) {
                                    System.out.println("--------------------------------------------");
                                    System.out.println("Pracownik: " + robol.imie + " " + robol.nazwisko + " już istnieje!");
                                    System.out.println("--------------------------------------------");
                                    istnieje = true;
                                }
                            }
                            if (!istnieje) {
                                listaPracownikow.add(robol);
                            }
                            break;
                        default:
                            System.out.println("Błąd wyboru, podaj właściwą liczbę!");
                    }
                    break;
                case 2:
                    istnieje = false;
                    System.out.println("Podaj #id pracownika do usunięcia:");
                    int id = pobierzInt.nextInt();
                    for (Pracownik lista : listaPracownikow) {
                        if (lista.id == id) {
                            System.out.println(lista + " - USUNIĘTY!");
                            listaPracownikow.remove(lista);
                            istnieje = true;
                        }
                    }
                    if (!istnieje) {
                        System.out.println("Błędny numer #id " + id + ", nie ma pracownika o takim #id!");
                    }
                    break;
                case 3:
                    break;
                case 4:
                    System.out.println("------------------------------------------------");
                    System.out.println("LISTA PRACOWNIKÓW:");
                    for (Pracownik lista : listaPracownikow) {
                        System.out.println(lista);
                    }
                    System.out.println("------------------------------------------------");
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Błąd wyboru, podaj właściwą liczbę!");


            }


        }


    }
}



