package main.java.com.borysova.shapes;

public class Pyramid extends Shape{
    private String name;

    public Pyramid() {
        this.name = "Pyramid";
    }

    @Override
    public String displayShape() {
        return name;
    }
}
