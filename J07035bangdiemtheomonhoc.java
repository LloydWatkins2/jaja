import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeSet;

/** J07035bangdiemtheomonhoc */
public class J07035bangdiemtheomonhoc {
  public static class sv {
    String msv, ten, lop, mail;

    public sv(String msv, String ten, String lop, String mail) {
      this.msv = msv;
      this.ten = ten;
      this.lop = lop;
      this.mail = mail;
    }
  }

  public static class mh {
    String mmh, ten;
    int tc;

    public mh(String mmh, String ten, int tc) {
      this.mmh = mmh;
      this.ten = ten;
      this.tc = tc;
    }
  }

  public static class bd implements Comparable<bd> {
    sv sv;
    mh mh;
    String d;
    double diem;

    public bd(sv sv, mh mh, String diem) {
      this.sv = sv;
      this.mh = mh;
      this.d = diem;
      this.diem = Double.parseDouble(diem);
    }

    @Override
    public int compareTo(bd b) {
      if (this.diem == b.diem) {
        return this.sv.msv.compareTo(b.sv.msv);
      }
      if (this.diem < b.diem) return 1;
      return -1;
    }

    @Override
    public String toString() {
      return this.sv.msv + " " + this.sv.ten + " " + this.sv.lop + " " + this.d;
    }
  }

  static String chuanHoa(String s) {
    StringBuilder sb = new StringBuilder();
    for (String w : s.trim().split("\\s+")) {
      if (sb.length() > 0) sb.append(' ');
      sb.append(Character.toUpperCase(w.charAt(0)));
      sb.append(w.substring(1).toLowerCase());
    }
    return sb.toString();
  }

  public static void main(String[] args) throws FileNotFoundException {
    Scanner sc = new Scanner(new File("SINHVIEN.in"));
    Scanner sc1 = new Scanner(new File("MONHOC.in"));
    Scanner sc2 = new Scanner(new File("BANGDIEM.in"));
    int t = sc.nextInt();
    HashMap<String, sv> svl = new HashMap<>();
    sc.nextLine();
    while (t-- > 0) {
      String msv = sc.nextLine();
      svl.put(msv, new sv(msv, chuanHoa(sc.nextLine()), sc.nextLine(), sc.nextLine()));
    }
    int l = sc1.nextInt();
    HashMap<String, mh> mhl = new HashMap<>();
    while (l-- > 0) {
      sc1.nextLine();
      String mmh = sc1.nextLine();
      mhl.put(mmh, new mh(mmh, sc1.nextLine(), sc1.nextInt()));
    }
    TreeSet<bd> tm = new TreeSet<>();
    int k = sc2.nextInt();
    sc2.nextLine();
    while (k-- > 0) {
      tm.add(new bd(svl.get(sc2.next()), mhl.get(sc2.next()), sc2.next()));
    }
    int q = sc2.nextInt();
    sc2.nextLine();
    while (q-- > 0) {
      mh monhoc = mhl.get(sc2.nextLine());
      System.out.println("BANG DIEM MON " + monhoc.ten + ":");
      for (bd e : tm) {
        if (e.mh.ten.equals(monhoc.ten)) System.out.println(e);
      }
    }
  }
}
