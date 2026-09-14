import java.util.*;

public class J02010 {
 public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int max=sc.nextInt();
    int[] ar= new int[max];
    for (int i = 0; i < max; i++) {
      ar[i]=sc.nextInt();
    }
    for (int i=0;i < max-1; i++) {
      for (int j = i+1; j < max; j++) {
        if (ar[i]>ar[j]) {
          int temp=ar[i];
          ar[i]=ar[j];
          ar[j]=temp;
        }
      }
      System.out.printf("Buoc %d: ",i+1);
      for (int var : ar) {
        System.out.printf("%d ",var);
      }
      System.out.println();
    }
  } 
}
