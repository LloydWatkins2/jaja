import java.util.HashMap;
import java.util.Scanner;

public class J04015tinhthunhapgiaovien {
  public static class giaovien {
    String magv;
    String ten;
    long luong;

    public giaovien(String magv, String ten, long luong) {
      this.magv = magv;
      this.ten = ten;
      this.luong = luong;
    }

    public void show(long phucap, long heso) {
      System.out.printf(
          "%s %s %d %d %d", this.magv, this.ten, heso, phucap, (heso * this.luong) + phucap);
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    HashMap<String, Integer> hm = new HashMap<>();
    hm.put("HT", 2000000);
    hm.put("HP", 900000);
    hm.put("GV", 500000);
    String magv = sc.nextLine();
    String ten = sc.nextLine();
    long luong = sc.nextLong();
    giaovien g1 = new giaovien(magv, ten, luong);
    long phucap = hm.get(magv.substring(0, 2));
    long heso = Long.parseLong(magv.substring(2));
    g1.show(phucap, heso);
  }
}
