import java.util.Comparator;

public class StudentRollNoComparator implements Comparator<Student> {
  // Compare students by their roll numbers (numerical order)
  @Override
  public int compare(Student s1, Student s2) {
    return s1.getRollno() - s2.getRollno();
  }
}
