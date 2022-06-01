package com.example.frantarpg.entity;

import javafx.scene.image.Image;

import java.io.*;

public class Player {
    private String name;
    private String player_class;
    private int strength;
    private int inteligence;
    private int agility;
    private int hp;
    private int gold;

    private Image player_avatar;
    FileInputStream inputstream = null;
    Image image;

    public Image getPlayer_avatar() {
        return player_avatar;
    }

    public void setPlayer_avatar(Image player_avatar) {
        this.player_avatar = player_avatar;
    }

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
        if (docasnyString == null) {
            this.name = " ";
            this.player_class = " ";
            this.hp = 0;
            this.strength = 0;
            this.agility = 0;
            this.inteligence = 0;
            this.gold = 0;
        } else {
            pomocnaPoleOrna_a_ValecnaKamo = docasnyString.split(" ", 7);
            this.name = pomocnaPoleOrna_a_ValecnaKamo[0];
            this.player_class = pomocnaPoleOrna_a_ValecnaKamo[1];
            this.hp = Integer.parseInt(pomocnaPoleOrna_a_ValecnaKamo[2]);
            this.strength = Integer.parseInt(pomocnaPoleOrna_a_ValecnaKamo[3]);
            this.agility = Integer.parseInt(pomocnaPoleOrna_a_ValecnaKamo[4]);
            this.inteligence = Integer.parseInt(pomocnaPoleOrna_a_ValecnaKamo[5]);
            this.gold = Integer.parseInt(pomocnaPoleOrna_a_ValecnaKamo[6]);
            switch (getPlayer_class()) {
                case "Archer":
                    inputstream = new FileInputStream("FrantaRPG/src/main/resources/img/archer-main-image.jpg");
                    image = new Image(inputstream);
                    this.player_avatar = image;
                    break;
                case "Tyler1":
                    inputstream = new FileInputStream("FrantaRPG/src/main/resources/img/tyler1-main-image.jpg");
                    image = new Image(inputstream);
                    this.player_avatar = image;
                    break;
                case "Mage":
                    inputstream = new FileInputStream("FrantaRPG/src/main/resources/img/mage-main-image.jpg");
                    image = new Image(inputstream);
                    this.player_avatar = image;
                    break;
            }
        }
    }


}