import java.util.Scanner;

public class J04010dientichhinhtronngoaitieptamgiac {
  public static class point {
    double x;
    double y;

    public point(double x, double y) {
      this.x = x;
      this.y = y;
    }

    public double distance(point p2) {
      return Math.sqrt(Math.pow(this.x - p2.x, 2) + Math.pow(this.y - p2.y, 2));
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      point p1 = new point(sc.nextDouble(), sc.nextDouble());
      point p2 = new point(sc.nextDouble(), sc.nextDouble());
      point p3 = new point(sc.nextDouble(), sc.nextDouble());
      double c1 = p1.distance(p2);
      double c2 = p1.distance(p3);
      double c3 = p2.distance(p3);
      double maxc = Math.max(c1, Math.max(c2, c3));
      if (2 * maxc < c1 + c2 + c3) {
        double are =
            Math.sqrt(((c1 + c2 + c3) * (c1 + c2 - c3) * (c1 - c2 + c3) * (-c1 + c2 + c3)));
        double R = (c1 * c2 * c3) / are;
        System.out.printf("%.3f\n", Math.pow(R, 2) * Math.PI);
      } else {
        System.out.println("INVALID");
      }
    }
    sc.close();
  }
}
