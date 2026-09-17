import java.util.*;

public class J02020 {
  static int cunt = 0;
  static int[] x = new int[11];

  static void quaylui(int i, int n, int k) {
    for (int j = x[i - 1] + 1; j <= n + k - i; j++) {
      x[i] = j;
      if (i == k) {
        for (int kl = 1; kl <= k; kl++) {
          System.out.printf("%d ", x[kl]);
        }
        cunt++;
        System.out.println();
      }
      quaylui(i + 1, n, k);
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    quaylui(1, n, k);
    System.out.printf("Tong cong co %d to hop", cunt);
    sc.close();
  }
}
