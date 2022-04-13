package com.example.frantarpg.entity;

public class Player{

    private String name;
    private int strength;
    private int inteligence;
    private int agility;
    private int hp;
    private int gold;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

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

    public int getAgility() {
        return agility;
    }

    public void setAgility(int agility) {
        this.agility = agility;
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

    public Player() {
        this.name = "";
        this.strength = 0;
        this.inteligence = 0;
        this.agility = 0;
        this.hp = 0;
        this.gold = 0;
    }




}