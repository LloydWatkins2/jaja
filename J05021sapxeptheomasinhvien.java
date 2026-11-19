/** J05021sapxeptheomasinhvien */
import java.util.*;

public class J05021sapxeptheomasinhvien {

  public static class sv implements Comparable<sv> {
    String masv, name, lop, email;

    public sv(String masv, String name, String lop, String email) {
      this.masv = masv;
      this.name = name;
      this.lop = lop;
      this.email = email;
    }

    @Override
    public int compareTo(sv o) {
      return this.masv.compareTo(o.masv);
    }

    @Override
    public String toString() {
      return String.format("%s %s %s %s", this.masv, this.name, this.lop, this.email);
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    TreeSet<sv> ts = new TreeSet<>();
    while (sc.hasNextLine()) {
      ts.add(new sv(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
    }
    for (sv e : ts) {
      System.out.println(e);
    }
  }
}
