package com.company;

public abstract class Pracownik extends Oddzialy {
    int id;
    String imie;
    String nazwisko;
    String adres;
    Stanowiska stanowisko;

    public String toString() {

        return "Pracownik #" + id + ": " + imie + " " + nazwisko + ", zatrudniony na stanowisku: " + stanowisko
                + " w oddziale: " + oddzial;
    }
    boolean sprawdzID(int noweID, int istniejąceID ) {
        return (noweID == istniejąceID);
    }
    boolean sprawdzImieiNazwisko(String noweImie, String noweNazwisko,String istniejaceImie, String istniejaceNazwisko){
        return (istniejaceImie.equalsIgnoreCase(noweImie) && istniejaceNazwisko.equalsIgnoreCase(noweNazwisko));
    }
}
