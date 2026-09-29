import java.util.HashSet;
import java.util.Scanner;

public class J03008sodep3 {
  public static void main(String[] args) {
    HashSet<Integer> hs = new HashSet<>();
    hs.add(2);
    hs.add(3);
    hs.add(5);
    hs.add(7);
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    sc.nextLine();
    while (t-- > 0) {
      String s = sc.nextLine();
      StringBuilder st = new StringBuilder(s);
      int n = st.length();
      boolean fl = true;
      for (int i = 0; i < n / 2; i++) {
        if ((st.charAt(i) != st.charAt(n - i - 1))
            || (!hs.contains((st.charAt(0) - '0'))
                || (!hs.contains((st.charAt(n - i - 1) - '0'))))) {
          fl = false;
          break;
        }
      }
      System.out.println(fl ? "YES" : "NO");
    }
  }
}
