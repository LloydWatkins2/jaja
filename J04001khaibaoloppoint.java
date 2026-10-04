import java.util.Scanner;

public class J04001khaibaoloppoint {
  public static class point {
    double x;
    double y;

    public point() {}
    ;

    public point(double x, double y) {
      this.x = x;
      this.y = y;
    }

    public point(point xt) {
      this.x = xt.x;
      this.y = xt.y;
    }

    public double getX() {
      return this.x;
    }

    public double getY() {
      return this.y;
    }

    public double distance(point xt) {
      return Math.sqrt(Math.pow((this.x - xt.x), 2) + Math.pow((this.y - xt.y), 2));
    }

    public double distance(point x1, point x2) {
      return Math.sqrt(Math.pow((x1.x - x2.x), 2) + Math.pow((x1.y - x2.y), 2));
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      point x1 = new point(sc.nextDouble(), sc.nextDouble());
      point x2 = new point(sc.nextDouble(), sc.nextDouble());
      System.out.printf("%.4f%n", x1.distance(x2));
    }
    sc.close();
  }
}
