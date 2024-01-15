package com.workintech.pool;

public class Rectangle {
    private double width;
    private double length;


    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public Rectangle(double widht, double length) {
        if(widht<0){
            this.width = 0;
        } else {
            this.width = widht;
        }
        if (length <0){
            this.length = 0;
        } else {
            this.length = length;
        }
    }

    public double getArea(){
        return width* length;
    }
}
