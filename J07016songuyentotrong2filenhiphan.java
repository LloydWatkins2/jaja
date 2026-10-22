import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.TreeMap;

/** J07016songuyentotrong2filenhiphan */
public class J07016songuyentotrong2filenhiphan {
  public static class Pair<K, V> {
    K first;
    V second;

    public Pair(K first, V second) {
      this.first = first;
      this.second = second;
    }

    @Override
    public String toString() {
      return this.first + " " + this.second;
    }
  }

  public static void main(String[] args) throws IOException, ClassNotFoundException {
    int[] snt = new int[100005];
    snt[0] = snt[1] = 0;

    for (int i = 2; i < 100005; i++) snt[i] = 1;
    for (int i = 2; i <= Math.sqrt(100005); i++) {
      if (snt[i] == 1) {
        for (int j = i * i; j < 100005; j += i) {
          if (snt[j] == 1) snt[j] = 0;
        }
      }
    }

    ObjectInputStream sc1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
    ObjectInputStream sc2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
    ArrayList<Integer> k1 = (ArrayList<Integer>) sc1.readObject();
    ArrayList<Integer> k2 = (ArrayList<Integer>) sc2.readObject();
    TreeMap<Integer, Pair<Integer, Integer>> ts = new TreeMap<>();
    for (int i : k1) {
      if (snt[i] == 1) {
        if (!ts.containsKey(i)) {
          ts.put(i, new Pair<Integer, Integer>(0, 0));
        }
        ts.put(i, new Pair<Integer, Integer>(ts.get(i).first + 1, ts.get(i).second));
      }
    }
    for (int i : k2) {
      if (ts.containsKey(i)) {
        ts.put(i, new Pair<Integer, Integer>(ts.get(i).first, ts.get(i).second + 1));
      }
    }

    for (int k : ts.keySet()) {
      System.out.println(k + " " + ts.get(k));
    }
  }
}
