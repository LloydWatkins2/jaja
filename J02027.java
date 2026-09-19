import java.util.*;

public class J02027 {
  static int uppper_bound(int l, int r, int[] a, int x) {
    if (l > r) return l;
    int mid = (l + r) / 2;
    if (a[mid] > x) return uppper_bound(l, mid - 1, a, x);
    return uppper_bound(mid + 1, r, a, x);
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      int n = sc.nextInt();
      int k = sc.nextInt();
      int[] ar = new int[n];
      for (int i = 0; i < n; i++) {
        ar[i] = sc.nextInt();
      }
      Arrays.sort(ar);
      long cnt = 0;
      for (int i = 1; i < n; i++) {
        int ind = uppper_bound(0, i - 1, ar, ar[i] - k);
        cnt += (long) (i - ind);
      }
      System.out.println(cnt);
    }
    sc.close();
  }
}
