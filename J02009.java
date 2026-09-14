import java.util.*;

public class J02009 {
 public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    TreeMap<Long,Long> tm=new TreeMap<>();
    for (long i = 0; i < n; i++) {
      long a=sc.nextLong();
      long b=sc.nextLong();
      if (tm.containsKey(a)) {
        tm.merge(a,b,Long::sum);
      }else{
      tm.put(a,b);
      }
    }
    long ans=0;
    for (long i :tm.keySet()) {
      if (ans<i) {
        ans=i;
      }
      ans+=tm.get(i);
    }
    System.out.println(ans);
    

  } 
}


