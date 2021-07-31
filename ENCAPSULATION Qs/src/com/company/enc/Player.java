package com.company.enc;

public class Player {
    private  static  int maxHealth = 100;
    private  String name;
    private  int currentHealth;

    public Player(String name) {
        this.name = name;
        this.currentHealth = maxHealth;
    }

    public String getName() {
        return name;
    }
    public  void setName(String name){
        this.name = name;
    }
    public  int getCurrentHealth() {
        return currentHealth;
    }
    public void setCurrentHealth(int currentHealth) {
        this.currentHealth = currentHealth;
    }



    }
