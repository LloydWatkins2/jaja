import java.util.Scanner;

public class J04004tongphanso {
  static long gcd(long a, long b) {
    return b == 0 ? a : gcd(b, a % b);
  }

  public static class phanso {
    public long tu;
    public long mau;

    public phanso() {}

    public phanso(long a, long b) {
      this.tu = a;
      this.mau = b;
    }

    public void rutgon() {
      long ucl = gcd(this.tu, this.mau);
      this.tu = this.tu / ucl;
      this.mau = this.mau / ucl;
    }

    public phanso addPs(phanso b) {
      phanso ans = new phanso(((this.tu * b.mau) + (b.tu * this.mau)), (this.mau * b.mau));
      ans.rutgon();
      return ans;
    }

    public void show() {
      System.out.printf("%d/%d", this.tu, this.mau);
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    phanso a = new phanso(sc.nextLong(), sc.nextLong());
    phanso b = new phanso(sc.nextLong(), sc.nextLong());
    phanso ans = a.addPs(b);
    ans.show();
    sc.close();
  }
}
