import java.util.Scanner;

public class J05004danhsachdoituongsinhvien2 {
  public static class sinhvien {
    String masv;
    String ten;
    String lop;
    String dob;
    double gpa;

    public sinhvien() {}

    public sinhvien(String masv, String ten, String lop, String dob, double gpa) {
      this.masv = masv;
      this.ten = ten;
      this.dob = dob;
      this.lop = lop;
      this.gpa = gpa;
    }

    public String chuanhoaten() {
      String[] st = this.ten.split("\\s+");
      String ans = "";
      for (String s : st) {
        StringBuilder bd = new StringBuilder(s.toLowerCase().trim());
        bd.setCharAt(0, Character.toUpperCase(bd.charAt(0)));
        ans = ans + (bd.toString() + " ");
      }
      return ans.substring(0, ans.length() - 1);
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
      System.out.printf(
          "%s %s %s %s %.2f\n", this.masv, chuanhoaten(), this.lop, chuanhoadob(), this.gpa);
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int cnt = 1;
    int t = sc.nextInt();
    sc.nextLine();
    while (t-- > 0) {
      String ms = Integer.toString(cnt++);
      while (ms.length() < 3) {
        ms = '0' + ms;
      }
      String masv = "B20DCCN" + ms;
      String ten = sc.nextLine().trim();

      sinhvien p =
          new sinhvien(masv, ten, sc.nextLine().trim(), sc.nextLine().trim(), sc.nextDouble());
      sc.nextLine();
      p.show();
    }
  }
}
