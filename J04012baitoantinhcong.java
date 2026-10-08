import java.util.HashMap;
import java.util.Scanner;

public class J04012baitoantinhcong {
  public static class nhanvien {
    String manv;
    String ten;
    int luong;
    int sncong;
    String chucvu;

    public nhanvien(String manv, String ten, int luong, int sncong, String chucvu) {
      this.manv = manv;
      this.ten = ten;
      this.luong = luong;
      this.sncong = sncong;
      this.chucvu = chucvu;
    }

    public void show(int phucap) {
      long luongthang = this.luong * sncong;
      int thuong = 0;
      if (this.sncong < 22) {
        thuong = 0;
      } else if (this.sncong >= 22 && this.sncong < 25) {
        thuong = (int) (luongthang * 0.1);
      } else {
        thuong = (int) (luongthang * 0.2);
      }
      long tongluong = luongthang + thuong + phucap;
      System.out.printf(
          "%s %s %d %d %d %d", this.manv, this.ten, luongthang, thuong, phucap, tongluong);
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    HashMap<String, Integer> hm = new HashMap<>();
    hm.put("GD", 250000);
    hm.put("PGD", 200000);
    hm.put("TP", 180000);
    hm.put("NV", 150000);
    String ten = sc.nextLine();
    int nl = sc.nextInt();
    int sn = sc.nextInt();
    sc.nextLine();
    String cv = sc.nextLine();
    nhanvien p1 = new nhanvien("NV01", ten, nl, sn, cv);
    int phucap = hm.get(cv);
    p1.show(phucap);
  }
}
