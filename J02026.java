import java.util.*;

public class J02026 {

  static int[] x;
  static void trye(int i,int n,int k,int[] ar){
    for (int j= x[i-1]+1; j <= n-k+i; j++) {
        x[i]=j;
        if(i==k){
          for(int ke=1;ke<=k;ke++){
            System.out.printf("%d ",ar[x[ke]-1]);
          }
          System.out.println();
        }else{
          trye(i+1, n, k, ar);
      }
    }
  }
 public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    int t= sc.nextInt();
    while(t-- >0){
      int n=sc.nextInt();
      int k=sc.nextInt();
      int[] ar= new int[n];
      
      x= new int[k+2];
      for (int i = 0; i < n; i++) {
        ar[i]=sc.nextInt();
      }
      Arrays.sort(ar);
      trye(1, n, k, ar);
    }
    sc.close();
  } 
}

