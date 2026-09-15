import java.util.*;

public class J01006 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t > 0) {
      int n = sc.nextInt();
      long[] ar = new long[93];
      ar[0] = 0;
      ar[1] = 1;
      ar[2] = 1;
      for (int i = 3; i <= 92; i++) {
        ar[i] = ar[i - 1] + ar[i - 2];
      }
      System.out.println(ar[n]);

      t--;
    }
  }
}
