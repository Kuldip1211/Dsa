import java.nio.file.SimpleFileVisitor;

public class java_7_palidron {
 public static void main(String[] args) {
  String str = "kanbha";
  int count = 0;
  for (int i = 0; i < str.length()/2; i++) {
   int n = str.length();
   if (str.charAt(i) != str.charAt(n-1-i)) {
    count = 0;
   }
   else{
    count = 1;
   }
  }
  if (count == 1) {
   System.out.println("palidron");
  }
  else{
   System.out.println("not palidron");
  }
 }
}
