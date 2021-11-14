package com.github.nutscoding.superherofactory;

public class Superman extends Superhero {

    public static Superhero createSuperman() {

        Superhero superman = new Superhero();
        superman.setName("Коля");
        superman.setStrength(9);
        superman.setLabel("DC");
        return superman;

    }
    @Override
    public void setPower() {
        System.out.println("Супер");
    }
}
