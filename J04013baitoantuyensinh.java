import java.util.HashMap;
import java.util.Scanner;

public class J04013baitoantuyensinh {
  public static class thisinh {
    String mats;
    String ten;
    double toan;
    double ly;
    double hoa;

    public thisinh(String mats, String ten, double toan, double ly, double hoa) {
      this.mats = mats;
      this.ten = ten;
      this.toan = toan;
      this.ly = ly;
      this.hoa = hoa;
    }

    public void show(double ut) {
      double tongdiem = this.toan * 2 + this.ly + this.hoa;
      String tt = "";
      if ((tongdiem + ut) >= 24) {
        tt = "TRUNG TUYEN";
      } else {
        tt = "TRUOT";
      }

      System.out.printf("%s %s ", this.mats, this.ten);
      if (ut == (int) ut) {
        System.out.printf("%.0f ", ut);
      } else {
        System.out.printf("%.1f ", ut);
      }
      if (tongdiem == (int) tongdiem) {
        System.out.printf("%.0f ", tongdiem);
      } else {
        System.out.printf("%.1f ", tongdiem);
      }
      System.out.printf("%s", tt);
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    HashMap<String, Double> hm = new HashMap<>();
    hm.put("KV1", 0.5);
    hm.put("KV2", 1.0);
    hm.put("KV3", 2.5);
    thisinh p1 =
        new thisinh(
            sc.nextLine(), sc.nextLine(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
    String ue = p1.mats.substring(0, 3);
    p1.show(hm.get(ue));
  }
}
