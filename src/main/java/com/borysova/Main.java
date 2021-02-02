package main.java.com.borysova;

import main.java.com.borysova.shapes.*;

public class Main {

    public static void main(String[] args) {
        ShapeService shapeName = new ShapeService();
        System.out.println(shapeName.printName(new Circle()));
        System.out.println(shapeName.printName(new Cuboid()));
        System.out.println(shapeName.printName(new Pyramid()));
        System.out.println(shapeName.printName(new Rectangle()));
        System.out.println(shapeName.printName(new Sphere()));
    }
}
