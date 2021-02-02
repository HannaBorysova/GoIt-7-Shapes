package main.java.com.borysova.shapes;

public class Rectangle extends Shape {
    private String name;

    public Rectangle() {

        this.name = "Rectangle";
    }

    @Override
    public String displayShape() {
        return name;
    }
}
