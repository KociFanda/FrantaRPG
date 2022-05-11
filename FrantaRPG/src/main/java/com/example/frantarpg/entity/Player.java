package com.example.frantarpg.entity;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Player{
    private String name;
    private String player_class;
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

    public String getPlayer_class() {
        return player_class;
    }

    public void setPlayer_class(String player_class) {
        this.player_class = player_class;
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

    public Player() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("save.txt"));
        String[] pomocnaPoleOrna_a_ValecnaKamo;
        String docasnyString = br.readLine();
        pomocnaPoleOrna_a_ValecnaKamo = docasnyString.split(" ", 7);

        this.name = pomocnaPoleOrna_a_ValecnaKamo[0];
        this.player_class = pomocnaPoleOrna_a_ValecnaKamo[1];
        this.hp = Integer.parseInt(pomocnaPoleOrna_a_ValecnaKamo[2]);
        this.strength = Integer.parseInt(pomocnaPoleOrna_a_ValecnaKamo[3]);
        this.agility = Integer.parseInt(pomocnaPoleOrna_a_ValecnaKamo[4]);
        this.inteligence = Integer.parseInt(pomocnaPoleOrna_a_ValecnaKamo[5]);
        this.gold = Integer.parseInt(pomocnaPoleOrna_a_ValecnaKamo[6]);
    }




}