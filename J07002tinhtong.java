import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class J07002tinhtong {
  public static void main(String[] args) throws FileNotFoundException {
    Scanner sc = new Scanner(new File("DATA.in"));
    long tong = 0;
    while (sc.hasNext()) {
      String k = sc.next();
      if (k.matches("^[+-]?\\d+$")) {

        try {
          tong += Integer.parseInt(k);
        } catch (NumberFormatException e) {

        }
      }
    }
    System.out.println(tong);
    sc.close();
  }
}
