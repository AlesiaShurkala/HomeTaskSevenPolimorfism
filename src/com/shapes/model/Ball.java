package com.shapes.model;

public class Ball extends SolidOfRevolution {
    public Ball(double radius) {
        super(radius);
    }

    @Override
    public double getVolume() {
        double ballVolume=4.0/3.0* Shape.PI*Math.pow(radius,3);
        return ballVolume;
    }
}
