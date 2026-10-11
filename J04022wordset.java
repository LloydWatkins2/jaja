import java.util.*;

public class J04022wordset {
  public static class WordSet {
    TreeSet<String> a;

    public WordSet(String s) {
      this.a = new TreeSet<>();
      String[] st = s.split("\\s+");
      for (String ste : st) {
        this.a.add(ste.toLowerCase());
      }
    }

    public WordSet() {
      a = new TreeSet<>();
    }

    public WordSet union(WordSet b1) {
      WordSet ans = new WordSet();
      ans.a.addAll(this.a);
      ans.a.addAll(b1.a);
      return ans;
    }

    public WordSet intersection(WordSet b1) {

      WordSet c = new WordSet();
      for (String i : this.a) {
        for (String j : b1.a) {
          if (i.equals(j)) c.a.add(i);
        }
      }
      return c;
    }

    @Override
    public String toString() {
      String ans = "";
      for (String s : this.a) {
        ans += (s + ' ');
      }
      return ans;
    }
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    WordSet s1 = new WordSet(in.nextLine());
    WordSet s2 = new WordSet(in.nextLine());
    System.out.println(s1.union(s2));
    System.out.println(s1.intersection(s2));
  }
}
