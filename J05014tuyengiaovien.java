import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Scanner;

/** J05014tuyengiaovien */
public class J05014tuyengiaovien {
  public static class gv {
    String mgv, ten, chuyen;
    double dut, dc;
    double dt;
    double diemchuan;
    String classifier;

    public gv(String mgv, String ten, String chuyen, double dut, double dt, double dc) {
      this.mgv = mgv;
      this.ten = ten;
      this.chuyen = chuyen;
      this.dc = dc;
      this.dt = dt;
      this.dut = dut;
      this.diemchuan = this.dc + this.dt * 2 + this.dut;
      if (this.diemchuan + 1e-9 >= 18) this.classifier = "TRUNG TUYEN";
      else this.classifier = "LOAI";
    }

    @Override
    public String toString() {
      return String.format(
          "%s %s %s %.1f %s",
          this.mgv, this.ten, this.chuyen, this.diemchuan + 1e-9, this.classifier);
    }
  }

  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
    HashMap<Character, Double> hm = new HashMap<>();
    hm.put('1', 2.0);
    hm.put('2', 1.5);
    hm.put('3', 1.0);
    hm.put('4', 0.0);
    HashMap<Character, String> hk = new HashMap<>();
    hk.put('A', "TOAN");
    hk.put('B', "LY");
    hk.put('C', "HOA");
    ArrayList<gv> ar = new ArrayList<>();
    int t = sc.nextInt();
    int cnt = 1;
    while (t-- > 0) {
      sc.nextLine();
      String mgv = Integer.toString(cnt++);
      while (mgv.length() < 2) mgv = '0' + mgv;
      String ten = sc.nextLine();
      String truntuye = sc.nextLine();
      StringBuilder bd = new StringBuilder(truntuye);
      double dt = sc.nextDouble();
      double dc = sc.nextDouble();
      ar.add(new gv("GV" + mgv, ten, hk.get(bd.charAt(0)), hm.get(bd.charAt(1)), dt, dc));
    }
    Collections.sort(ar, (a, b) -> Double.compare(b.diemchuan, a.diemchuan));
    for (gv e : ar) System.out.println(e);
  }
}
