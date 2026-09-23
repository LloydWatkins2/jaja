import java.util.*;

public class J02102 {
  public static void main(String[] ansgs) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] ar = new int[n * n];
    for (int i = 0; i < n * n; i++) {
      ar[i] = sc.nextInt();
    }
    Arrays.sort(ar);
    int[][] ans = new int[n][n];
    int j = 0;
    int k = 0;
    int i = 0;
    while (i < n * n) {
      while (k < n && ans[j][k] == 0) {
        ans[j][k] = ar[i];
        k++;
        i++;
      }
      j++;
      k--;
      while (j < n && ans[j][k] == 0) {
        ans[j][k] = ar[i];
        j++;
        i++;
      }
      j--;
      k--;
      while (k >= 0 && ans[j][k] == 0) {
        ans[j][k] = ar[i];
        k--;
        i++;
      }
      j--;
      k++;
      while (j >= 0 && ans[j][k] == 0) {
        ans[j][k] = ar[i];
        j--;
        i++;
      }
      k++;
      j++;
    }
    for (int[] is : ans) {
      for (int kl : is) {
        System.out.printf("%d ", kl);
      }
      System.out.println();
    }
    sc.close();
  }
}
