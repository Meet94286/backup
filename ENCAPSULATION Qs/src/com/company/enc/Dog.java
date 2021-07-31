package com.company.enc;

public class Dog extends Animal {
    private  int eyes;

    public Dog(int legs, int eyes, String name){
        super(legs, name);
        this.eyes = eyes;
    }

    public Dog() {

    }

    public Dog(int legs, String name) {
        super(legs, name);
    }

    public void jump(){
        System.out.println("DOG IS JUMPING");
    }

    public void activity(){
        System.out.println("dog is barking");
    }



    public int getEyes() {
        return eyes;
    }

    public void setEyes(int eyes) {
        this.eyes = eyes;
    }
    public  String details(){
        String s = super.getName() + " " + super.getLegs() + " " + this.eyes;
        return  s;
    }

    }

    //@Override
    /*public String walk() {
        System.out.println("walking");
        return null;*/


