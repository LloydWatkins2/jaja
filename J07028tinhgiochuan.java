import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/** J07028tinhgiochuan */
public class J07028tinhgiochuan {

  public static class gv {
    String magv, ten;
    double giochuan;

    public gv(String magv, String ten, double gc) {
      this.magv = magv;
      this.ten = ten;
      this.giochuan = gc;
    }

    @Override
    public String toString() {
      return String.format("%s %.2f", this.ten, this.giochuan);
    }
  }

  public static void main(String[] args) throws FileNotFoundException {
    Scanner sc1 = new Scanner(new File("MONHOC.in"));
    Scanner sc2 = new Scanner(new File("GIANGVIEN.in"));
    Scanner sc3 = new Scanner(new File("GIOCHUAN.in"));
    int t = sc1.nextInt();
    HashMap<String, String> mh = new HashMap<>();
    sc1.nextLine();
    while (t-- > 0) {
      mh.put(sc1.next(), sc1.next());
    }
    int e = sc2.nextInt();
    HashMap<String, gv> gve = new HashMap<>();
    ArrayList<gv> ans = new ArrayList<>();
    while (e-- > 0) {
      String magv = sc2.next();
      gv now = new gv(magv, sc2.nextLine(), 0);
      gve.put(magv, now);
      ans.add(now);
    }
    int k = sc3.nextInt();
    while (k-- > 0) {
      sc3.nextLine();
      String magv = sc3.next();
      String mamon = sc3.next();
      double sum = sc3.nextDouble();
      gve.get(magv).giochuan += sum;
    }
    for (gv ee : ans) System.out.println(ee);
  }
}
