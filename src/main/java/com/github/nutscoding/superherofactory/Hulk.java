package com.github.nutscoding.superherofactory;

public class Hulk extends Superhero {

    public static Superhero createHulk() {

        Superhero hulk = new Superhero();
        hulk.setName("Иван");
        hulk.setStrength(10);
        hulk.setLabel("Marvel");
        return hulk;

    }
    @Override
    public void setPower() {
        System.out.println("Сила");
    }
}
