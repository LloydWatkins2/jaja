import java.util.Scanner;

public class J04009dientichtamgiac {
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
      double canh1 = p1.distance(p2);
      double canh2 = p1.distance(p3);
      double canh3 = p2.distance(p3);
      double maxc = Math.max(canh1, Math.max(canh2, canh3));
      if (2 * maxc < canh1 + canh2 + canh3) {
        System.out.printf(
            "%.2f\n",
            Math.sqrt(
                    (canh1 + canh2 + canh3)
                        * (canh1 + canh2 - canh3)
                        * (canh1 - canh2 + canh3)
                        * (-canh1 + canh2 + canh3))
                / 4);
      } else {
        System.out.println("INVALID");
      }
    }
    sc.close();
  }
}
