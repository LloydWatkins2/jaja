import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/** J07019hoadon1 */
public class J07019hoadon1 {
  public static class khodon {
    String masp, ten;
    long gia1, gia2;

    public khodon(String masp, String ten, long gia1, long gia2) {
      this.masp = masp;
      this.ten = ten;
      this.gia1 = gia1;
      this.gia2 = gia2;
    }
  }

  public static class hoadon {
    khodon key;
    String masp, ten;
    long discount, fee;

    public hoadon(int loai, khodon key, String masp, long soluong) {
      this.masp = masp;
      this.ten = key.ten;
      long tonggia;
      if (loai == 1) {
        tonggia = soluong * key.gia1;
      } else {
        tonggia = soluong * key.gia2;
      }
      if (soluong >= 50 && soluong < 100) {
        this.discount = (long) (tonggia * 0.15);
      } else if (soluong >= 100 && soluong < 150) {
        this.discount = (long) (tonggia * 0.3);
      } else if (soluong >= 150) {
        this.discount = (long) (tonggia * 0.5);
      }

      this.fee = tonggia - this.discount;
    }

    @Override
    public String toString() {
      return String.format("%s %s %d %d", this.masp, this.ten, this.discount, this.fee);
    }
  }

  public static void main(String[] args) throws FileNotFoundException {
    Scanner sc1 = new Scanner(new File("DATA1.in"));
    Scanner sc2 = new Scanner(new File("DATA2.in"));
    int t = sc1.nextInt();
    HashMap<String, khodon> match = new HashMap<>();
    while (t-- > 0) {
      sc1.nextLine();
      String ma = sc1.nextLine();
      khodon tem = new khodon(ma, sc1.nextLine(), sc1.nextLong(), sc1.nextLong());
      match.put(ma, tem);
    }
    int t1 = sc2.nextInt();
    ArrayList<hoadon> don = new ArrayList<>();
    int cnt = 1;
    while (t1-- > 0) {
      String ms = sc2.next();
      long soluong = sc2.nextLong();
      String masp = ms + "-" + String.format("%03d", cnt++);
      String matkey = ms.substring(0, 2);
      int loai = Integer.parseInt(ms.substring(2, 3));
      khodon key = match.get(matkey);
      don.add(new hoadon(loai, key, masp, soluong));
    }
    for (hoadon e : don) System.out.println(e);
  }
}
