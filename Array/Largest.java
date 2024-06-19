import java.util.Arrays;

public class Largest {
 public static void main(String[] args) {
  int arr[] = {1, 2, 3, 4, 5, 6};
  System.out.println(Arrays.toString(arr));

  int largest =  arr[0];
  for (int i = 0; i < arr.length; i++) {
   if(arr[i]>= arr[0]){
    largest = arr[i];
   }
  }
  System.out.println(largest);
 }
}
