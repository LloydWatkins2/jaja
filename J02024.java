import java.util.*;

public class J02024 {

  static void ine(ArrayList<Integer> x, TreeSet<String> st) {
    StringBuilder s = new StringBuilder();
    for (Integer i : x) {
      s.append(i).append(" ");
    }
    st.add(s.toString());
  }

  static void quaylui(
      int i, int n, ArrayList<Integer> ar, ArrayList<Integer> x, int sum, TreeSet<String> st) {
    // If sum is odd and subsequence is not empty, print it
    if (x.size() > 0 && sum % 2 == 1) {
      ine(x, st);
    }

    // Try adding each remaining element
    for (int j = i; j < n; j++) {
      x.add(ar.get(j));
      quaylui(j + 1, n, ar, x, sum + ar.get(j), st);
      x.remove(x.size() - 1);
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      int n = sc.nextInt();
      ArrayList<Integer> ar = new ArrayList<>();
      for (int i = 0; i < n; i++) {
        ar.add(sc.nextInt());
      }

      // Sort in descending order
      Collections.sort(ar, Comparator.reverseOrder());

      // Generate subsequences
      TreeSet<String> st = new TreeSet<>();
      quaylui(0, n, ar, new ArrayList<>(), 0, st);
      for (String Builder : st) {
        System.out.println(Builder);
      }
    }
    sc.close();
  }
}
