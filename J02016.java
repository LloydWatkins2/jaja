import java.util.*;

public class J02016 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      int n = sc.nextInt();
      long[] ar = new long[n];
      for (int i = 0; i < n; i++) {
        ar[i] = sc.nextLong();
      }
      Arrays.sort(ar);
      HashSet<Long> findkey = new HashSet<>();
      for (long i : ar) {
        findkey.add(i * i);
      }
      int ru = 0;
      for (int i = 0; i < n; i++) {
        for (int j = i + 1; j < n; j++) {
          long doe = (ar[i] * ar[i]) + (ar[j] * ar[j]);
          if (findkey.contains(doe)) {
            ru = 1;
            break;
          }
        }
        if (ru == 1) {
          break;
        }
      }
      System.out.println(ru == 1 ? "YES" : "NO");
    }
    sc.close();
  }
}
