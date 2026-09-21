import java.util.*;

public class J02034 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] ar = new int[n];
    HashMap<Integer, Integer> hm = new HashMap<>();
    int max = -1;
    for (int i = 0; i < n; i++) {
      ar[i] = sc.nextInt();
      if (max < ar[i]) {
        max = ar[i];
      }
    }
    for (int i = 1; i <= max; i++) {
      hm.put(i, 0);
    }
    for (int i = 0; i < n; i++) {
      hm.put(ar[i], 1);
    }
    boolean flag = false;
    for (int i = 1; i <= max; i++) {
      if (hm.get(i) == 0) {
        System.out.println(i);
        flag = true;
      }
    }
    if (!flag) System.out.println("Excellent!");

    sc.close();
  }
}
