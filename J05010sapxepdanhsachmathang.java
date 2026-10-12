import java.util.Scanner;
import java.util.TreeSet;

public class J05010sapxepdanhsachmathang {
  public static class mathang implements Comparable<mathang> {
    int masv;
    String ten;
    String loai;
    double giamua;
    double giaban;

    public mathang(int masv, String ten, String loai, double giamua, double giaban) {
      this.masv = masv;
      this.ten = ten;
      this.loai = loai;
      this.giamua = giamua;
      this.giaban = giaban;
    }

    @Override
    public int compareTo(mathang b) {
      double cur = this.giaban - this.giamua;
      double ne = b.giaban - this.giamua;
      if (cur < ne) return 1;
      if (cur > ne) return -1;
      return 0;
    }

    @Override
    public String toString() {
      return String.format(
          "%d %s %s %.2f", this.masv, this.ten, this.loai, this.giaban - this.giamua);
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    int cnt = 1;
    TreeSet<mathang> ts = new TreeSet<>();
    while (t-- > 0) {
      sc.nextLine();
      ts.add(new mathang(cnt++, sc.nextLine(), sc.nextLine(), sc.nextDouble(), sc.nextDouble()));
    }
    for (mathang tt : ts) {
      System.out.println(tt);
    }
    sc.close();
  }
}
