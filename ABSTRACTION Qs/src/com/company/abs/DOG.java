package com.company.abs;

public class DOG {
    String name;
    String owner;
    boolean male;

    DOG(String name, String owner, boolean male){
        this.name = name;
        this.owner = owner;
        this.male = true;}

        DOG(DOG dog){
        dog.name = name;
        dog.owner = owner;
        if(dog.male == true){
            System.out.println("male");}
        else if(dog.male == false){
            System.out.println("female");}}}
