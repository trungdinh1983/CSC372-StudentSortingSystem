import java.util.Comparator;

/**
 * Compares two student objects based on their roll numbers.
 */
public class RollnoComparator implements Comparator<Student> {
  /**
   * Compares two student objects based on their roll numbers.
   * 
   * @param s1 The first student object to be compared.
   * @param s2 The second student object to be compared.
   * @return A negative integer, zero, or a positive integer as the first
   *         student's roll number
   *         is less than, equal to, or greater than the second student's roll
   *         number.
   */
  @Override
  public int compare(Student s1, Student s2) {
    return Integer.compare(s1.getRollno(), s2.getRollno());
  }
}