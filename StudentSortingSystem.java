
// StudentSortingSystem.java - Main program that demonstrates student sorting
import java.util.ArrayList;
import java.util.Comparator;

public class StudentSortingSystem {
  public static void main(String[] args) {
    // Print welcome message
    System.out.println("Welcome to Student Sorting System");
    System.out.println("--------------------------------");

    // Make a new list to hold our students
    ArrayList<Student> students = new ArrayList<>();

    // Add 10 students to our list
    System.out.println("Adding students to the system...");
    students.add(new Student(103, "Charlie", "789 Pine St"));
    students.add(new Student(101, "Alice", "123 Oak St"));
    students.add(new Student(105, "Eve", "321 Maple Ave"));
    students.add(new Student(102, "Bob", "456 Elm St"));
    students.add(new Student(104, "David", "654 Cedar Rd"));
    students.add(new Student(107, "Grace", "147 Birch Ln"));
    students.add(new Student(106, "Frank", "258 Spruce Dr"));
    students.add(new Student(109, "Ivy", "369 Ash Ct"));
    students.add(new Student(108, "Henry", "951 Walnut Pl"));
    students.add(new Student(110, "Jack", "753 Fir Way"));

    // Show students before sorting
    System.out.println("\nOriginal Student List:");
    System.out.println("---------------------");
    printStudents(students);

    // Sort by name and show results
    StudentSorter.selectionSort(students, new StudentNameComparator());
    System.out.println("\nStudents Sorted by Name:");
    System.out.println("-----------------------");
    printStudents(students);

    // Sort by roll number and show results
    StudentSorter.selectionSort(students, new StudentRollNoComparator());
    System.out.println("\nStudents Sorted by Roll Number:");
    System.out.println("-----------------------------");
    printStudents(students);
  }

  // Prints each student's info on a new line
  private static void printStudents(ArrayList<Student> students) {
    for (Student student : students) {
      System.out.println(student);
    }
  }
}