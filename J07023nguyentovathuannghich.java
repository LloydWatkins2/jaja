import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.TreeMap;

/** J07023nguyentovathuannghich */
public class J07023nguyentovathuannghich {

  public static class Pair<K, V> {
    K first;
    V second;

    public Pair(K f, V r) {
      this.first = f;
      this.second = r;
    }
  }

  static boolean thuannghich(int e) {
    String te = Integer.toString(e);
    StringBuilder ew = new StringBuilder(te);
    ew = ew.reverse();
    return te == ew.toString();
  }

  public static void main(String[] args)
      throws ClassNotFoundException, IOException, FileNotFoundException {
    int[] snt = new int[10005];
    for (int e : snt) e = 0;
    snt[0] = 0;
    snt[1] = 0;
    for (int i = 2; i <= Math.sqrt(10001); i++) {
      if (snt[i] == 1) {
        for (int j = i * i; j < 10001; j += i) {
          if (snt[j] == 1) snt[j] = 0;
        }
      }
    }

    ObjectInputStream sc1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
    ObjectInputStream sc2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
    ArrayList<Integer> a1 = (ArrayList<Integer>) sc1.readObject();
    ArrayList<Integer> a2 = (ArrayList<Integer>) sc2.readObject();
    TreeMap<Integer, Pair<Integer, Integer>> hm = new TreeMap<>();
    for (int e : a1) {
      if (!hm.containsKey(e)) {
        hm.put(e, new Pair<Integer, Integer>(0, 0));
      }
      hm.put(e, new Pair<Integer, Integer>(hm.get(e).first + 1, 0));
    }
    for (int e : a2) {
      if (!hm.containsKey(e)) {
        hm.put(e, new Pair<Integer, Integer>(0, 0));
      }
      hm.put(e, new Pair<Integer, Integer>(hm.get(e).first, hm.get(e).second + 1));
    }
    for (int key : hm.keySet()) {
      if (snt[key] == 1 && thuannghich(key)) {
        System.out.println(key + " " + hm.get(key).first + " " + hm.get(key).second);
      }
    }
  }
}
