package com.company;

public class Kierownik extends Osoba {
    private int earnings;

    public Kierownik(int earnings, String name, String lName, int age) {
        super(earnings, name, lName, age);
        this.earnings = earnings;
    }

    @Override
    void DanePracownikow() {
        System.out.println("Imię-" + this.getName() );
        System.out.println("Nazwisko-" +this.getlName() );
        System.out.println("Wiek-" +this.getAge() );

    }
}