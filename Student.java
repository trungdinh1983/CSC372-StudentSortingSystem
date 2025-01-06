/**
 * Represents a student with a roll number, name, and address.
 */
public class Student {
    private int rollno;
    private String name;
    private String address;

    /**
     * Constructs a new student object with the given roll number, name, and
     * address.
     * 
     * @param rollno  The roll number of the student.
     * @param name    The name of the student.
     * @param address The address of the student.
     */
    public Student(int rollno, String name, String address) {
        this.rollno = rollno;
        this.name = name;
        this.address = address;
    }

    /**
     * Returns the roll number of the student.
     * 
     * @return The roll number of the student.
     */
    public int getRollno() {
        return rollno;
    }

    /**
     * Returns the name of the student.
     * 
     * @return The name of the student.
     */
    public String getName() {
        return name;
    }

    /**
     * Returns the address of the student.
     * 
     * @return The address of the student.
     */
    public String getAddress() {
        return address;
    }

    /**
     * Returns a string representation of the student object.
     * 
     * @return A string containing the student's roll number, name, and address.
     */
    @Override
    public String toString() {
        return "Student [rollno=" + rollno + ", name=" + name + ", address=" + address + "]";
    }
}