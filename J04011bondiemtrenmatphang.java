import java.util.Scanner;

public class J04011bondiemtrenmatphang {
  public static class Point3D {
    int a;
    int b;
    int c;

    public Point3D() {}
    ;

    public Point3D(int a, int b, int c) {
      this.a = a;
      this.b = b;
      this.c = c;
    }

    public Point3D makeVector(Point3D x) {
      return new Point3D(x.a - this.a, x.b - this.b, x.c - this.c);
    }

    public static Point3D tichcohuong(Point3D v1, Point3D v2) {
      return new Point3D(
          (v1.b * v2.c - v1.c * v2.b), (v1.c * v2.a - v1.a * v2.c), (v1.a * v2.b - v1.b * v2.a));
    }

    public static long tichvohuong(Point3D v1, Point3D v2) {
      return v1.a * v2.a + v1.b * v2.b + v1.c * v2.c;
    }

    public static boolean check(Point3D A, Point3D B, Point3D C, Point3D D) {
      Point3D AB = A.makeVector(B);
      Point3D AC = A.makeVector(C);
      Point3D AD = A.makeVector(D);
      Point3D tch = tichcohuong(AB, AC);
      return tichvohuong(tch, AD) == 0;
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      Point3D p1 = new Point3D(sc.nextInt(), sc.nextInt(), sc.nextInt());
      Point3D p2 = new Point3D(sc.nextInt(), sc.nextInt(), sc.nextInt());
      Point3D p3 = new Point3D(sc.nextInt(), sc.nextInt(), sc.nextInt());
      Point3D p4 = new Point3D(sc.nextInt(), sc.nextInt(), sc.nextInt());

      if (Point3D.check(p1, p2, p3, p4)) {
        System.out.println("YES");
      } else {
        System.out.println("NO");
      }
    }
  }
}
