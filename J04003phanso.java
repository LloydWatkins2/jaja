import java.util.Scanner;

public class J04003phanso {
  static long gcd(long a, long b) {
    return b == 0 ? a : gcd(b, a % b);
  }

  public static class ps {
    private long tu;
    private long mau;

    public ps() {}

    public ps(long a, long b) {
      this.tu = a;
      this.mau = b;
    }

    public void rutgon() {
      long ucl = gcd(this.tu, this.mau);
      this.tu = this.tu / ucl;
      this.mau = this.mau / ucl;
    }

    public void show() {
      rutgon();
      System.out.printf("%d/%d", this.tu, this.mau);
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    ps k = new ps(sc.nextLong(), sc.nextLong());
    k.show();
    sc.close();
  }
}
