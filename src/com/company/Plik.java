package com.company;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Plik {
    boolean pusty;
    static List<String> odczytZPliku;

    public static List<String> odczyt() {
        if (Files.exists(Paths.get("plik.txt"))) {
            try {
                odczytZPliku = Files.readAllLines(Paths.get("plik.txt"));
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            try {
                FileWriter plik = new FileWriter("plik.txt");
                plik.write("pusty");
                plik.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return odczytZPliku;
    }
}
