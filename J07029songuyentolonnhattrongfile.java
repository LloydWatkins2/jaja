import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.TreeMap;

/** J07029songuyentolonnhattrongfile */
public class J07029songuyentolonnhattrongfile {
  public static void main(String[] args)
      throws IOException, FileNotFoundException, ClassNotFoundException {
    int[] cnt = new int[1000001];
    for (int i = 0; i < 1000001; i++) cnt[i] = 1;
    cnt[0] = 0;
    cnt[1] = 0;
    for (int i = 2; i <= Math.sqrt(1000001); i++) {
      if (cnt[i] == 1) {
        for (int j = i * i; j < 1000001; j += i) {
          if (cnt[j] == 1) cnt[j] = 0;
        }
      }
    }

    ObjectInputStream obj = new ObjectInputStream(new FileInputStream("DATA.in"));
    ArrayList<Integer> ob = (ArrayList<Integer>) obj.readObject();
    TreeMap<Integer, Integer> hm = new TreeMap<>();
    for (int e : ob) {
      if (cnt[e] == 1) {
        if (!hm.containsKey(e)) {
          hm.put(e, 0);
        }
        hm.put(e, hm.get(e) + 1);
      }
    }
    for (int i = 0; i < 10; i++) {
      int k = hm.lastKey();
      System.out.println(k + " " + hm.get(k));
      hm.remove(k);
    }
  }
}
