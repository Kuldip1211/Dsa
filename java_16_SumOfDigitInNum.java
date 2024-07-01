public class java_16_SumOfDigitInNum {
 public static void main(String[] args) {
  int num = 55555;
  int sum = 0;
  while (num > 0) {
   sum = sum + num%10;
   num = num / 10;
  }
  System.out.println(sum);
 } 
}
