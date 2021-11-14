package com.github.nutscoding.superherofactory;

import com.github.nutscoding.superherofactory.Batman;
import com.github.nutscoding.superherofactory.Aquaman;
import com.github.nutscoding.superherofactory.Hulk;

public class  Factory {

    public enum TypeOfHero {
        AQUAMAN,
        BATMAN,
        HULK,
        SPIDERMAN,
        SUPERMAN,
        WOLVERINE
    }

    public static Object getHero(TypeOfHero type) {

        switch (type) {
            case AQUAMAN:
                return Aquaman.createAquaman();
            case BATMAN:
                return Batman.createBatman();
            case HULK:
                return Hulk.createHulk();
            case SPIDERMAN:
                return Spiderman.createSpiderman();
            case SUPERMAN:
                return Superman.createSuperman();
            case WOLVERINE:
                return Wolverine.createWolverine();
        }
        return type;
    }
}

