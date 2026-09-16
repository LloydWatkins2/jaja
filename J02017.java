import java.util.*;

public class J02017 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    Stack<Integer> st = new Stack<>();
    for (int i = 0; i < n; i++) {
      int temp = sc.nextInt();
      if (st.empty()) {
        st.push(temp);
      } else if ((temp + st.lastElement()) % 2 == 0) st.pop();
      else st.push(temp);
    }
    System.out.println(st.size());
    sc.close();
  }
}
