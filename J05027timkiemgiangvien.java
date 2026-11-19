import java.util.ArrayList;
import java.util.Scanner;

public class J05027timkiemgiangvien {
  public static class gv {
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
    public String toString() {
      return String.format("%s %s %s", this.ma, this.name, this.mon);
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    sc.nextLine();
    int cnt = 1;
    ArrayList<gv> ts = new ArrayList<>();
    while (t-- > 0) {
      ts.add(new gv(cnt++, sc.nextLine(), sc.nextLine()));
    }
    int c = sc.nextInt();
    sc.nextLine();
    while (c-- > 0) {
      String qe = sc.nextLine();
      String search = qe.toLowerCase();
      System.out.println("DANH SACH GIANG VIEN THEO TU KHOA " + qe + ":");
      for (gv e : ts) {
        if (e.name.toLowerCase().contains(search)) System.out.println(e);
      }
    }
  }
}
