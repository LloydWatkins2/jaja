import java.util.*;

public class J02105danhsachke {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    ArrayList<Integer>[] ans = new ArrayList[t + 1];
    for (int i = 0; i <= t; i++) {
      ans[i] = new ArrayList<>();
    }

    for (int i = 1; i <= t; i++) {
      for (int j = 1; j <= t; j++) {
        if (sc.nextInt() == 1 && i < j) {
          ans[i].add(j);
          ans[j].add(i);
        }
      }
    }

    for (int i = 1; i <= t; i++) {
      System.out.print("List(" + i + ") = ");
      for (int vertex : ans[i]) {
        System.out.print(vertex + " ");
      }
      System.out.println();
    }
    sc.close();
  }
}
