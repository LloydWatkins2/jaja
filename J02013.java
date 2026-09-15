import java.util.*;

public class J02013 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int max = sc.nextInt();
    int[] ar = new int[max];
    for (int i = 0; i < max; i++) {
      ar[i] = sc.nextInt();
    }
    for (int i = 0; i < max - 1; i++) {
      boolean check = false;
      for (int j = 0; j < max - i - 1; j++) {
        if (ar[j + 1] < ar[j]) {
          int temp = ar[j];
          ar[j] = ar[j + 1];
          ar[j + 1] = temp;
          check = true;
        }

      }
      if (!check) {
        break;
      }
      System.out.printf("Buoc %d: ", i + 1);

      for (int k : ar) {
        System.out.printf("%d ", k);
      }
      System.out.println();
    }
  }
}
