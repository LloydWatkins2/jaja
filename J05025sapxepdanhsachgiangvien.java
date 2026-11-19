import java.util.Scanner;
import java.util.TreeSet;

public class J05025sapxepdanhsachgiangvien {
  public static class gv implements Comparable<gv> {
    String ma, name, mon;
    String ten;

    public gv(int ma, String name, String mon) {
      this.ma = String.format("GV%02d", ma);
      this.name = name;
      String[] tname = this.name.split("\\s+");
      this.ten = tname[tname.length - 1];
      String[] tach = mon.toUpperCase().split("\\s+");
      this.mon = "";
      for (String e : tach) {
        this.mon += e.charAt(0);
      }
    }

    @Override
    public int compareTo(J05025sapxepdanhsachgiangvien.gv o) {
      if (this.ten.equals(o.ten)) {
        return this.ma.compareTo(o.ma);
      }
      return this.ten.compareTo(o.ten);
    }

    @Override
    public String toString() {
      return String.format("%s %s %s", this.ma, this.name, this.mon);
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    sc.nextLine();
    int cnt = 1;
    TreeSet<gv> ts = new TreeSet<>();
    while (t-- > 0) {
      ts.add(new gv(cnt++, sc.nextLine(), sc.nextLine()));
    }
    for (gv e : ts) {
      System.out.println(e);
    }
  }
}
