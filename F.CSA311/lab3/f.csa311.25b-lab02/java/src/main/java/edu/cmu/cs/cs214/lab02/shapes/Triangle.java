// Triangle.java
package edu.cmu.cs.cs214.lab02.shapes;

public class Triangle implements Shape {
    private final double base;
    private final double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println("Drawing Triangle");
    }

    @Override
    public double getArea() {
        return 0.5 * base * height;
    }
}