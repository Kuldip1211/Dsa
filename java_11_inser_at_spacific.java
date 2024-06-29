import java.util.Arrays;

public class java_11_inser_at_spacific {
 public static void main(String[] args) {
   int[] array = { 1, 2, 4, 5 };
  int elementToRemove = 3;
  int inset_index = 2;

  int newSize = insertElementInPlace(array, elementToRemove,inset_index);

  System.out.println("Array after removing " + elementToRemove + ": " + Arrays.toString(Arrays.copyOf(array, newSize)));

 }
 public static int insertElementInPlace(int[] array, int elementToRemove, int inset_index) {

  // Find the index of the element to remove


  // If element is not found, return the original size
  if (inset_index == -1) {
      return array.length;
  }

  // Shift elements to the left to fill the gap
  for (int i = inset_index; i < array.length ; i++) {
      array[i] = elementToRemove;
      array[i+1] = array[i];
  }

  // Optional: Set the last element to a default value (e.g., 0)
  array[array.length + 1] = 0;

  // Return the new size of the array
  return array.length+ 1;
}
}
