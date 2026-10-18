import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

/** J07012thongkecactukhacnhautrongfilenhiphan */
public class J07012thongkecactukhacnhautrongfilenhiphan {
  public static void main(String[] args) throws IOException, ClassNotFoundException {
    ObjectInputStream sc = new ObjectInputStream(new FileInputStream("DATA.in"));
    ArrayList<String> se = (ArrayList<String>) sc.readObject();
    TreeMap<String, Integer> ts = new TreeMap<>();
    int maxx = 0;
    for (String e : se) {
      if (e.length() == 0) continue;
      String[] es = e.trim().toLowerCase().split("[^a-z0-9]");
      for (String i : es) {
        if (i.length() > 0) {
          if (!ts.containsKey(i)) {
            ts.put(i, 0);
          }
          maxx = Math.max(maxx, ts.get(i) + 1);
          ts.put(i, ts.get(i) + 1);
        }
      }
    }
    while (maxx > 0) {
      for (Map.Entry<String, Integer> vr : ts.entrySet()) {
        if (vr.getValue() == maxx) System.out.println(vr.getKey() + " " + vr.getValue());
      }
      maxx--;
    }
  }
}
