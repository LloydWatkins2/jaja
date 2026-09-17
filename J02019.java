import java.util.*;

public class J02019 {
  static int maxe = 1000001;
  static long[] nm = new long[maxe];

  // sàng ước số (đếm số ước của 1 tập số )
  static void dive() {
    Arrays.fill(nm, 0);
    for (int i = 1; i <= maxe / 2; i++) {
      for (int j = i * 2; j < maxe; j += i) {
        nm[j] += i;
      }
    }
  }

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    long cnt = 0;
    dive();
    for (int i = a; i <= b; i++) {
      if (nm[i] > i) {
        cnt++;
      }
    }
    System.out.println(cnt);

    sc.close();
  }
}
