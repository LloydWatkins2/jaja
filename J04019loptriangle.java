import java.util.Scanner;

public class J04019loptriangle {
  public static class Point {
    double a;
    double b;

    public Point(double a, double b) {
      this.a = a;
      this.b = b;
    }

    public static Point nextPoint(Scanner sc) {
      return new Point(sc.nextDouble(), sc.nextDouble());
    }

    public double distance(Point a2) {
      return Math.sqrt(Math.pow(a2.a - this.a, 2) + Math.pow(a2.b - this.b, 2));
    }
  }

  public static class Triangle {
    Point a;
    Point b;
    Point c;

    public Triangle(Point a, Point b, Point c) {
      this.a = a;
      this.b = b;
      this.c = c;
    }

    public boolean valid() {
      double ab = this.a.distance(this.b);
      double ac = this.a.distance(this.c);
      double bc = this.b.distance(this.c);
      double maxx = Math.max(Math.max(ab, ac), bc);
      return (2 * maxx < ab + ac + bc);
    }

    public String getPerimeter() {
      double ab = this.a.distance(this.b);
      double ac = this.a.distance(this.c);
      double bc = this.b.distance(this.c);
      return String.format("%.3f", ab + bc + ac);
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      Triangle a = new Triangle(Point.nextPoint(sc), Point.nextPoint(sc), Point.nextPoint(sc));
      if (!a.valid()) {
        System.out.println("INVALID");
      } else {
        System.out.println(a.getPerimeter());
      }
    }
  }
}
