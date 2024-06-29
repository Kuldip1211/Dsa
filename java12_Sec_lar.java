public class java12_Sec_lar {
 public static void main(String[] args) {
  System.out.println("hello world");

  int arr[] = { 1, 3, 4, 9, 8, 7, 5, 6 };
  int largest = 0;
  int secound_largest = 0;

  for (int i = 0; i < arr.length; i++) {
   System.out.print(" " + arr[i]);
  }

// 1 common method to find gretest and secound gretest find in array 

  // for (int i = 0; i < arr.length; i++) {
  // for (int j = i+1; j < arr.length; j++) {
  // if (arr[j] < arr[i]) {
  // int temp = arr[j];
  // arr[j] = arr[i];
  // arr[i] = temp;
  // }
  // }
  // }

  // System.out.println("\n\nSorted array");
  // for (int i = 0; i < arr.length; i++) {
  // System.out.print(" " + arr[i]);
  // if (i == arr.length - 1) {
  // largest = arr[i];
  // }
  // else if (i == arr.length - 2) {
  // secound_largest = arr[i];
  // }
  // }

  System.out.println("");
  // System.out.println("largest:=" + largest);
  // System.out.println("Secound largest:=" + secound_largest);


  // secound approch with out a sorting 

  for (int i = 0; i < arr.length; i++) {
   if (arr[i]> largest) {
    largest = arr[i];
   }
   if (arr[i] > secound_largest && arr[i] < largest) {
    secound_largest = arr[i];
   }
  }
  System.out.println("largest:=" + largest);
  System.out.println("Secound largest:=" + secound_largest);
 }
}
