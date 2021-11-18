package com.github.nutscoding.superherofactory;

import com.github.nutscoding.superherofactory.heroes.Aquaman;
import com.github.nutscoding.superherofactory.heroes.Superhero;
import com.github.nutscoding.superherofactory.heroes.Batman;
import com.github.nutscoding.superherofactory.heroes.Hulk;
import com.github.nutscoding.superherofactory.heroes.Spiderman;
import com.github.nutscoding.superherofactory.heroes.Superman;
import com.github.nutscoding.superherofactory.heroes.Wolverine;


import java.util.Random;

public class HeroFactory {
    /**
     * Это метод нужен для создания супергероев.
     * @param type - тип супергероя,
     * @param name - имя,
     * @param strength - уровень силы,
     * @param label - принадлежность лейблу,
     * @param power - суперспособность
     * @return - возвращает супергероя
     */
    public Superhero getHero(Superhero.Type type,
                             String name,
                             int strength,
                             String label,
                             String power) {

        Superhero superhero = new Superhero();

        switch (type) {
            case AQUAMAN -> superhero = new Aquaman();
            case BATMAN -> superhero = new Batman();
            case HULK -> superhero = new Hulk();
            case SPIDERMAN -> superhero = new Spiderman();
            case SUPERMAN -> superhero = new Superman();
            case WOLVERINE -> superhero = new Wolverine();
            default -> new IllegalArgumentException("Такого супергероя не существует");
        }

        superhero.setName(name);
        superhero.setStrength(strength);
        superhero.setLabel(label);
        superhero.setPower(power);
        return superhero;
    }
}

