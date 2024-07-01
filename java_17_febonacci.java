public class java_17_Febonacci {
 public static void main(String[] args) {
  int r1 = 0;
  int r2 = 1;
  int reange = 20;
  System.out.print(r1+ " ");
  System.out.print(r2 );
  for (int i = 0; i < reange-2; i++) {
   int r3 = r2 + r1;
   r1=r2;
   r2=r3;
   System.out.print(" "+r3 + "");
  }
 }
}
