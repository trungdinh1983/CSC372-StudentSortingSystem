import java.util.ArrayList;
import java.util.Comparator;

public class StudentSorter {
  // Sorts any list using selection sort (finds smallest item and puts it first)
  public static <T> void selectionSort(ArrayList<T> list, Comparator<T> comparator) {
    int n = list.size();

    // Go through the list one by one
    for (int i = 0; i < n - 1; i++) {
      int minIndex = i; // Remember where the smallest item is

      // Look through remaining items to find if any are smaller
      for (int j = i + 1; j < n; j++) {
        if (comparator.compare(list.get(j), list.get(minIndex)) < 0) {
          minIndex = j;
        }
      }

      // Swap items if we found a smaller one
      if (minIndex != i) {
        T temp = list.get(i);
        list.set(i, list.get(minIndex));
        list.set(minIndex, temp);
      }
    }
  }
}