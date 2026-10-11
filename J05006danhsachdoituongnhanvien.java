import java.util.Scanner;

public class J05006danhsachdoituongnhanvien {
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
          "%s %s %s %s %s %s %s\n",
          this.manv, this.ten, this.sex, this.dob, this.addr, this.mst, this.signadd);
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    int cnt = 1;
    sc.nextLine();
    while (t-- > 0) {

      String ms = Integer.toString(cnt++);
      while (ms.length() < 5) {
        ms = '0' + ms;
      }

      nhanvien p1 =
          new nhanvien(
              ms,
              sc.nextLine(),
              sc.nextLine(),
              sc.nextLine(),
              sc.nextLine(),
              sc.nextLine(),
              sc.nextLine());
      p1.show();
    }
    sc.close();
  }
}
