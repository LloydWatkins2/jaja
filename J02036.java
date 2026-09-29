import java.util.*;

// giả sử gcd(b[i-1],b[i])=a[i-1];
// gcd(b[i],b[i+1])=a[i];
// ta có,b[i] là bội của a[i-1];
// b[i] cũng là bội của a[i];
// do đó b[i] là bội chung của (a[i],a[i-1]);
// => b[i]>=lcm(a[i],a[i-1]);
// để dãy b bé nhất=> b[i]=lcm(a[i],a[i-1]);
public class J02036 {
  static int gcd(int a, int b) {
    return (b == 0) ? a : gcd(b, a % b);
  }

  static int lcm(int a, int b) {
    return a * b / gcd(a, b);
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      int max = sc.nextInt();
      int[] ar = new int[max];
      int[] b = new int[max + 1];
      for (int i = 0; i < max; i++) {
        ar[i] = sc.nextInt();
      }
      b[0] = ar[0];
      for (int i = 1; i < max; i++) {
        b[i] = lcm(ar[i], ar[i - 1]);
      }
      b[max] = ar[max - 1];
      for (int i : b) {
        System.out.printf("%d ", i);
      }
      System.out.println();
    }
    sc.close();
  }
}
