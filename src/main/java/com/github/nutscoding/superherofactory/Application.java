package com.github.nutscoding.superherofactory;

import com.github.nutscoding.superherofactory.heroes.Superhero;

import java.util.Random;

/**
 * В этом классе мы получаем супергероев из фабрики,
 * наделяем их характеристиками и отправляем случайно выбранных
 * на арену для сражения.

 */

public class Application {

    private static final Random RANDOM = new Random();

    public static void main(String[] args) {
        HeroFactory factory = new HeroFactory();
        Superhero aquaman = factory.getHero(
                Superhero.Type.AQUAMAN,
                "Серёга",
                8,
                "DC",
                "Вода");
        Superhero batman = factory.getHero(
                Superhero.Type.BATMAN,
                "Володя",
                3,
                "DC",
                "Деньги");
        Superhero hulk = factory.getHero(
                Superhero.Type.HULK,
                "Иван",
                3,
                "DC",
                "Сила");
        Superhero spiderman = factory.getHero(
                Superhero.Type.SPIDERMAN,
                "Петя",
                3,
                "DC",
                "Паутина");
        Superhero superman = factory.getHero(
                Superhero.Type.SUPERMAN,
                "Коля",
                3,
                "DC",
                "Полёт");
        Superhero wolverine = factory.getHero(
                Superhero.Type.WOLVERINE,
                "Василий Петрович",
                3,
                "DC",
                "Когти");

        int index;
        Superhero[] heroes = new Superhero[6];
        heroes[0] = aquaman;
        heroes[1] = batman;
        heroes[2] = hulk;
        heroes[3] = spiderman;
        heroes[4] = superman;
        heroes[5] = wolverine;
        index = RANDOM.nextInt(6);
        Superhero fighter1 = heroes[index];
        index = RANDOM.nextInt(6);
        Superhero fighter2 = heroes[index];

        Arena arena = new Arena();
        arena.toFight(fighter1, fighter2);
    }
}
