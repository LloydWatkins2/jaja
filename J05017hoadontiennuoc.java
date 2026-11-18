import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/** J05017hoadontiennuoc */
public class J05017hoadontiennuoc {
  public static class hd {
    String ma, ten;
    long bill;

    public hd(int ma, String ten, int soNuoc) {
      this.ma = String.format("KH%02d", ma);
      this.ten = ten;
      if (soNuoc <= 50) {
        this.bill = Math.round(((soNuoc * 100) * 1.02));
      } else if (soNuoc <= 100) {
        this.bill = Math.round((5000 + (soNuoc - 50) * 150) * 1.03);
      } else {
        this.bill = Math.round((5000 + 7500 + ((soNuoc - 100) * 200)) * 1.05);
      }
    }

    @Override
    public String toString() {
      return String.format("%s %s %d", this.ma, this.ten, this.bill);
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    ArrayList<hd> ar = new ArrayList<>();
    int cnt = 1;
    while (t-- > 0) {
      sc.nextLine();
      String ten = sc.nextLine();
      int cu = sc.nextInt();
      int moi = sc.nextInt();
      ar.add(new hd(cnt++, ten, Math.abs(moi - cu)));
    }
    Collections.sort(ar, (a, b) -> Long.compare(b.bill, a.bill));
    for (hd e : ar) {
      System.out.println(e);
    }
  }
}
