public class java_13_left_ro {
 public static void main(String[] args) {
     int arr[] = { 1, 3, 4, 9, 8, 7, 5, 6 };
     int shiftBy = 3; // Number of positions to shift left

     // Perform left rotation by 'shiftBy' positions
     for (int shift = 0; shift < shiftBy; shift++) {
         int temp = arr[0];
         for (int i = 0; i < arr.length - 1; i++) {
             arr[i] = arr[i + 1];
         }
         arr[arr.length - 1] = temp;
     }

     // Print the rotated array
     for (int i = 0; i < arr.length; i++) {
         System.out.print(" " + arr[i]);
     }
 }
}
