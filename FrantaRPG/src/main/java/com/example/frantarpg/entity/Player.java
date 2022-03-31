package com.example.frantarpg.entity;

public class Player{

    private String name;
    private int dmg;
    private int hp;
    private int gold;

    //attributes
    private int strength;
    private int inteligence;

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getInteligence() {
        return inteligence;
    }

    public void setInteligence(int inteligence) {
        this.inteligence = inteligence;
    }


    public Player(String name, int dmg, int hp, int gold, int strength, int inteligence) {
        this.name = name;
        this.dmg = dmg;
        this.hp = hp;
        this.gold = gold;
        this.strength = strength;
        this.inteligence = inteligence;
    }


    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Player(String name, int dmg, int hp, int gold) {
        this.name = name;
        this.dmg = dmg;
        this.hp = hp;
        this.gold = gold;
    }

    public int getDmg() {
        return dmg;
    }

    public void setDmg(int dmg) {
        this.dmg = dmg;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getGold() {
        return gold;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }

}