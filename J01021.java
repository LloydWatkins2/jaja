import java.util.*;

public class J01021 {
  static long modd = (long) 1e9 + 7;

  public static long exponential(long a, long b) {
    if (b == 0) {
      return 1;
    }

    long ans = exponential(a, b / 2);
    long ansbinh = (ans * ans) % modd;
    if (b % 2 == 0) {
      return ansbinh;
    } else {
      return (ansbinh * (a % modd)) % modd;
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    while (true) {
      long a = sc.nextLong();
      long b = sc.nextLong();
      if (a == 0 && b == 0) {
        break;
      }
      System.out.println(exponential(a, b));
    }
  }
}
