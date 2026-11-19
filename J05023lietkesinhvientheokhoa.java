/** J05023lietkesinhvientheokhoa */
import java.util.*;

public class J05023lietkesinhvientheokhoa {
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
      String s = sc.nextLine();
      System.out.println("DANH SACH SINH VIEN KHOA " + s + ":");
      for (sv e : ts) {
        if (s.substring(2, s.length()).equals(e.lop.substring(1, 3))) {
          System.out.println(e);
        }
      }
    }
  }
}
