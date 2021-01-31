package main.java.com.borysova.shapes;

import main.java.com.borysova.shapes.*;

public class ShapeService {
    public void printName() {
          Shape circle = new Circle();
          System.out.println(circle.displayShape());
          Shape cuboid = new Cuboid();
          System.out.println(cuboid.displayShape());
          Shape pyramid = new Pyramid();
          System.out.println(pyramid.displayShape());
          Shape rectangle = new Rectangle();
          System.out.println(rectangle.displayShape());
          Shape sphere = new Sphere();
          System.out.println(sphere.displayShape());
      }
}
