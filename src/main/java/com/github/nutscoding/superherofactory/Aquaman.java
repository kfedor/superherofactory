package com.github.nutscoding.superherofactory;

public class Aquaman extends Superhero {

    public static Superhero createAquaman() {

        Superhero aquaman = new Superhero();
        aquaman.setName("Серёга");
        aquaman.setStrength(8);
        aquaman.setLabel("DC");
        return aquaman;

    }
    @Override
    public void setPower() {
        System.out.println("Вода");
    }
}
