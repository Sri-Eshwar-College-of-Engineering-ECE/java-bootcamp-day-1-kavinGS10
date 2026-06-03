
class Circle {
    // Instance variable
    int radius;

    // Constructor
    Circle(int radius) {
        this.radius = radius;
    }

    // Method using local variable
    void calculateArea() {
        double pi = 3.14; // Local variable
        double area = pi * radius * radius;

        System.out.println("Radius = " + radius);
        System.out.println("Area = " + area);
    }

    public static void main(String[] args) {
        Circle c = new Circle(7);
        c.calculateArea();
    }
}