import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/** J07022loaibosonguyen */
public class J07022loaibosonguyen {
  public static void main(String[] args) throws FileNotFoundException {
    Scanner sc = new Scanner(new File("DATA.in"));
    ArrayList<String> ar = new ArrayList<>();
    while (sc.hasNextLine()) {
      String[] t = sc.nextLine().trim().split("\\s+");
      for (String e : t) {
        try {
          int te = Integer.parseInt(e);
        } catch (Exception k) {
          ar.add(e);
        }
      }
    }
    Collections.sort(ar);
    for (String e : ar) System.out.print(e + " ");
  }
}
