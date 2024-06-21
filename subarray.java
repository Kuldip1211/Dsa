public class subarray {
 public static void Subarray(int arr[]) {
  for (int i = 0; i < arr.length; i++) {
   for (int j = i; j < arr.length; j++) {
    for (int k = i; k <= j; k++) {
     System.out.print(arr[k]);
    }
    System.out.println();
   }
   System.out.println();
  }
 }

 public static void main(String[] args) {
  System.out.println("print the sum of sub arrays");
  int arr[] = { 2,4,6,8 };
  Subarray(arr);
 }
}
