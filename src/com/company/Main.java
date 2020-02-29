package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        ArrayList<Osoba> pracownicy = new ArrayList<>(
                Arrays.asList(
                        new Osoba(4000, "Marcin", "Wisniewski", 30),
                        new Osoba(2000, "Tomasz", "Macierewicz", 15)
                )
        );
        ArrayList<Kierownik> kierownik = new ArrayList<>(
                Arrays.asList(
                        new Kierownik(5000, "Adam", "Michałicz", 45),
                        new Kierownik(5000, "Adam", "Michałicz", 45)
                )
        );
       
}