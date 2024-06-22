public class Java_3Bobble_sort {
 public static void Bobble(int a[]) {
  int first = 0;
  int secound = 0;
  for (int i = 0; i < a.length; i++) {
   first = a[i];
   for (int j = i + 1; j < a.length; j++) {
    secound = a[j];
    if (a[j] < a[i]) {
     int temp = a[j];
     a[j] = a[i];
     a[i] = temp;
    }
   }
  }
  for (int i = 0; i < a.length; i++) {
   System.out.print( " " +a[i]);
  }
 }

 public static void main(String[] args) {
  int arr[] = { 1, 3, 4, 2, 6, 5 };
  for (int i = 0; i < arr.length; i++) {
   System.out.print(arr[i]);
  }
  System.out.println();
  Bobble(arr);
 }
}
