import java.util.*;

public class J01024 {
 public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    int t= sc.nextInt();
    while (t-- >0) {
      long n=sc.nextLong();
      boolean f=true;
      while (n>0) {
        if (n%10>2) {
          f=false;
          break;
        }
        n/=10;
      }
      System.out.println(f?"YES":"NO");
    }
  } 
}
