package main.java.com.borysova.shapes;

public class Shape implements Display {
    private String name;

    public Shape(String name) {

        this.name = name;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    @Override
    public void displayShape() {

        System.out.println("Shape's name - " + name);
    }
}
