import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/** J07025danhsachkhachhangtrongfile */
public class J07025danhsachkhachhangtrongfile {
  public static class khachhang implements Comparable<khachhang> {
    String makh, ten, sex, addr;
    Date dob;

    public khachhang(String makh, String ten, String sex, String dob, String addr)
        throws ParseException {
      this.makh = makh;
      this.ten = chuanhoa(ten);
      this.sex = sex;
      this.addr = addr;
      SimpleDateFormat ck = new SimpleDateFormat("dd/MM/yyyy");
      this.dob = ck.parse(dob);
    }

    public static String chuanhoa(String ten) {
      String[] lt = ten.trim().toLowerCase().split("\\s+");
      String ans = "";
      for (String e : lt) {
        StringBuilder bd = new StringBuilder(e);
        bd.setCharAt(0, Character.toUpperCase(bd.charAt(0)));
        ans += (" " + bd.toString());
      }
      return ans;
    }

    @Override
    public int compareTo(khachhang b) {
      return this.dob.compareTo(b.dob);
    }

    @Override
    public String toString() {
      SimpleDateFormat kd = new SimpleDateFormat("dd/MM/yyyy");
      return String.format(
          "%s %s %s %s %s",
          this.makh, this.ten, this.sex, this.addr, kd.format(this.dob).toString());
    }
  }

  public static void main(String[] args) throws FileNotFoundException, ParseException {
    Scanner sc = new Scanner(new File("KHACHHANG.in"));
    int t = sc.nextInt();
    sc.nextLine();
    int cnt = 1;
    TreeSet<khachhang> lkh = new TreeSet<>();
    while (t-- > 0) {
      String mkh = Integer.toString(cnt++);
      while (mkh.length() < 3) mkh = '0' + mkh;
      lkh.add(
          new khachhang("KH" + mkh, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
    }
    for (khachhang e : lkh) System.out.println(e);
  }
}
