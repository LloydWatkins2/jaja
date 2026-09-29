import java.util.Scanner;

public class J03007sodep2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    sc.nextLine();
    while (t-- > 0) {
      String s = sc.nextLine();
      StringBuilder st = new StringBuilder(s);
      long sum = 0;
      int n = st.length();
      boolean fl = true;
      if (st.charAt(0) != '8' || st.charAt(n - 1) != '8') {
        fl = false;
      } else {
        for (int i = 0; i < n; i++) {
          sum += (st.charAt(i) - '0');
        }
        if (sum % 10 != 0) fl = false;
      }
      System.out.println(fl ? "YES" : "NO");
    }
  }
}
