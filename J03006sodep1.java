import java.util.Scanner;

public class J03006sodep1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    sc.nextLine();
    while (t-- > 0) {
      String s = sc.nextLine();
      StringBuilder st = new StringBuilder(s);
      boolean b = true;
      for (int i = 0; i < st.length() / 2; i++) {
        if (((st.charAt(i) - '0') % 2 != 0 || (st.charAt(st.length() - i - 1) - '0') % 2 != 0)
            || (st.charAt(i) != st.charAt(st.length() - i - 1))) {
          b = false;
          break;
        }
      }
      System.out.println(b ? "YES" : "NO");
    }
  }
}
