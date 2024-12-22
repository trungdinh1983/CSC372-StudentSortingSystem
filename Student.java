// Student.java - Defines what information we store for each student
public class Student {
    // Student's basic information
    private int rollno;      // ID number for the student
    private String name;     // Student's name
    private String address;  // Where the student lives
    
    // Creates a new student with their info
    public Student(int rollno, String name, String address) {
        this.rollno = rollno;
        this.name = name;
        this.address = address;
    }
    
    // Methods to get student info since our variables are private
    public int getRollno() { return rollno; }
    public String getName() { return name; }
    public String getAddress() { return address; }
    
    // Makes student info print nicely
    @Override
    public String toString() {
        return "Student[rollno=" + rollno + ", name=" + name + ", address=" + address + "]";
    }
}