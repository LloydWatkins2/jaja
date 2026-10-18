import java.io.File;
import java.io.FileNotFoundException;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/** J07011thongketukhacnhautrongfilevanban */
public class J07011thongketukhacnhautrongfilevanban {
  public static void main(String[] args) throws FileNotFoundException {
    Scanner sc = new Scanner(new File("VANBAN.in"));
    sc.nextInt();
    TreeMap<String, Integer> ts = new TreeMap<>();
    int max = 0;
    while (sc.hasNextLine()) {
      String se = sc.nextLine().toLowerCase();
      if (se.length() == 0) continue;
      String[] s = se.trim().split("[^a-zA-Z0-9]");
      for (String e : s) {
        if (e.length() > 0) {
          if (!ts.containsKey(e)) {
            ts.put(e, 0);
          }
          max = Math.max(max, ts.get(e) + 1);
          ts.put(e, ts.get(e) + 1);
        }
      }
    }

    for (int m = max; m >= 0; m--) {
      for (Map.Entry<String, Integer> e : ts.entrySet()) {
        if (e.getValue() == m) System.out.println(e.getKey() + " " + e.getValue());
      }
    }
  }
}
