package com.github.nutscoding.superherofactory;

public class Wolverine extends Superhero {

    public static Superhero createWolverine() {

        Superhero wolverine = new Superhero();
        wolverine.setName("Жека");
        wolverine.setStrength(5);
        wolverine.setLabel("DC");
        return wolverine;

    }

    @Override
    public void setPower() {
        System.out.println("Когти");
    }
}
