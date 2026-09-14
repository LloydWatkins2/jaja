import java.util.*;

public class J02007 {
 public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    int t=sc.nextInt();
    int k=1;
    while (t-- >0) {
      int n=sc.nextInt();
      LinkedHashMap<Integer,Integer> hm= new LinkedHashMap<>();
      for (int i = 0; i < n; i++) {
        int cur=sc.nextInt();
        if (!hm.containsKey(cur)) {
          hm.put(cur,0);
        }
        int tem=hm.get(cur)+1;
        hm.put(cur,tem);
      }
      System.out.println("Test "+k+":");
      for (int i:hm.keySet()) {
        System.out.println(i + " xuat hien "+ hm.get(i) + " lan");
      }
      k++;

    }
  } 
}
