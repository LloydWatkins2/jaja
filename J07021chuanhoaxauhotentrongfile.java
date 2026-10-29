import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/** J07021chuanhoaxauhotentrongfile */
public class J07021chuanhoaxauhotentrongfile {
  public static void main(String[] args) throws FileNotFoundException {
    Scanner sc = new Scanner(new File("DATA.in"));

    while (sc.hasNextLine()) {
      String[] s = sc.nextLine().toLowerCase().trim().split("\\s+");
      if (s.length == 1) break;
      for (String e : s) {
        StringBuilder k = new StringBuilder(e);
        k.setCharAt(0, Character.toUpperCase(k.charAt(0)));
        System.out.print(k.toString() + " ");
      }
      System.out.println();
    }
  }
}
