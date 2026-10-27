import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/** J07020hoadon2 */
public class J07020hoadon2 {
  public static class KH {
    String makh, ten, sex;
    Date date;
    String addr;

    public KH(String makh, String ten, String sex, String date, String addr) throws ParseException {
      this.makh = makh;
      this.ten = ten;
      this.sex = sex;
      SimpleDateFormat k = new SimpleDateFormat("dd/MM/yyyy");
      this.date = k.parse(date);
      this.addr = addr;
    }
  }

  public static class MH {
    String mamh, ten, donvi;
    long giaban, giamua;

    public MH(String mamh, String ten, String donvi, long giamua, long giaban) {
      this.mamh = mamh;
      this.ten = ten;
      this.donvi = donvi;
      this.giaban = giaban;
      this.giamua = giamua;
    }
  }

  public static class HD {
    String mahd;
    KH kh;
    MH mh;
    int soluong;

    public HD(String mahd, KH kh, MH mh, int soluong) {
      this.mahd = mahd;
      this.kh = kh;
      this.mh = mh;
      this.soluong = soluong;
    }

    @Override
    public String toString() {
      return String.format(
          "%s %s %s %s %s %d %d %d %d",
          this.mahd,
          this.kh.ten,
          this.kh.addr,
          this.mh.ten,
          this.mh.donvi,
          this.mh.giamua,
          this.mh.giaban,
          this.soluong,
          (this.mh.giaban) * this.soluong);
    }
  }

  public static void main(String[] args) throws FileNotFoundException, ParseException {
    Scanner sc1 = new Scanner(new File("KH.in"));
    Scanner sc2 = new Scanner(new File("MH.in"));
    Scanner sc3 = new Scanner(new File("HD.in"));
    int t1 = sc1.nextInt();
    int cnt1 = 1;
    sc1.nextLine();
    HashMap<String, KH> dskh = new HashMap<>();
    while (t1-- > 0) {
      String makh = "KH" + String.format("%03d", cnt1++);
      dskh.put(makh, new KH(makh, sc1.nextLine(), sc1.nextLine(), sc1.nextLine(), sc1.nextLine()));
    }
    int t2 = sc2.nextInt();
    int cnt2 = 1;
    HashMap<String, MH> dsmh = new HashMap<>();
    while (t2-- > 0) {
      sc2.nextLine();
      String mamh = "MH" + String.format("%03d", cnt2++);
      dsmh.put(mamh, new MH(mamh, sc2.nextLine(), sc2.nextLine(), sc2.nextLong(), sc2.nextLong()));
    }
    LinkedHashSet<HD> hoadon = new LinkedHashSet<>();
    int t3 = sc3.nextInt();
    int cnt3 = 1;
    while (t3-- > 0) {
      String mahd = "HD" + String.format("%03d", cnt3++);
      String makhe = sc3.next();
      String mamhe = sc3.next();
      hoadon.add(new HD(mahd, dskh.get(makhe), dsmh.get(mamhe), sc3.nextInt()));
    }
    for (HD e : hoadon) {
      System.out.println(e);
    }
  }
}
