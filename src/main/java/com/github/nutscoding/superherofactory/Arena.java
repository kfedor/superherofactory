package com.github.nutscoding.superherofactory;

import com.github.nutscoding.superherofactory.heroes.Superhero;

public class Arena {
    /**
     * В этом методе сражаются 2 случайных супергероя
     * @param fighter1 - супергерой 1,
     * @param fighter2 - супергерой 2
     */
    public void toFight(Superhero fighter1, Superhero fighter2) {
        if (fighter1.equals(fighter2)) {
            new IllegalArgumentException("Супергерои не могут сражаться сами с собой");
        }
        System.out.println("Сегодня на арене сразятся: " + fighter1.getName() + " и " + fighter2.getName());
        System.out.println(fighter1.getName() + " использует суперспособность: " + fighter1.getPower() +
                ", а " + fighter2.getName() + " использует суперспособность: " + fighter2.getPower());
        if (fighter1.getStrength() > fighter2.getStrength()) {
            System.out.println("Победил " + fighter1.getName());
        } else System.out.println("Победил " + fighter2.getName());
    }
}
