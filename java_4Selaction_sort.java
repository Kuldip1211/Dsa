public class java_4Selaction_sort {
 public static void Selaction(int a[]) {

  for (int i = 0; i < a.length; i++) {
   int min = i;
   for (int j = i + 1; j < a.length; j++) {
    if (a[min] > a[j]) {
     min = j;
    }
   }
   int temp = a[min];
   a[min] = a[i];
   a[i] = temp;
  }
  for (int i = 0; i < a.length; i++) {
   System.out.print(" " + a[i]);
  }
 }

 public static void main(String[] args) {
  int arr[] = { 1, 3, 4, 2, 6, 5 };
  for (int i = 0; i < arr.length; i++) {
   System.out.print(arr[i]);
  }
  System.out.println();
  Selaction(arr);
 }
}