import java.util.*;

public class J02106matrannhiphan {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[][] ar = new int[n][3];
    int[] cnt = new int[n];
    int ans = 0;
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < 3; j++) {
        ar[i][j] = sc.nextInt();
        if (ar[i][j] == 1) cnt[i]++;
      }
      if (cnt[i] > 1) ans++;
    }
    System.out.println(ans);

    sc.close();
  }
}
