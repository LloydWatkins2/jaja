import java.util.*;

public class J02006 {
 public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    
      TreeSet<Integer> ts =new TreeSet<>();
      int a=sc.nextInt();
      int b=sc.nextInt();
      for (int i = 0; i < a; i++) {
        int cur=sc.nextInt();
        ts.add(cur);
      }
      for (int i = 0; i < b; i++) {
        int cur=sc.nextInt();
        ts.add(cur);
      }
      for (int te: ts) {
        System.out.printf("%d ",te);
      }
      System.out.println();

  } 
}
