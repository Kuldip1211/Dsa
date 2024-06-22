import java.util.Arrays;

public class java_10_remove_spacific {
 public static void main(String[] args) {
  int[] array = { 1, 2, 3, 4, 5 };
  int elementToRemove = 3;

  int newSize = removeElementInPlace(array, elementToRemove);

  System.out.println("Array after removing " + elementToRemove + ": " + Arrays.toString(Arrays.copyOf(array, newSize)));
 }
 public static int removeElementInPlace(int[] array, int elementToRemove) {
  int index = -1;

  // Find the index of the element to remove
  for (int i = 0; i < array.length; i++) {
      if (array[i] == elementToRemove) {
          index = i;
          break;
      }
  }

  // If element is not found, return the original size
  if (index == -1) {
      return array.length;
  }

  // Shift elements to the left to fill the gap
  for (int i = index; i < array.length - 1; i++) {
      array[i] = array[i + 1];
  }

  // Optional: Set the last element to a default value (e.g., 0)
  array[array.length - 1] = 0;

  // Return the new size of the array
  return array.length - 1;
}
}
