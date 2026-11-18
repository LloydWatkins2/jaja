import java.util.Scanner;
import java.util.TreeSet;

/** J05020sapxepsinhvientheolop */
public class J05020sapxepsinhvientheolop {
  public static class sv implements Comparable<sv> {
    String masv, name, lop, email;

    public sv(String masv, String name, String lop, String email) {
      this.masv = masv;
      this.name = name;
      this.lop = lop;
      this.email = email;
    }

    @Override
    public int compareTo(J05020sapxepsinhvientheolop.sv o) {
      if (this.lop.equals(o.lop)) {
        return this.masv.compareTo(o.masv);
      }
      return this.lop.compareTo(o.lop);
    }

    @Override
    public String toString() {
      return String.format("%s %s %s %s", this.masv, this.name, this.lop, this.email);
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    sc.nextLine();
    TreeSet<sv> ts = new TreeSet<>();
    while (t-- > 0) {
      ts.add(new sv(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
    }
    for (sv e : ts) {
      System.out.println(e);
    }
  }
}
