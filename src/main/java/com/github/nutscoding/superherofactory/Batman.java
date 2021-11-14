package com.github.nutscoding.superherofactory;

public class Batman extends Superhero {

    public static Superhero createBatman() {

        Superhero batman = new Superhero();
        batman.setName("Володя");
        batman.setStrength(3);
        batman.setLabel("DC");
        return batman;
    }

    @Override
    public void setPower() {
        System.out.println("Деньги");
    }
}
