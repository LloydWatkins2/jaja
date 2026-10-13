import java.util.Scanner;
import java.util.TreeSet;

public class J05012tinhtien {
  public static class mh implements Comparable<mh> {
    String masv;
    String ten;
    int soluong;
    long dongia;
    long chietkhau;

    public mh(String masv, String ten, int soluong, long dongia, long chietkhau) {
      this.masv = masv;
      this.ten = ten;
      this.soluong = soluong;
      this.dongia = dongia;
      this.chietkhau = chietkhau;
    }

    public int compareTo(mh other) {
      long tt1 = (this.dongia * this.soluong) - this.chietkhau;

      long tt2 = (other.dongia * other.soluong) - other.chietkhau;
      if (tt1 < tt2) return 1;
      if (tt1 > tt2) return -1;
      return 0;
    }

    @Override
    public String toString() {
      return String.format(
          "%s %s %d %d %d %d",
          this.masv,
          this.ten,
          this.soluong,
          this.dongia,
          this.chietkhau,
          (this.dongia * this.soluong) - this.chietkhau);
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    TreeSet<mh> ar = new TreeSet<>();
    int t = sc.nextInt();
    while (t-- > 0) {
      sc.nextLine();
      ar.add(new mh(sc.nextLine(), sc.nextLine(), sc.nextInt(), sc.nextLong(), sc.nextLong()));
    }
    for (mh e : ar) System.out.println(e);
  }
}
