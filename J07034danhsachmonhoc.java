import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.TreeSet;

/** J07034danhsachmonhoc */
public class J07034danhsachmonhoc {
  public static class mh implements Comparable<mh> {
    String mamh, ten;
    int tc;

    public mh(String mamh, String ten, int tc) {
      this.mamh = mamh;
      this.ten = ten;
      this.tc = tc;
    }

    @Override
    public int compareTo(mh b) {
      return this.ten.compareTo(b.ten);
    }

    @Override
    public String toString() {
      return String.format("%s %s %d", this.mamh, this.ten, this.tc);
    }
  }

  public static void main(String[] args) throws FileNotFoundException {
    Scanner sc = new Scanner(new File("MONHOC.in"));
    int t = sc.nextInt();
    TreeSet<mh> ts = new TreeSet<>();
    while (t-- > 0) {
      sc.nextLine();
      ts.add(new mh(sc.nextLine(), sc.nextLine(), sc.nextInt()));
    }
    for (mh e : ts) System.out.println(e);
  }
}
