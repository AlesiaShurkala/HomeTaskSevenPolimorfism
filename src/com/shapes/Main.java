package com.shapes;

import com.shapes.model.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите максимальный объём: ");
        double maxVolume = scanner.nextDouble();
        Box boxOne = new Box(maxVolume);
        Shape ballOne = new Ball(22);
        Shape pyramidOne = new Pyramid(41, 15);
        Shape cylinderOne = new Cylinder(15, 15);
        System.out.println("Объём шара:" + ballOne.getVolume());
        System.out.println("Объём пирамиды:" + pyramidOne.getVolume());
        System.out.println("Объём цилиндра:" + cylinderOne.getVolume());
        System.out.println(boxOne.add(ballOne));
        System.out.println(boxOne.add(pyramidOne));
        System.out.println(boxOne.add(cylinderOne));
    }
}
