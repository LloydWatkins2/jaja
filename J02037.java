import java.util.*;

public class J02037 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    sc.nextLine();
    while (t-- > 0) {
      String[] st = sc.nextLine().trim().split("\\s+");
      int cnt = 0;
      for (int i = 0; i < st.length; i++) {
        if (Integer.parseInt(st[i]) % 2 == 0) {
          cnt++;
        }
      }
      if ((st.length % 2 == 0 && cnt > st.length - cnt)
          || (st.length % 2 == 1 && cnt < st.length - cnt)) {
        System.out.println("YES");
      } else {
        System.out.println("NO");
      }
    }
    sc.close();
  }
}
