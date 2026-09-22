import java.util.*;

public class J020356 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    sc.close();
    if (n * 9 < k || k == 0 && n > 1) {
      System.out.println("-1 -1");
    } else if (k == 0 && n == 1) System.out.println("0 0");
    else {
      int[] ar = new int[n];
      int temp = k;
      ar[0] = 1;
      temp--;
      for (int i = n - 1; i >= 0; i--) {
        int cur = Math.min(9, temp);
        ar[i] += cur;
        temp -= cur;
        if (temp == 0) break;
      }

      for (int i = 0; i < n; i++) {
        System.out.printf("%d", ar[i]);
      }
      System.out.printf(" ");

      int[] ar1 = new int[n];
      temp = k;
      for (int i = 0; i < ar1.length; i++) {
        int cur = Math.min(9, temp);
        ar1[i] += cur;
        temp -= cur;
        if (temp == 0) {
          break;
        }
      }
      for (int i = 0; i < n; i++) {
        System.out.printf("%d", ar1[i]);
      }
      System.out.println();
    }
  }
}
