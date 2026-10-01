import java.util.Scanner;

public class J03016chiahetcho11 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      String s = sc.next();
      StringBuilder st = new StringBuilder(s);
      long oddsum = 0;
      long evensum = 0;
      int n = s.length();
      for (int i = 0; i < n; i++) {
        if ((i + 1) % 2 == 0) {
          evensum += (st.charAt(i) - '0');
        } else {
          oddsum += (st.charAt(i) - '0');
        }
      }
      if (Math.abs(evensum - oddsum) == 0 || Math.abs(evensum - oddsum) % 11 == 0) {
        System.out.println(1);
      } else {
        System.out.println(0);
      }
    }
    sc.close();
  }
}
