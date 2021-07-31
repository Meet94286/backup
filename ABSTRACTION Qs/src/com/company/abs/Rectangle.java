package com.company.abs;

public class Rectangle {
    int length;
    int width;

    Rectangle(int length, int width){
        this.length = length;
        this.width = width;
    }

    public  int getPerimeter() {
        int ans = (length + width) * 2;
        return ans;
    }
    public  int getArea(){
        int ans = length*width;
        return ans;}

    }
