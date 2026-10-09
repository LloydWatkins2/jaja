import java.util.Scanner;

public class J04014tinhtoanphanso {
  static long gcd(long a, long b) {
    return b == 0 ? a : gcd(b, a % b);
  }

  public static class phanso {
    long a;
    long b;

    public phanso(long a, long b) {
      this.a = a;
      this.b = b;
    }

    public void rutgon() {
      long ucl = gcd(this.a, this.b);
      this.a = this.a / ucl;
      this.b = this.b / ucl;
    }

    public phanso add(phanso p) {
      return new phanso(this.a * p.b + this.b * p.a, this.b * p.b);
    }

    public phanso mul(phanso p) {
      return new phanso(this.a * p.a, this.b * p.b);
    }

    public String show() {
      return String.format("%d/%d", this.a, this.b);
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long t = sc.nextLong();
    while (t-- > 0) {
      phanso p1 = new phanso(sc.nextLong(), sc.nextLong());
      phanso p2 = new phanso(sc.nextLong(), sc.nextLong());
      phanso c = (p1.add(p2)).mul(p1.add(p2));
      c.rutgon();
      phanso d = (p1.mul(p2)).mul(c);
      d.rutgon();
      System.out.println(c.show() + " " + d.show());
    }
    sc.close();
  }
}
