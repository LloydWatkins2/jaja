import java.util.Scanner;
import java.util.TreeSet;

public class J05009timthukhoacuakythi {
  public static class sinhvien implements Comparable<sinhvien> {
    int masv;
    String ten;
    String date;
    double p1;
    double p2;
    double p3;

    public sinhvien(int masv, String ten, String date, double p1, double p2, double p3) {
      this.masv = masv;
      this.ten = ten;
      this.date = date;
      this.p1 = p1;
      this.p2 = p2;
      this.p3 = p3;
    }

    @Override
    public int compareTo(sinhvien b) {
      double cur = this.p1 + this.p2 + this.p3;
      double other = b.p1 + b.p2 + b.p3;
      if (cur < other) {
        return 1;
      }
      if (cur > other) {
        return -1;
      }
      if (cur == other) {
        if (this.masv < b.masv) return -1;
        if (this.masv > b.masv) return 1;
        return 0;
      }
      return 0;
    }

    @Override
    public String toString() {
      return String.format(
          "%d %s %s %.1f", this.masv, this.ten, this.date, (this.p1 + this.p2 + this.p3));
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    int cnt = 1;

    TreeSet<sinhvien> ar = new TreeSet<>();
    while (t-- > 0) {
      sc.nextLine();
      sinhvien sv1 =
          new sinhvien(
              cnt++,
              sc.nextLine(),
              sc.nextLine(),
              sc.nextDouble(),
              sc.nextDouble(),
              sc.nextDouble());
      ar.add(sv1);
    }
    sc.close();
    sinhvien first = ar.first();
    double curmax = first.p1 + first.p2 + first.p3;
    for (sinhvien s : ar) {
      if (curmax == s.p1 + s.p2 + s.p3) {
        System.out.println(s);
      } else {
        break;
      }
    }
  }
}
