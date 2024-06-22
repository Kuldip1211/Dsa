public class java_5_insertion_sort {

 public static void Insertion(int a[]){
  for (int i = 0; i < a.length; i++) {
   int current = a[i];
   int prev = i-1;
   while (prev >= 0 && a[prev] > current) {
    a[prev+1] = a[prev]; 
    prev--;
   }
   a[prev+1] = current;
  }
  for (int i = 0; i < a.length; i++) {
   System.out.print( " " +a[i]);
  }
 }
 public static void main(String[] args) {
  int arr[] = { 1, 3, 4, 2, 6, 5 };
  for (int i = 0; i < arr.length; i++) {
   System.out.print( " " +arr[i]);
  }
  System.out.println();
  Insertion(arr);
 }
}
