import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.TreeMap;

/** J07004sokhacnhautrongfile1 */
public class J07004sokhacnhautrongfile1 {
  public static void main(String[] args) throws FileNotFoundException {
    Scanner sc = new Scanner(new File("DATA.in"));
    TreeMap<Integer, Integer> hm = new TreeMap<>();
    while (sc.hasNextInt()) {
      int e = sc.nextInt();
      if (!hm.containsKey(e)) {
        hm.put(e, 0);
      }
      hm.put(e, hm.get(e) + 1);
    }
    for (int k : hm.keySet()) {
      System.out.printf("%d %d\n", k, hm.get(k));
    }
    sc.close();
  }
}
