import java.util.*;

public class J02035 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      long max = sc.nextLong();
      long ans = 1;
      boolean flag = false;
      long pre = sc.nextLong();
      for (int i = 1; i < max; i++) {
        long cur = sc.nextLong();
        if (pre <= cur) {
          ans++;
        } else {

          flag = true;
        }
      }
      if (flag) System.out.println(ans);
      else System.out.println(0);
    }
    sc.close();
  }
}
