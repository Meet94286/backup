package com.company.enc;

public abstract class Animal  {
    private int legs;
    private String name;

    public Animal(int legs, String name){
        this.legs = legs;
        this.name = name;
    }

    protected Animal() {
    }

    public static void makerun(Animal animal){
        animal.jump();
        System.out.println("Animal is running");
    }

    public abstract void jump();

    public  void eat(){
        System.out.println("Animal is eating");
    }

    public int getLegs(){
        return  legs;
    }
    public void setLegs(int legs){
        this.legs = legs;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public String walk(){
        String w = "walking";
        return w;
    }
}
