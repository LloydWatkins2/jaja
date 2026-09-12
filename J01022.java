import java.util.*;

public class J01022 {
  static long[] len = new long[93];

  static void init() {
    len[0] = 0;
    len[1] = 1;
    len[2] = 1;
    for (int i = 3; i <= 92; i++) {
      len[i] = len[i - 1] + len[i - 2];
    }
  }

  public static int sovle(int n, long k) {
    if (n == 1) {
      return 0;
    }
    if (n == 2) {
      return 1;
    }

    if (k <= len[n - 2]) {
      return sovle(n - 2, k);
    } else {
      return sovle(n - 1, k - len[n - 2]);
    }
  }

  public static void main(String[] args) {
    init();
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      int n = sc.nextInt();
      long k = sc.nextLong();
      System.out.println(sovle(n, k));
    }
  }
}
