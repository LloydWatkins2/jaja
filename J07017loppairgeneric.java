/** J07017loppairgeneric */
import java.io.File;
import java.io.IOException;
import java.util.*;

public class J07017loppairgeneric {
  public static boolean isprime(Integer a) {
    if (a < 2) return false;
    for (int i = 2; i <= Math.sqrt(a); i++) {
      if (a % i == 0) return false;
    }
    return true;
  }

  public static class Pair<K, V> {
    K first;
    V second;

    public Pair(K first, V second) {
      this.first = first;
      this.second = second;
    }

    public boolean isPrime() {
      return isprime((Integer) this.first) && isprime((Integer) this.second);
    }

    @Override
    public String toString() {
      return this.first + " " + this.second;
    }
  }

  public static void main(String[] args) throws IOException {
    Scanner sc = new Scanner(new File("DATA.in"));
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
