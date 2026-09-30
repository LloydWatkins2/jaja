import java.math.BigInteger;
import java.util.Scanner;

public class J03015hieusonguyenlon2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    BigInteger a = new BigInteger(sc.next());
    BigInteger b = new BigInteger(sc.next());
    String ans = a.subtract(b).toString();
    System.out.println(ans);
    sc.close();
  }
}
