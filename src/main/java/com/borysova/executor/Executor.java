package main.java.com.borysova.executor;

import main.java.com.borysova.shapes.*;

public class Executor {
    public void execute() {
        Shape circle = new Circle("Circle");
        circle.displayShape();

        Shape rectangle = new Rectangle("Rectangle");
        rectangle.displayShape();

        Shape cuboid = new Cuboid("Cuboid");
        cuboid.displayShape();

        Shape sphere = new Sphere("Sphere");
        sphere.displayShape();

        Shape pyramid = new Pyramid("Pyramid");
        pyramid.displayShape();
    }
}
