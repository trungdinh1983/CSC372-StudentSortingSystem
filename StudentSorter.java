import java.util.ArrayList;
import java.util.Comparator;

public class StudentSorter {
  public static void main(String[] args) {
    // Create an ArrayList to store student objects
    ArrayList<Student> students = new ArrayList<>();

    // Add 10 student objects to the ArrayList
    students.add(new Student(5, "Liam", "789 Elm St"));
    students.add(new Student(2, "Ava", "123 Oak Ave"));
    students.add(new Student(8, "Noah", "456 Pine Rd"));
    students.add(new Student(1, "Emma", "321 Cedar Ln"));
    students.add(new Student(9, "Oliver", "654 Birch St"));
    students.add(new Student(3, "Sophia", "987 Maple Dr"));
    students.add(new Student(7, "William", "246 Spruce Ave"));
    students.add(new Student(4, "Isabella", "135 Oak St"));
    students.add(new Student(10, "James", "864 Pine Ave"));
    students.add(new Student(6, "Mia", "579 Elm St"));

    // Sort students by name using selection sort
    selectionSort(students, new NameComparator());
    System.out.println("Students sorted by name:");
    printStudents(students);

    // Sort students by roll number using selection sort
    selectionSort(students, new RollnoComparator());
    System.out.println("\nStudents sorted by roll number:");
    printStudents(students);
  }

  /**
   * Performs selection sort on a list of elements using a specified comparator.
   * 
   * @param list       The list of elements to be sorted.
   * @param comparator The comparator used to compare elements.
   */
  public static <T> void selectionSort(ArrayList<T> list, Comparator<? super T> comparator) {
    int n = list.size();

    // Iterate through the list, selecting the minimum element in each pass
    for (int i = 0; i < n - 1; i++) {
      int minIndex = i;

      // Find the index of the minimum element in the unsorted portion of the list
      for (int j = i + 1; j < n; j++) {
        if (comparator.compare(list.get(j), list.get(minIndex)) < 0) {
          minIndex = j;
        }
      }

      // Swap the minimum element with the first element of the unsorted portion
      T temp = list.get(minIndex);
      list.set(minIndex, list.get(i));
      list.set(i, temp);
    }
  }

  /**
   * Prints the details of each student in the given list.
   * 
   * @param students The list of students to be printed.
   */
  public static void printStudents(ArrayList<Student> students) {
    for (Student student : students) {
      System.out.println(student);
    }
  }
}