import java.util.*;

public class J01026 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      long n = sc.nextLong();
      int sq = (int) Math.sqrt(n);
      if (sq * sq == n) {
        System.out.println("YES");
      } else {
        System.out.println("NO");
      }
    }
  }
}
