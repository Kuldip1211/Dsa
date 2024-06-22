public class java_6_2D_array {
 public static void main(String[] args) {
     int c = 1;
     int arr[][] = new int[4][4];
     
     // Initializing the array
     for (int i = 0; i < arr.length; i++) {
         for (int j = 0; j < arr[i].length; j++) {
             arr[i][j] = c;
             c++;
         }
     }

     // Printing the array
     for (int i = 0; i < arr.length; i++) {
         for (int j = 0; j < arr[i].length; j++) {
             System.out.print("  " + arr[i][j]);
         }
         System.out.println();
     }
 }
}
