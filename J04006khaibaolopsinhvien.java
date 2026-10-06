import java.util.Scanner;

public class J04006khaibaolopsinhvien {
  public static class sinhvien {
    String ten;
    String lop;
    String dob;
    double gpa;

    public sinhvien() {}

    public sinhvien(String ten, String lop, String dob, double gpa) {
      this.ten = ten;
      this.dob = dob;
      this.lop = lop;
      this.gpa = gpa;
    }

    public String chuanhoadob() {
      String[] st = this.dob.split("/");
      String ans = "";
      for (String s : st) {
        if (s.length() < 2) s = "0" + s;
        ans = ans + (s + "/");
      }
      return ans.substring(0, ans.length() - 1);
    }

    public void show() {
      System.out.printf("B20DCCN001 %s %s %s %.2f", this.ten, this.lop, chuanhoadob(), this.gpa);
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String ten = sc.nextLine();
    sinhvien p = new sinhvien(ten, sc.next(), sc.next(), sc.nextDouble());
    p.show();
    sc.close();
  }
}
