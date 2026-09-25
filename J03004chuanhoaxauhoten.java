import java.util.*;

public class J03004chuanhoaxauhoten {
  static String capitalize(String s) {
    StringBuilder sb = new StringBuilder(s);
    sb.setCharAt(0, Character.toUpperCase(sb.charAt(0)));
    return sb.toString();
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    sc.nextLine();
    while (t-- > 0) {
      String s = sc.nextLine();
      s = s.toLowerCase();
      s = s.replaceAll("\\s+", " ");
      s = s.trim();
      String[] st = s.split("\\s");
      for (String i : st) System.out.print(capitalize(i) + " ");
      System.out.println();
    }
    sc.close();
  }
}
