import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/** J05015duaxedap */
public class J05015duaxedap {
  public static class cuarer {
    String ma, ten, addr;
    long kq;
    Double time;

    public cuarer(String ma, String ten, String addr, Double time, long kq) {
      this.ma = ma;
      this.ten = ten;
      this.addr = addr;
      this.time = time;
      this.kq = kq;
    }

    @Override
    public String toString() {
      return String.format("%s %s %s %s Km/h", this.ma, this.ten, this.addr, this.kq);
    }
  }

  public static void main(String[] args) throws ParseException {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    sc.nextLine();
    ArrayList<cuarer> ar = new ArrayList<>();
    while (t-- > 0) {
      String ten = sc.nextLine();
      String addr = sc.nextLine();
      String maten = "";
      String maaddr = "";
      for (String e : ten.split("\\s+")) {
        maten = maten + e.charAt(0);
      }
      for (String e : addr.split("\\s+")) {
        maaddr = maaddr + e.charAt(0);
      }
      String gio = sc.nextLine();
      SimpleDateFormat f = new SimpleDateFormat("HH:mm");

      double time = (f.parse(gio).getTime() - f.parse("6:00").getTime()) / 3600000.0;
      long kq = Math.round(120.0 / time);
      ar.add(new cuarer(maaddr + maten, ten, addr, time, kq));
    }
    Collections.sort(ar, (a, b) -> Double.compare(a.time, b.time));
    for (cuarer e : ar) System.out.println(e);
  }
}
