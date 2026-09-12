import java.util.*;

public class J01018 {
  public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    int t=sc.nextInt();
    while (t-- >0) {
      long n=sc.nextLong();
      long pr=n%10;
      long count=pr;
      int flag=1;
      n/=10;
      while (n>0) {
        if (Math.abs(n%10-pr)!=2) {
          flag=0;
          break;
        }else{
          pr=n%10;
        }
        count+=pr;
        n/=10;
      }
      System.out.println(flag==1&&count%10==0?"YES":"NO");

    }
  }
}
