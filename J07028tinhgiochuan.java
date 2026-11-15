import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

/** J07028tinhgiochuan */
public class J07028tinhgiochuan {

  public static class gc {
    mh mh;
    gv gv;
    double giochuan;

    public gc(mh mh, gv gv, double gc) {
      this.mh = mh;
      this.gv = gv;
      this.giochuan = gc;
    }

    @Override
    public String toString() {
      return String.format("%s %.2f", this.gv.ten, this.giochuan);
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
    HashMap<String, String> gv = new HashMap<>();
    sc2.nextLine();
    while (e-- > 0) {
      gv.put(sc2.next(), sc2.next());
    }
  }
}
