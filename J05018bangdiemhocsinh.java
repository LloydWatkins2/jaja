import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;

/** J05018bangdiemhocsinh */
public class J05018bangdiemhocsinh {
  public static class hs implements Comparable<hs> {
    String mhs, ten, classifier;
    double diem;

    public hs(int mhs, String ten, double diem) {
      this.mhs = String.format("HS%02d", mhs);
      this.ten = ten;
      this.diem = diem;
      if (diem < 5) {
        this.classifier = "YEU";
      } else if (diem < 7.0) {
        this.classifier = "TB";

      } else if (diem < 8.0) {
        this.classifier = "KHA";
      } else if (diem < 9.0) {
        this.classifier = "GIOI";
      } else {
        this.classifier = "XUAT SAC";
      }
    }

    @Override
    public int compareTo(J05018bangdiemhocsinh.hs o) {
      if (this.diem == o.diem) {
        return this.mhs.compareTo(o.mhs);
      }
      return Double.compare(o.diem, this.diem);
    }

    @Override
    public String toString() {
      return String.format("%s %s %.1f %s", this.mhs, this.ten, this.diem, this.classifier);
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    int cnt = 1;
    TreeSet<hs> ar = new TreeSet<>();
    while (t-- > 0) {
      sc.nextLine();
      String ten = sc.nextLine();
      ArrayList<Double> diem = new ArrayList<>();
      for (int i = 0; i < 10; i++) diem.add(sc.nextDouble());
      double sum = 0;
      int c = 2;
      for (double e : diem) {
        if (c != 0) {
          sum += (e * 2);
          c--;
        } else sum += e;
      }
      ar.add(new hs(cnt++, ten, (sum / 12) + 1e-9));
    }
    for (hs e : ar) {
      System.out.println(e);
    }
  }
}
