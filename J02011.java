import java.util.*;

public class J02011 {
 public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    int max=sc.nextInt();
    int[] ar=new int[max];
    for (int i = 0; i < max; i++) {
      ar[i]=sc.nextInt();  
    }
    for(int i=0;i<max-1;i++){
      int key=i;
      int vare=ar[i];
      for(int j=i+1;j<max;j++){
        if (vare>ar[j]) {
          vare=ar[j];
          key=j;
        }
      }
      if (vare!=ar[i]) {
        int tmp=ar[i];
        ar[i]=vare;
        ar[key]=tmp;
      }
      System.out.printf("Buoc %d: ",i+1);
      for (int var : ar) {
        System.out.printf("%d ",var);
      }
      System.out.println();
    }
  } 
}
