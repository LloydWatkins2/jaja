import java.util.*;

/** J05022lietkesinhvientheolop */
public class J05022lietkesinhvientheolop {
  public static class sv {
    String masv, name, lop, email;

    public sv(String masv, String name, String lop, String email) {
      this.masv = masv;
      this.name = name;
      this.lop = lop;
      this.email = email;
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
    LinkedHashSet<sv> ts = new LinkedHashSet<>();
    while (t-- > 0) {
      ts.add(new sv(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
    }
    int q = sc.nextInt();
    sc.nextLine();
    while (q-- > 0) {
      String lop = sc.nextLine();
      System.out.println("DANH SACH SINH VIEN LOP " + lop + ":");
      for (sv e : ts) {
        if (e.lop.equals(lop)) {
          System.out.println(e);
        }
      }
    }
  }
}
