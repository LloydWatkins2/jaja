import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.TreeMap;

/** J07005sokhacnhautrongfile2 */
public class J07005sokhacnhautrongfile2 {

  public static void main(String[] args) throws IOException, FileNotFoundException {
    DataInputStream sc = new DataInputStream(new FileInputStream("DATA.IN"));
    TreeMap<Integer, Integer> ts = new TreeMap<>();
    for (int k = 0; k < 100000; k++) {
      int i = sc.readInt();
      if (!ts.containsKey(i)) {
        ts.put(i, 0);
      }
      ts.put(i, ts.get(i) + 1);
    }
    for (int k : ts.keySet()) {
      System.out.printf("%d %d\n", k, ts.get(k));
    }
  }
}
