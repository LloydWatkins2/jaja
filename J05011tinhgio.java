import java.util.Scanner;
import java.util.TreeSet;

public class J05011tinhgio {
  public static class gamethu implements Comparable<gamethu> {
    String magt;
    String ten;
    int tgc;

    public gamethu(String magt, String ten, int tgc) {

      this.magt = magt;
      this.ten = ten;
      this.tgc = tgc;
    }

    @Override
    public int compareTo(gamethu b) {
      if (this.tgc < b.tgc) return 1;
      if (this.tgc > b.tgc) return -1;
      return 0;
    }

    @Override
    public String toString() {
      int hr = (int) (this.tgc / 60);
      return String.format("%s %s %d gio %d phut", this.magt, this.ten, hr, this.tgc - hr * 60);
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    sc.nextLine();
    TreeSet<gamethu> ts = new TreeSet<>();
    while (t-- > 0) {
      String ma = sc.nextLine();
      String ten = sc.nextLine();
      String[] hbatdau = sc.nextLine().trim().split(":");
      String[] hketthuc = sc.nextLine().trim().split(":");
      int batdau = Integer.parseInt(hbatdau[0]) * 60 + Integer.parseInt(hbatdau[1]);
      int kethucs = Integer.parseInt(hketthuc[0]) * 60 + Integer.parseInt(hketthuc[1]);
      if (batdau > kethucs) batdau += 24 * 60;
      int timedelta = kethucs - batdau;
      ts.add(new gamethu(ma, ten, timedelta));
    }
    for (gamethu i : ts) {
      System.out.println(i);
    }
    sc.close();
  }
}
