package com.company;

abstract public class Pracownicy extends Osoba {
    private int earnings;

    public Pracownicy(int earnings, String name, String lName, int age) {
        super(earnings,name, lName, age);
        this.earnings = earnings;
    }

    @Override
    void DanePracownikow() {


    }
}