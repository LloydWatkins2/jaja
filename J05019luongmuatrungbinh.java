import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Scanner;

/** J05019luongmuatrungbinh */
public class J05019luongmuatrungbinh {
  public static class tram {
    String maa, name;
    double lm1hr, tongthoigian, tongluongmua;

    public tram(int maa, String name) {
      this.maa = String.format("T%02d", maa);
      this.name = name;
      this.tongthoigian = 0;
      this.tongluongmua = 0;
    }

    public void getL1hr() {
      this.lm1hr = this.tongluongmua / this.tongthoigian;
    }

    @Override
    public String toString() {
      return String.format("%s %s %.2f", this.maa, this.name, this.lm1hr);
    }
  }

  public static void main(String[] args) throws ParseException {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    HashMap<String, tram> ts = new HashMap<>();
    ArrayList<tram> ar = new ArrayList<>();
    int cnt = 1;
    while (t-- > 0) {
      sc.nextLine();
      String ten = sc.nextLine();
      if (!ts.containsKey(ten)) {
        ts.put(ten, new tram(cnt++, ten));
      }
      tram e = ts.get(ten);
      SimpleDateFormat f = new SimpleDateFormat("hh:mm");
      Date dau = f.parse(sc.nextLine());
      Date cuoi = f.parse(sc.nextLine());
      double sohr = (cuoi.getTime() - dau.getTime()) / (double) (1000 * 60 * 60);
      int lm = sc.nextInt();
      e.tongthoigian += sohr;
      e.tongluongmua += lm;
      ts.put(ten, e);
    }
    for (String e : ts.keySet()) {
      tram k = ts.get(e);
      k.getL1hr();
      ar.add(k);
    }
    Collections.sort(ar, (a, b) -> a.maa.compareTo(b.maa));
    for (tram e : ar) System.out.println(e);
  }
}
