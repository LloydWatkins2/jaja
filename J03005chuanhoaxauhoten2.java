import java.util.Scanner;

public class J03005chuanhoaxauhoten2 {
  static String capitalize(String s) {
    s = s.toLowerCase();
    StringBuilder st = new StringBuilder(s);
    st.setCharAt(0, Character.toUpperCase(st.charAt(0)));

    return st.toString();
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    sc.nextLine();
    while (t-- > 0) {
      String s = sc.nextLine();
      s = s.toLowerCase();
      s = s.trim();
      String[] st = s.split("\\s+");
      String ho = st[0].toUpperCase();
      for (int i = 1; i < st.length; i++) {
        System.out.printf("%s", capitalize(st[i]));
        if (i < st.length - 1) System.out.print(" ");
      }
      System.out.printf(", %s\n", ho);
    }
  }
}
