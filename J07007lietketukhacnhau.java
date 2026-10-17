import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.TreeSet;

/** J07007lietketukhacnhau */
public class J07007lietketukhacnhau {
  public static void main(String[] args) throws FileNotFoundException {
    Scanner sc = new Scanner(new File("VANBAN.in"));
    TreeSet<String> ts = new TreeSet<>();
    while (sc.hasNextLine()) {
      String[] t = sc.nextLine().trim().toLowerCase().split("\\s+");
      for (String e : t) {
        ts.add(e);
      }
    }
    for (String e : ts) System.out.println(e);
  }
}
