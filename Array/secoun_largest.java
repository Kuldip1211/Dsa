import java.util.Arrays;

public class secoun_largest {

 public static void Largest(int arr[]){
   
  System.out.println(Arrays.toString(arr));
  int largest = 0;
  for (int i = 0; i < arr.length; i++) {
   if (arr[i] >= largest){
    largest = arr[i];
   }
  }
  System.out.println(largest + " :- largest elemant in the array");
 }


 // secound method
 public static void Largest_m2(int arr[]) {
  if (arr == null || arr.length < 2) {
    System.out.println("Array does not have enough elements.");
    return;
  }

  int largest = Integer.MIN_VALUE;
  int second_largest = Integer.MIN_VALUE;

  for (int i = 0; i < arr.length; i++) {
    if (arr[i] > largest) {
      second_largest = largest;
      largest = arr[i];
    } else if (arr[i] > second_largest && arr[i] != largest) {
      second_largest = arr[i];
    }
  }

  if (second_largest == Integer.MIN_VALUE) {
    System.out.println("There is no second largest element.");
  } else {
    System.out.println("The second largest element is: " + second_largest);
  }
}

 public static void main(String[] args) {

  // once you sorted the array is brute method
  int arr[] = { 11,12,13,14,15 };
  // Largest(arr);


  // secound method without the sorting an array
  Largest_m2(arr);
 }
}
