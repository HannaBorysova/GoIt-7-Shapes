package main.java.com.borysova.shapes;

public class Circle extends Shape {
    private String name;

    public Circle() {
        this.name = "Circle";
    }

    @Override
    public String displayShape() {
        return name;
    }
}
