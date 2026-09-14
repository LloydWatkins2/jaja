import java.util.*;

public class J02008 {
  static long gcd(long a,long b){
    return b==0?a:gcd(b,a%b);
  }
  static long bcd(long a,long b){
    return (long) (a*b)/gcd(a,b);
  }
 public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    int t=sc.nextInt();
    while (t-- >0) {
      int n=sc.nextInt();
      if (n==1||n==2) {
        System.out.println(n);
      }else{
      long ans=bcd(1,2);
      for (long i = 3; i <= n; i++) {
        ans=bcd(ans,i);
      }
      System.out.println(ans);
      }
    }
  } 
}
