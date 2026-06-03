
class student {
    
    String name;
    int rollNo;

    
    student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

   
    void display() {
        String college = "ABC Engineering College"; 

        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("College: " + college);
    }

    public static void main(String[] args) {
        student s = new student("Raj", 101);
        s.display();
    }
}