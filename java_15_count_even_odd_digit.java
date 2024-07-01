public class java_15_count_even_odd_digit {
 public static void main(String[] args) {
  int num = 666666;
  int even = 0;
  int odd = 0;
  while (num > 0) {
   int temp = num%10; 
   if (temp % 2 == 0) {
    even++;
   }
   else{
    odd++;
   }
   num /= 10;
  }
  System.out.println("even digits "+even+ "  odd digits " +odd);
 }
}
