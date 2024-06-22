public class java_9_sum_array {
 public static void main(String[] args) {
  int arr[] = { 1, 2, 3, 4, 5, 6 };
  int sum = 0;
  for (int i = 0; i < arr.length; i++) {
   sum = sum + arr[i];
  }
  System.out.println("sum of your array is " + sum);

  int length = arr.length;

  int avg = sum / length;

  System.out.println("avg of a array is " + avg);
 }
}
