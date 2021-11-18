package com.github.nutscoding.superherofactory.heroes;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Superhero {


    public enum Type {
        AQUAMAN,
        BATMAN,
        HULK,
        SPIDERMAN,
        SUPERMAN,
        WOLVERINE
    }

    private String name;
    private int strength;
    private String label;
    private Type type;
    private String power;
}
