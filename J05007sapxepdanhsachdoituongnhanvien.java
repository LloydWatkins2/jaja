import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class J05007sapxepdanhsachdoituongnhanvien {
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
    ArrayList<nhanvien> ar = new ArrayList<>();
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
      ar.add(p1);
    }
    SimpleDateFormat f = new SimpleDateFormat("dd/mm/yyyy");
    Collections.sort(
        ar,
        new Comparator<nhanvien>() {
          @Override
          public int compare(nhanvien a, nhanvien b) {
            int c = 0;
            try {
              c = f.parse(a.dob).compareTo(f.parse(b.dob));
            } catch (ParseException e) {

            }
            return c;
          }
        });
    for (nhanvien sr : ar) sr.show();

    sc.close();
  }
}
