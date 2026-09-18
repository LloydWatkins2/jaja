import java.util.*;

public class J02023 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int s = sc.nextInt();
    if (n * 9 < s || s == 0 && n > 1) {
      System.out.println("-1 -1");
    } else if (n == 1 && s == 0)
      System.out.printf("0 0");
    else {
      int temp = s;

      int[] ar = new int[n];
      ar[0] = 1;
      temp--;
      int[] ar2 = new int[n];
      for (int i = n - 1; i >= 0; i--) {
        int st = Math.min(9, temp);
        ar[i] += st;
        temp -= st;
        if (temp == 0)
          break;
      }
      for (int k : ar) {
        System.out.printf("%d", k);
      }
      System.out.printf(" ");

      temp = s;
      for (int i = 0; i < n; i++) {
        int st = Math.min(9, temp);
        ar2[i] += st;
        temp -= st;
        if (temp == 0)
          break;
      }
      for (int k : ar2) {
        System.out.printf("%d", k);
      }
    }
    sc.close();
  }
}
