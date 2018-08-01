package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {

    private static void menu() {
        System.out.println("MENU:\n1: Dodaj pracownika");
        System.out.println("2: Usunięcie pracownika");
        System.out.println("3: Wyszukanie pracownika");
        System.out.println("4: Wyświetlenie listy wszystkich pracowników");
        System.out.println("5: Wyświetlenie listy pracowników dla wybranego stanowiska");
        System.out.println("6: WYJDŹ");
    }

    private static void menu1a() {
        System.out.println("Podaj stanowisko:\n1: PREZES");
        System.out.println("2: KSIĘGOWY/A");
        System.out.println("3: ROBOL");
        System.out.println("4: WYJDŹ");
    }

    private static void menu3a() {
        System.out.println("Podaj kryteria wyszukiwania:\n1: Po #ID");
        System.out.println("2: Po imieniu");
        System.out.println("3: Po nazwisku");
        System.out.println("4: Po stanowisku");
        System.out.println("5: WYJDŹ");
    }

    private static void menu5a() {
        System.out.println("Podaj dla jakiego stanowiska mam wyświetlić pracowników:\n1: PREZES");
        System.out.println("2: KSIĘGOWY");
        System.out.println("3: ROBOL");
        System.out.println("4: WYJDŹ");
    }


    public static void main(String[] args) {
        // write your code here

        Random generator = new Random();
        List<Pracownik> listaPracownikow = new ArrayList<>();
        Scanner pobierzInt = new Scanner(System.in);
        Scanner pobierzString = new Scanner((System.in));
        int wybor = 0;
        int wybor2;
        int id;
        String text;
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
                            id = generator.nextInt(1000);
                            do {
                                for (Pracownik lista : listaPracownikow) {
                                    istnieje = prezes.sprawdzID(id, lista.id);
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
                                    istnieje = ksiegowy.sprawdzID(id, lista.id);
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
                                    istnieje = robol.sprawdzID(id, lista.id);
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
                        case 4:
                            break;
                        default:
                            System.out.println("Błąd wyboru, podaj właściwą liczbę!");
                    }
                    break;
                case 2:
                    istnieje = false;
                    System.out.println("Podaj #id pracownika do usunięcia:");
                    id = pobierzInt.nextInt();
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
                    //Wyszukiwanie pracownika
                    menu3a();
                    wybor2 = pobierzInt.nextInt();
                    switch (wybor2) {
                        case 1:
                            System.out.println("Podaj #ID pracownika do wyszukania:");
                            istnieje = false;
                            id = pobierzInt.nextInt();
                            System.out.println("Wynik wyszukiwania po podanym #ID:");
                            for (Pracownik lista : listaPracownikow) {
                                if (lista.id == id) {
                                    System.out.println(lista);
                                    istnieje = true;
                                }
                            }
                            if (!istnieje) {
                                System.out.println("Brak pracownika o #ID: " + id);
                            }
                            break;
                        case 2:
                            System.out.println("Podaj imię do wyszukania:");
                            text = pobierzString.nextLine();
                            System.out.println("Wynik wyszukiwania po podanym imieniu:");
                            for (Pracownik lista : listaPracownikow) {
                                if (lista.imie.equalsIgnoreCase(text)) {
                                    System.out.println(lista);
                                    istnieje = true;
                                }
                            }
                            if (!istnieje) {
                                System.out.println("Brak pracowników o imieniu: " + text);
                            }
                            break;
                        case 3:
                            System.out.println("Podaj nazwisko do wyszukania:");
                            text = pobierzString.nextLine();
                            System.out.println("Wynik wyszukiwania po podanym nazwisku:");
                            for (Pracownik lista : listaPracownikow) {
                                if (lista.nazwisko.equalsIgnoreCase(text)) {
                                    System.out.println(lista);
                                    istnieje = true;
                                }
                            }
                            if (!istnieje) {
                                System.out.println("Brak pracowników o nazwisku: " + text);
                            }
                            break;
                        case 4:
                            System.out.println("Podaj stanowisko do wyszukania:");
                            text = pobierzString.nextLine();
                            System.out.println("Wynik wyszukiwania po podanym stanowisku:");
                            for (Pracownik lista : listaPracownikow) {
                                System.out.println(lista.stanowisko);
                                if (lista.stanowisko.toString().equalsIgnoreCase(text)) {
                                    System.out.println(lista);
                                    istnieje = true;
                                }
                            }
                            if (!istnieje) {
                                System.out.println("Brak pracowników o stanowisku: " + text);
                            }
                            break;
                        case 5:
                            break;
                        default:
                            System.out.println("Błąd wyboru, podaj właściwą liczbę!");

                    } //KONIEC WYSZUKIWANIA

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
                    // LISTOWNIE PO STANOWISKACH
                    menu5a();
                    id = pobierzInt.nextInt();
                    System.out.println(id);
                    text = "nie ma takiego stanowiska";
                    switch (id) {
                        case 1:
                            text = "PREZES";
                            break;
                        case 2:
                            text = "KSIĘGOWY";
                            break;
                        case 3:
                            text = "ROBOL";
                            break;
                        case 4:
                            break;
                            default:
                                System.out.println("Zły wybór");
                    }
                System.out.println("Pracownicy zatrudnieni na stanowisku " + text + " :");
                for (Pracownik lista : listaPracownikow) {
                    if (lista.stanowisko.toString().equals(text)) {
                        System.out.println(lista);
                        istnieje = true;
                    }
                }
                if (!istnieje) {
                    System.out.println("Nie ma pracowników na stanowisku " + text);
                }

                break;
                default:
                    System.out.println("Błąd wyboru, podaj właściwą liczbę!");


            }


        }


    }
}



