package com.github.nutscoding.superherofactory;

public class Spiderman extends Superhero {

    public static Superhero createSpiderman() {

        Superhero spiderman = new Superhero();
        spiderman.setName("Петя");
        spiderman.setStrength(7);
        spiderman.setLabel("Marvel");
        return spiderman;

    }
    @Override
    public void setPower() {
        System.out.println("Паутина");
    }
}
