import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.TreeMap;
import java.util.TreeSet;

/** J07032sothuannghichtrongfile */
public class J07032sothuannghichtrongfile {
  public static boolean thuannghich(Integer k) {
    String s = k.toString();
    for (int i = 0; i < s.length() / 2; i++) {
      if (s.charAt(i) != s.charAt(s.length() - 1 - i)) return false;
    }
    if (s.length() % 2 == 1 && s.length() > 1) {
      for (int i = 0; i < s.length(); i++) {
        int u = s.charAt(i) - '0';
        if (u % 2 == 0) return false;
      }
      return true;
    }
    return false;
  }

  public static void main(String[] args)
      throws IOException, FileNotFoundException, ClassNotFoundException {
    ObjectInputStream ob1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
    ObjectInputStream ob2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
    ArrayList<Integer> o1 = (ArrayList<Integer>) ob1.readObject();
    ArrayList<Integer> o2 = (ArrayList<Integer>) ob2.readObject();
    TreeMap<Integer, Integer> h1 = new TreeMap<>();
    TreeSet<Integer> sc = new TreeSet<>();
    for (int e : o1) {
      if (h1.containsKey(e)) {
        h1.put(e, h1.get(e) + 1);
      } else {
        if (thuannghich(e)) {
          h1.put(e, 1);
        }
      }
    }
    TreeMap<Integer, Integer> h2 = new TreeMap<>();
    for (int e : o2) {
      if (h2.containsKey(e)) {
        h2.put(e, h2.get(e) + 1);
      } else {
        if (thuannghich(e)) {
          h2.put(e, 1);
        }
      }
    }
    TreeMap<Integer, Integer> ans = new TreeMap<>();
    for (int e : h1.keySet()) {
      if (h2.containsKey(e)) {
        ans.put(e, h1.get(e) + h2.get(e));
      }
    }
    for (int i = 0; i < 10; i++) {
      if (ans.isEmpty()) break;
      System.out.println(ans.firstKey() + " " + ans.get(ans.firstKey()));
      ans.remove(ans.firstKey());
    }
  }
}
