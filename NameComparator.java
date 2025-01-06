import java.util.Comparator;

/**
 * Compares two student objects based on their names.
 */
public class NameComparator implements Comparator<Student> {
  /**
   * Compares two student objects based on their names.
   * 
   * @param s1 The first student object to be compared.
   * @param s2 The second student object to be compared.
   * @return A negative integer, zero, or a positive integer as the first
   *         student's name
   *         is less than, equal to, or greater than the second student's name.
   */
  @Override
  public int compare(Student s1, Student s2) {
    return s1.getName().compareTo(s2.getName());
  }
}