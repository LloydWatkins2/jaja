import java.util.*;

public class J02022 {
  static int[] x=new int[11];
  static int[] b=new int[11];

  static void quailui(int i,int n){
    for(int j=1;j<=n;j++){
      if(b[j]==0){
         x[i]=j;
          b[j]=1;
          quailui(i+1, n);
          b[j]=0;
        if(i==n){
          int flag=1;
          for (int ik = 1; ik <= n-1; ik++) {
            if (Math.abs(x[ik+1]-x[ik])==1) {
              flag=0;
              break;
            }
          }
          if (flag==1) {
           for (int ie=1; ie <= n; ie++) {
              System.out.printf("%d",x[ie]);
            }
            System.out.println(); 
          }
        }
      }
    }
  }


  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    while(t-- >0){
      Arrays.fill(x,0);
      Arrays.fill(b, 0);
      int n=sc.nextInt();
      quailui(1, n);
    }
    sc.close();
  }
}
