public class subarray {
 public static void Subarray(int arr[]) {
     for (int i = 0; i < arr.length; i++) {
         for (int j = i; j < arr.length; j++) {
             int sum = 0;
             for (int k = i; k <= j; k++) {
                 System.out.print(arr[k] + " ");
                 sum += arr[k];
             }
             System.out.print("  subarray sum: " + sum);
             System.out.println();
         }
         System.out.println();
     }
 }

 public static void main(String[] args) {
     System.out.println("Print the sum of subarrays:");
     int arr[] = {2, 4, 6, 8};
     Subarray(arr);
 }
}
