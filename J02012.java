import java.util.*;

public class J02012 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int max = sc.nextInt();
    PriorityQueue<Integer> ans = new PriorityQueue<>();
    int[] ar = new int[max];
    for (int i = 0; i < max; i++) {
      ar[i] = sc.nextInt();
    }
    for (int i = 0; i < max; i++) {
      System.out.printf("Buoc %d: ", i);
      ans.add(ar[i]);
      PriorityQueue<Integer> temp = new PriorityQueue<>(ans);
      while (!temp.isEmpty()) {
        System.out.printf("%d ", temp.poll());
      }
      System.out.println();
    }
    sc.close();
  }
}
