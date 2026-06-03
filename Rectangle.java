class Rectangle {
  
    int length;
    int breadth;
    Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }
    void findArea() {
        int area = length * breadth; 

        System.out.println("Length = " + length);
        System.out.println("Breadth = " + breadth);
        System.out.println("Area = " + area);
    }

    public static void main(String[] args) {
        Rectangle rect = new Rectangle(10, 5);
        rect.findArea();
    }
}
