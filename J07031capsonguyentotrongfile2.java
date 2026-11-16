import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

/** J07029songuyentolonnhattrongfile */
public class J07031capsonguyentotrongfile2 {
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

    ObjectInputStream ob1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
    ObjectInputStream ob2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
    ArrayList<Integer> o1 = (ArrayList<Integer>) ob1.readObject();
    ArrayList<Integer> o2 = (ArrayList<Integer>) ob2.readObject();
    TreeSet<Integer> hm = new TreeSet<>();
    HashSet<Integer> hs = new HashSet<>();
    for (int e : o1) {
      if (cnt[e] == 1) {
        hm.add(e);
      }
    }
    for (int e : o2) {
      if (cnt[e] == 1) {
        hs.add(e);
      }
    }
    for (int e : hm) {
      int k = 1000000 - e;
      if ((hm.contains(k) && e < k) && (!hs.contains(k) && !hs.contains(e))) {
        System.out.println(e + " " + k);
      }
    }
  }
}
