package org.example;

public class Main {
    public static void main(String[] args) {
        //Inject Dependency to Girl Class through Constructor Injection
        Girl lisa = new Girl(new Shirt());
        lisa.showOutFit();

        //Inject Dependency to Girl Class through Setter Injection
        lisa.setOutfit(new Pant());
        lisa.showOutFit();

        lisa.setOutfit(new Bikini());
        lisa.showOutFit();
    }
}