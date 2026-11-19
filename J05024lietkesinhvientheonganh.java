/** J05023lietkesinhvientheokhoa */
import java.util.*;

public class J05024lietkesinhvientheonganh {
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
    HashMap<String, String> hm = new HashMap<>();
    hm.put("Ke toan", "DCKT");
    hm.put("Cong nghe thong tin", "DCCN");
    hm.put("An toan thong tin", "DCAT");
    hm.put("Vien thong", "DCVT");
    hm.put("Dien tu", "DCDT");
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
      System.out.println("DANH SACH SINH VIEN NGANH " + s.toUpperCase() + ":");
      for (sv e : ts) {
        String serq = hm.get(s);
        if (serq.equals(e.masv.substring(3, 7))) {
          if (serq.equals("DCAT") || serq.equals("DCCN")) {
            if (!e.lop.startsWith("E")) System.out.println(e);
          } else {
            System.out.println(e);
          }
        }
      }
    }
  }
}
