package main.java.com.borysova.shapes;

public class Cuboid extends Shape{
    private String name;

    public Cuboid() {
        this.name = "Cuboid";
    }

    @Override
    public String displayShape() {
        return name;
    }
}
