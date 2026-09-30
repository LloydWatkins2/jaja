import java.math.BigInteger;
import java.util.*;

public class J3011uocsochungcuasolon {
  static BigInteger bggcd(BigInteger a, BigInteger b) {
    return b.equals(new BigInteger("0")) ? a : bggcd(b, a.mod(b));
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      BigInteger a = sc.nextBigInteger();
      BigInteger b = sc.nextBigInteger();
      System.out.println(bggcd(a, b));
    }
    sc.close();
  }
}
