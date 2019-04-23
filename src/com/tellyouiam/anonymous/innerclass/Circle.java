package com.tellyouiam.anonymous.innerclass;

public class Circle implements Geometry {

    protected String name;

    private float radius;

    //Constructor

    public Circle(float radius) {
        this.name = "Circle";
        this.radius = radius;
    }

    @Override
    public void enterRadius(float radius) {
        this.radius = radius;

    }

    @Override
    public float Perimeter() {
        return 2 * PI * radius;
    }

    @Override
    public float area() {
        return PI * radius * radius;
    }

    @Override
    public void exportInformation() {
        System.out.println(name);
        System.out.println("Perimeter: " + Perimeter());
        System.out.println("Area: " + area());
    }

    public static void main(String[] args) {
        //Khai báo lớp HữU DANH circle
        Circle circle = new Circle(10);
        circle.exportInformation();
    }
}
