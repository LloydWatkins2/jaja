import java.util.Scanner;

public class J04020loppair {
  static boolean snt(Integer x) {
    if (x < 2) return false;
    if (x == 2) return true;
    if (x % 2 == 0) return false;
    for (int i = 3; i <= (int) Math.sqrt(x); i += 2) {
      if (x % i == 0) return false;
    }
    return true;
  }

  public static class Pair<T, K> {
    Integer first;
    Integer second;

    public Pair(Integer i, Integer j) {
      this.first = i;
      this.second = j;
    }

    public boolean isPrime() {
      return snt(this.first) && snt(this.second);
    }

    @Override
    public String toString() {
      return String.format("%d %d", this.first, this.second);
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      int n = sc.nextInt();
      boolean check = false;
      for (int i = 2; i <= 2 * Math.sqrt(n); i++) {
        Pair<Integer, Integer> p = new Pair<>(i, n - i);
        if (p.isPrime()) {
          System.out.println(p);
          check = true;
          break;
        }
      }
      if (!check) System.out.println(-1);
    }
  }
}
