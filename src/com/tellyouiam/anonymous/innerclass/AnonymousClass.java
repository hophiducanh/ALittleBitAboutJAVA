package com.tellyouiam.anonymous.innerclass;

public class AnonymousClass {
    public static void main(String[] args) {
        Geometry anyGeometry = new Geometry() {

            String myName = "Chris";

            float radius = 10;

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
                System.out.println("Anonymous Geometry");
                System.out.println("Chu vi: " + Perimeter());
                System.out.println("Area: " + area());
            }

            //Không thể dùng constructor trong Anonymous class cho nên cần dùng initialization block
            {
                System.out.println(myName);
            }
        };
        anyGeometry.exportInformation();
    }
}
