import java.util.*;

public class J01017 {
  public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    int t=sc.nextInt();
    while (t-- >0) {
      long n=sc.nextLong();
      long pre=n%10;
      int plag=1;
      n/=10;
      while (n>0) {
        if (Math.abs(n%10-pre)!=1) {
          plag=0;
          break;
        }else{
          pre=n%10;
        }
        n/=10;
      }
      System.out.println(plag==1?"YES":"NO");
    }
  }
}
