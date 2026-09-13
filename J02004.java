import java.util.*;

public class J02004 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      int n = sc.nextInt();
      long[] ar = new long[n];
      for (int i = 0; i < n; i++) {
        ar[i] = sc.nextLong();
      }
      int flag = 1;
      for (int i = 0; i <= n / 2; i++) {
        if (ar[i] != ar[n - i - 1]) {
          flag = 0;
          break;
        }
      }
      System.out.println(flag == 1 ? "YES" : "NO");
    }
  }
}
