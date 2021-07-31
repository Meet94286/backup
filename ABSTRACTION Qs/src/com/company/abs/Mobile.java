package com.company.abs;

public class Mobile {
    String brand;
    int price;

    Mobile() {
        System.out.println("object created through");

    }

    Mobile(String brand, int price){
        this.brand = brand;
        this.price = price;

    }

    String getDetails(){
        return "brand: " + this.brand + ", price: " + this.price;
    }


}
