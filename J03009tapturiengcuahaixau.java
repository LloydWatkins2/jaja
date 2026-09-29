import java.util.Scanner;
import java.util.TreeSet;

public class J03009tapturiengcuahaixau {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    sc.nextLine();
    while (t-- > 0) {
      String s1 = sc.nextLine();
      String s2 = sc.nextLine();

      String[] s01 = s1.trim().split("\\s+");
      String[] s02 = s2.trim().split("\\s+");
      TreeSet<String> ts = new TreeSet<>();
      for (String string : s02) {
        ts.add(string);
      }
      TreeSet<String> ans = new TreeSet<>();
      for (int i = 0; i < s01.length; i++) {
        if (!ts.contains(s01[i])) {
          ans.add(s01[i]);
        }
      }
      for (String ste : ans) {
        System.out.printf("%s ", ste);
      }
      System.out.println();
    }
    sc.close();
  }
}
