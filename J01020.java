import java.util.*;

public class J01020 {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int amsk=(1<<10)-1;
       int t=sc.nextInt();
       while (t-- >0) {
         int n=sc.nextInt();
         if (n==0) {
           System.out.println("Impossible");
         }else{
           int mask=0;
          for (int i=1; i <=1000000; i++) {
            long val=i*n;
            long temp=val;
            while (temp>0) {
              mask|=(1<<(temp%10));
              temp/=10;
            }
            if (mask==amsk){
              System.out.println(val);
              break;
            }
          }
         }
         
       }
     } 
}
