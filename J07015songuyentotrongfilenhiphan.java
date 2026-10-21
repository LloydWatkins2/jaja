import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.TreeMap;

/** J07015songuyentotrongfilenhiphan */
public class J07015songuyentotrongfilenhiphan {
  static boolean snt(int n) {
    if (n < 2) return false;
    for (int i = 2; i <= Math.sqrt(n); i++) {
      if (n % i == 0) return false;
    }
    return true;
  }

  public static void main(String[] args)
      throws IOException, ClassNotFoundException, FileNotFoundException {
    ObjectInputStream sc = new ObjectInputStream(new FileInputStream("SONGUYEN.in"));
    ArrayList<Integer> ts = (ArrayList<Integer>) sc.readObject();
    TreeMap<Integer, Integer> hm = new TreeMap<>();
    for (int e : ts) {
      if (snt(e)) {
        if (!hm.containsKey(e)) {
          hm.put(e, 0);
        }
        hm.put(e, hm.get(e) + 1);
      }
    }
    for (int i : hm.keySet()) System.out.println(i + " " + hm.get(i));
  }
}
