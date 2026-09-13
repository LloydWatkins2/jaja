import java.util.*;

public class J02005 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    HashSet<Integer> ar = new HashSet<>();
    for (int i = 0; i < a; i++) {
      int cur = sc.nextInt();
      ar.add(cur);
    }
    TreeSet<Integer> ans = new TreeSet<>();
    for (int i = 0; i < b; i++) {
      int cur = sc.nextInt();
      if (ar.contains(cur)) {
        ans.add(cur);
      }
    }
    for (int ae : ans) {
      System.out.printf("%d ", ae);
    }
    System.out.println();
  }
}
