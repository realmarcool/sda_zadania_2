package com.company;

public abstract class Pracownik extends Oddzialy {
    int id;
    String imie;
    String nazwisko;
    Stanowiska stanowisko;

    public String toString() {

        return "Pracownik #" + id + ": " + imie + " " + nazwisko + ", zatrudniony na stanowisku: " + stanowisko
                + " w oddziale: " + oddzial;
    }
    public boolean sprawdzID(int noweID, int istniejąceID ) {
        return (noweID == istniejąceID);
    }
    public boolean sprawdzImieiNazwisko(String noweImie, String noweNazwisko,String istniejaceImie, String istniejaceNazwisko){
        return (istniejaceImie.equals(noweImie) && istniejaceNazwisko.equals(noweNazwisko));
    }
}
