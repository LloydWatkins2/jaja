import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeSet;

/** J07027quanlibaitapnhom */
public class J07027quanlibaitapnhom {
  public static class sv {
    String masv, ten, sodt;

    public sv(String masv, String ten, String sodt) {
      this.masv = masv;
      this.ten = ten;
      this.sodt = sodt;
    }
  }

  public static class bt {
    String mabt, ten;

    public bt(String mabt, String ten) {
      this.mabt = mabt;
      this.ten = ten;
    }
  }

  public static class nhom implements Comparable<nhom> {
    sv masv;
    bt mabt;

    public nhom(sv masv, bt mabt) {
      this.masv = masv;
      this.mabt = mabt;
    }

    @Override
    public int compareTo(nhom b) {
      return this.masv.masv.compareTo(b.masv.masv);
    }

    @Override
    public String toString() {
      return String.format("%s %s %s %s %s", masv.masv, masv.ten, masv.sodt, mabt.mabt, mabt.ten);
    }
  }

  public static void main(String[] args) throws FileNotFoundException {
    Scanner sc1 = new Scanner(new File("SINHVIEN.in"));
    Scanner sc2 = new Scanner(new File("BAITAP.in"));
    Scanner sc3 = new Scanner(new File("NHOM.in"));

    int t = sc1.nextInt();
    sc1.nextLine();
    HashMap<String, sv> hm = new HashMap<>();
    while (t-- > 0) {
      String msv = sc1.nextLine();
      hm.put(msv, new sv(msv, sc1.nextLine(), sc1.nextLine()));
    }
    int c = sc2.nextInt();
    int cnt = 1;
    sc2.nextLine();
    HashMap<String, bt> hm2 = new HashMap<>();
    while (c-- > 0) {
      String ma = Integer.toString(cnt++);
      hm2.put(ma, new bt(ma, sc2.nextLine()));
    }
    TreeSet<nhom> tm = new TreeSet<>();
    while (sc3.hasNext()) {
      tm.add(new nhom(hm.get(sc3.next()), hm2.get(sc3.next())));
    }
    for (nhom e : tm) System.out.println(e);
  }
}
