
class Circle {
    
    int radius;

      Circle(int radius) {
        this.radius = radius;
    }
    void calculateArea() {
        double pi = 3.14; 
        double area = pi * radius * radius;

        System.out.println("Radius = " + radius);
        System.out.println("Area = " + area);
    }

    public static void main(String[] args) {
        Circle c = new Circle(7);
        c.calculateArea();
    }
}
