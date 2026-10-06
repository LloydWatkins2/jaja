import java.util.Scanner;

public class J04007khaibaolopnhanvien {
  public static class nhanvien {
    String manv;
    String ten;
    String sex;
    String dob;
    String addr;
    String mst;
    String signadd;

    public nhanvien(
        String manv, String ten, String sex, String dob, String addr, String mst, String signadd) {
      this.manv = manv;
      this.ten = ten;
      this.sex = sex;
      this.dob = dob;
      this.addr = addr;
      this.mst = mst;
      this.signadd = signadd;
    }

    public void show() {
      System.out.printf(
          "%s %s %s %s %s %s %s",
          this.manv, this.ten, this.sex, this.dob, this.addr, this.mst, this.signadd);
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    nhanvien p1 =
        new nhanvien(
            "00001",
            sc.nextLine(),
            sc.nextLine(),
            sc.nextLine(),
            sc.nextLine(),
            sc.nextLine(),
            sc.nextLine());
    p1.show();
    sc.close();
  }
}
