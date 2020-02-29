package com.company;

public class Osoba implements Akcje {
    private String name, lName;
    private int age;

    public Osoba(int zarobki,String name, String lName, int age) {
        this.name = name;
        this.lName = lName;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getlName() {
        return lName;
    }

    public int getAge() {
        return age;
    }

     void DanePracownikow() {
         System.out.println("Imię-" + this.getName() );
         System.out.println("Nazwisko-" +this.getlName() );
         System.out.println("Wiek-" +this.getAge() );
     }

    @Override
    public void idz() {
        System.out.println(this.name + " idz");
    }

    @Override
    public void jedz() {
        System.out.println(this.name + " jedz");
    }

    @Override
    public void tancz() {
        System.out.println(this.name + " tancz");
    }
}
