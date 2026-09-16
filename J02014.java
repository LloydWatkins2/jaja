import java.util.*;

public class J02014 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      int n = sc.nextInt();
      int[] ar = new int[n];
      int[] prefxi = new int[n];
      ar[0] = sc.nextInt();
      prefxi[0] = ar[0];
      for (int i = 1; i < n; i++) {
        ar[i] = sc.nextInt();
        prefxi[i] = prefxi[i - 1] + ar[i];
      }
      int treu = 0;
      if (prefxi[n - 1] - prefxi[0] == 0) {
        System.out.println(1);
        treu = 1;
      } else {
        for (int i = 1; i < n; i++) {
          if (prefxi[i - 1] == prefxi[n - 1] - prefxi[i]) {
            System.out.println(i + 1);
            treu = 1;
            break;
          }
        }
      }
      if (treu == 0) {
        System.out.println(-1);
      }
    }
    sc.close();
  }
}
