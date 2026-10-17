import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/** J07010danhsachsinhvientrongfile2 */
public class J07010danhsachsinhvientrongfile2 {
  public static class sv {
    String msv, ten, dob, cl;
    double gpa;

    public sv(String msv, String ten, String cl, String dob, double gpa) {
      this.msv = msv;
      this.ten = ten;
      chuanhoaten(dob);
      this.cl = cl;
      this.gpa = gpa;
    }

    public void chuanhoaten(String t) {
      String[] fext = t.split("/");
      String dd = fext[0];
      while (dd.length() < 2) dd = '0' + dd;
      String mm = fext[1];
      while (mm.length() < 2) mm = '0' + mm;
      this.dob = dd + "/" + mm + "/" + fext[2];
    }

    @Override
    public String toString() {
      return String.format("%s %s %s %s %.2f", this.msv, this.ten, this.cl, this.dob, this.gpa);
    }
  }

  public static void main(String[] args) throws FileNotFoundException {
    Scanner sc = new Scanner(new File("SV.in"));
    int t = sc.nextInt();
    ArrayList<sv> k = new ArrayList<>();
    int i = 1;
    while (t-- > 0) {
      sc.nextLine();
      String ke = Integer.toString(i++);
      while (ke.length() < 3) ke = '0' + ke;
      k.add(new sv("B20DCCN" + ke, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextDouble()));
    }
    for (sv e : k) {
      System.out.println(e);
    }

    sc.close();
  }
}
