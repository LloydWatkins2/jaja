import java.util.ArrayList;
import java.util.Scanner;

public class J05008dientichdagiac {
  public static class Point {
    int a;
    int b;

    public Point(int a, int b) {
      this.a = a;
      this.b = b;
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      int n = sc.nextInt();
      ArrayList<Point> p1 = new ArrayList<>();
      for (int i = 0; i < n; i++) {
        p1.add(new Point(sc.nextInt(), sc.nextInt()));
      }
      int sumtrc = p1.get(n - 1).a * p1.get(0).b;
      int sumsau = p1.get(n - 1).b * p1.get(0).a;

      for (int i = 0; i < n - 1; i++) {
        sumtrc += (p1.get(i).a * p1.get(i + 1).b);
        sumsau += (p1.get(i).b * p1.get(i + 1).a);
      }

      double s = Math.abs(sumtrc - sumsau) * 0.5;
      System.out.printf("%.3f\n", s);
    }
  }
}
