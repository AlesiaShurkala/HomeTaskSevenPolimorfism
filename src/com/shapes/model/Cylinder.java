package com.shapes.model;

public class Cylinder extends SolidOfRevolution {
    protected double height;

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    @Override
    public double getVolume() {
        double cylinderVolume=height*PI*Math.pow(radius,2);
        return cylinderVolume;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
