package com.workintech.pool;

public class Cuboid extends Rectangle{

    private double height;

    public double getHeight() {
        return height;
    }

    public Cuboid(double widht, double lenght, double height) {
        super(widht, lenght);
        if (height<0){
            this.height = 0;
        } else {
            this.height = height;
        }
    }

    public double getVolume(){
        return getArea()*height;
    }
}
