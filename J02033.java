import java.util.*;

public class J02033 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    int[] ar = new int[n];
    for (int i = 0; i < n; i++) {
      ar[i] = sc.nextInt();
    }
    Arrays.sort(ar);

    for (int i = 0; i < n; i++) {
      if (k > 0 && ar[i] < 0) {
        ar[i] = -ar[i];
        k--;
      }
    }
    if (k > 0) {
      if (k % 2 == 1) {
        int km = 0;
        for (int i = 1; i < n; i++) {
          if (ar[km] > ar[i]) km = i;
        }
        ar[km] = -ar[km];
      }
    }
    long sum = 0;
    for (int i = 0; i < n; i++) {
      sum += (long) ar[i];
    }

    System.out.println(sum);
    sc.close();
  }
}
