import java.util.HashMap;
import java.util.Scanner;

public class J03010diachiemail {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    sc.nextLine();

    HashMap<String, Integer> hm = new HashMap<>();
    while (t-- > 0) {
      String s = sc.nextLine();
      s = s.toLowerCase();
      s = s.trim();
      String[] st = s.split("\\s+");
      String ho = "";
      int n = st.length;
      String ten = st[n - 1];
      String ans = ten;
      for (int i = 0; i < n - 1; i++) {
        StringBuilder sv = new StringBuilder(st[i]);
        ho += sv.charAt(0);
      }
      ans += ho;
      if (!hm.containsKey(ans)) {
        hm.put(ans, 0);
      }
      hm.put(ans, hm.get(ans) + 1);
      if (hm.get(ans) != 1) {
        ans += (Integer.toString(hm.get(ans)));
      }

      System.out.printf("%s@ptit.edu.vn\n", ans);
    }
    sc.close();
  }
}
