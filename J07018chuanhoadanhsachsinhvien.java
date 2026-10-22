import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedHashSet;
import java.util.Scanner;

/** J07018chuanhoadanhsachsinhvien */
public class J07018chuanhoadanhsachsinhvien {
  public static class sinhvien {
    String masv, ten, lop;
    Date dob;
    double gpa;

    public sinhvien(String masv, String ten, String lop, String dob, double gpa)
        throws ParseException {
      this.masv = masv;
      chuanhoaten(ten);
      this.lop = lop;
      SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
      this.dob = df.parse(dob);
      this.gpa = gpa;
    }

    public void chuanhoaten(String ten) {
      String[] temp = ten.toLowerCase().trim().split("\\s+");
      this.ten = "";
      for (String e : temp) {
        if (e.length() > 0) {
          StringBuilder ke = new StringBuilder(e);
          ke.setCharAt(0, Character.toUpperCase(ke.charAt(0)));
          this.ten = this.ten + " " + ke.toString();
        }
      }
    }

    @Override
    public String toString() {

      SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");
      return String.format("%s %s %s ", this.masv, this.ten, this.lop)
          + f.format(this.dob)
          + " "
          + String.format("%.2f", this.gpa);
    }
  }

  public static void main(String[] args) throws FileNotFoundException, ParseException {
    Scanner sc = new Scanner(new File("SINHVIEN.in"));
    int t = sc.nextInt();
    int cnt = 1;
    LinkedHashSet<sinhvien> ts = new LinkedHashSet<>();
    while (t-- > 0) {
      sc.nextLine();
      String masv = Integer.toString(cnt++);
      while (masv.length() < 3) masv = "0" + masv;
      ts.add(
          new sinhvien(
              "B20DCCN" + masv, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextDouble()));
    }
    for (sinhvien e : ts) System.out.println(e);
  }
}
