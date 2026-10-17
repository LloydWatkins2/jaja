import java.io.File;
import java.util.Scanner;

/** J07001docfilevanban */
public class J07001docfilevanban {

  public static void main(String[] args) {
    try {
      Scanner sc = new Scanner(new File("DATA.in"));
      while (sc.hasNextLine()) {
        System.out.println(sc.nextLine());
      }
      sc.close();
    } catch (Exception e) {

    }
  }
}
