import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/** J05028danhsachdoanhnghiepsinhvienthuctap_1 */
public class J05029danhsahdoanhnghiepnhansinhvienthuctap_2 {
  public static class doanhnghiep {
    String mdn, name;
    int capacity;

    public doanhnghiep(String mdn, String name, int capacity) {
      this.mdn = mdn;
      this.name = name;
      this.capacity = capacity;
    }

    @Override
    public String toString() {
      return String.format("%s %s %d", this.mdn, this.name, this.capacity);
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    ArrayList<doanhnghiep> ar = new ArrayList<>();
    while (t-- > 0) {
      sc.nextLine();
      ar.add(new doanhnghiep(sc.nextLine(), sc.nextLine(), sc.nextInt()));
    }
    Collections.sort(
        ar,
        (doanhnghiep a, doanhnghiep b) -> {
          if (a.capacity == b.capacity) {
            return a.mdn.compareTo(b.mdn);
          }
          return b.capacity - a.capacity;
        });
    int q = sc.nextInt();
    while (q-- > 0) {
      int a = sc.nextInt();
      int b = sc.nextInt();
      System.out.printf("DANH SACH DOANH NGHIEP NHAN TU %d DEN %d SINH VIEN:\n", a, b);
      for (doanhnghiep e : ar) {
        if (e.capacity >= a && e.capacity <= b) System.out.println(e);
      }
    }
  }
}
