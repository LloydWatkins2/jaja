import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Scanner;

/** J05016hoadonkhachsan */
public class J05016hoadonkhachsan {
  public static class kh {
    String mkh, ten, roomno, ngayo;
    int cashout;

    public kh(int mkh, String ten, String roomno, String ngayo, int cashout) {
      this.mkh = String.format("KH%02d", mkh);
      this.ten = ten;
      this.roomno = roomno;
      this.ngayo = ngayo;
      this.cashout = cashout;
    }

    @Override
    public String toString() {
      return String.format(
          "%s %s %s %s %d", this.mkh, this.ten, this.roomno, this.ngayo, this.cashout);
    }
  }

  public static void main(String[] args) throws ParseException {
    Scanner sc = new Scanner(System.in);
    HashMap<Character, Integer> hm = new HashMap<>();
    hm.put('1', 25);
    hm.put('2', 34);
    hm.put('3', 50);
    hm.put('4', 80);
    int t = sc.nextInt();
    int cnt = 1;
    ArrayList<kh> ar = new ArrayList<>();
    while (t-- > 0) {
      sc.nextLine();
      String ten = sc.nextLine();
      String phong = sc.nextLine();
      SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");
      Date ngayden = f.parse(sc.nextLine());
      Date ngaydi = f.parse(sc.nextLine());
      int ngayo = (int) ((ngaydi.getTime() - ngayden.getTime()) / (24 * 60 * 60 * 1000) + 1);
      int phuphi = sc.nextInt();
      int gia1 = hm.get(phong.charAt(0));
      ar.add(new kh(cnt++, ten, phong, Integer.toString(ngayo), ngayo * gia1 + phuphi));
    }
    Collections.sort(ar, (a, b) -> Integer.compare(b.cashout, a.cashout));
    for (kh ee : ar) {
      System.out.println(ee);
    }
  }
}
