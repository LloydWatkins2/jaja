import java.util.Scanner;
import java.util.TreeSet;

public class J05013tuyendung {
  public static class nhanvien implements Comparable<nhanvien> {
    String manv;
    String ten;
    double d1;
    double d2;
    double diem;
    String status;

    public nhanvien(String manv, String ten, double d1, double d2) {
      this.manv = manv;
      this.ten = ten;
      this.d1 = d1 > 10 ? (d1 / 10) : d1;
      this.d2 = d2 > 10 ? (d2 / 10) : d2;
      this.diem = (this.d1 + this.d2) / 2;
      if (this.diem < 5) this.status = "TRUOT";
      else if (this.diem >= 5 && this.diem < 8) this.status = "CAN NHAC";
      else if (this.diem >= 8 && this.diem < 9.5) this.status = "DAT";
      else this.status = "XUAT SAC";
    }

    public int compareTo(nhanvien other) {
      if (this.diem < other.diem) return 1;
      if (this.diem > other.diem) return -1;
      return 0;
    }

    @Override
    public String toString() {
      return String.format("%s %s %.2f %s", this.manv, this.ten, this.diem, this.status);
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    int cnt = 1;
    TreeSet<nhanvien> ts = new TreeSet<>();
    while (t-- > 0) {
      sc.nextLine();
      String ma = Integer.toString(cnt++);
      while (ma.length() < 2) ma = '0' + ma;
      ts.add(new nhanvien("TS" + ma, sc.nextLine(), sc.nextDouble(), sc.nextDouble()));
    }
    for (nhanvien e : ts) {
      System.out.println(e);
    }
  }
}
