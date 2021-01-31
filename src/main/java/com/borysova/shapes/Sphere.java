package main.java.com.borysova.shapes;

public class Sphere extends Shape{
    private String name;

    public Sphere() {
        this.name = "Sphere";
    }

    @Override
    public String displayShape() {
        return name;
    }
}
