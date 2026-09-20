import java.util.*;

public class J02028 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      int n = sc.nextInt();
      long k = sc.nextLong();
      long[] ar = new long[n];
      for (int i = 0; i < n; i++) {
        ar[i] = sc.nextLong();
      }
      boolean flag = false;
      int left = 0;
      long sum = 0;
      for (int r = 0; r < n; r++) {
        sum += ar[r];
        while (sum > k && left <= r) {
          sum -= ar[left];
          left++;
        }
        if (sum == k && left <= r) {
          flag = true;
          break;
        }
      }
      System.out.println((flag) ? "YES" : "NO");
    }
    sc.close();
  }
}
