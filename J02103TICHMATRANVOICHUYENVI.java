import java.util.*;

public class J02103TICHMATRANVOICHUYENVI {
  static int[][] tich(int[][] ar, int n, int m) {
    int[][] treans = new int[m][n];
    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
        treans[i][j] = ar[j][i];
      }
    }
    int[][] ans = new int[n][n];
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        for (int k = 0; k < m; k++) {
          ans[i][j] += ar[i][k] * treans[k][j];
        }
      }
    }
    return ans;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    int l = 1;
    while (t-- > 0) {
      int n = sc.nextInt();
      int m = sc.nextInt();
      int[][] ar = new int[n][m];
      for (int i = 0; i < n; i++) {
        for (int j = 0; j < m; j++) {
          ar[i][j] = sc.nextInt();
        }
      }
      int[][] ans = tich(ar, n, m);
      System.out.printf("Test %d:\n", l);
      for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
          System.out.printf("%d ", ans[i][j]);
        }
        System.out.println();
      }
      l++;
    }
    sc.close();
  }
}
