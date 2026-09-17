import java.util.*;

public class J02021 {
  static int count = 0;
  static int[] x = new int[11];

  static void quaylui(int i, int n, int k) {

    for (int j = x[i - 1] + 1; j <= n - k + i; j++) {
      x[i] = j;
      if (i == k) {
        for (int ke = 1; ke <= k; ke++) {
          System.out.printf("%d", x[ke]);
        }
        count++;
        System.out.printf(" ");
      } else quaylui(i + 1, n, k);
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    quaylui(1, a, b);
    System.out.printf("\nTong cong co %d to hop", count);
    sc.close();
  }
}
