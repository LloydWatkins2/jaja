import java.util.*;

public class J02104danhsachcanh {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[][] ar = new int[n][n];
    ArrayList<AbstractMap.SimpleEntry<Integer, Integer>> lhm = new ArrayList<>();
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        ar[i][j] = sc.nextInt();
        if (ar[i][j] == 1 && i < j) {
          AbstractMap.SimpleEntry<Integer, Integer> par = new AbstractMap.SimpleEntry<>(i, j);
          lhm.add(par);
        }
      }
    }
    for (AbstractMap.SimpleEntry<Integer, Integer> i : lhm) {
      System.out.printf("(%d,%d)\n", i.getKey() + 1, i.getValue() + 1);
    }
    sc.close();
  }
}
