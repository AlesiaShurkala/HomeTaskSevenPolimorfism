package com.shapes.model;

import com.shapes.model.Shape;

public class Box extends Shape {
    protected double maxVolume;

    public Box(double maxVolume) {
        this.maxVolume = maxVolume;
    }

    @Override
    public double getVolume() {
        return 0;
    }

    public boolean add(Shape shape){

        if (maxVolume-shape.getVolume()>0) {
            maxVolume=maxVolume- shape.getVolume();
            return true;
        } else {
            return false;
        }
    }
}
