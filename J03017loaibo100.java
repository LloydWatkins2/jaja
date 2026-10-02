import java.util.Scanner;
import java.util.Stack;

// đề yêu cầu phải tìm độ dài lớn nhất của xâu con bị loại bỏ;
// loại các xâu con bằng stack: nếu stack size < 2(chưa có gì) đẩy index của char hiện tại vào:
// nếu stack có 2 số đỉnh stack là 10 và giá trị hiện tại là 0(pop 2 index đầu ra khỏi stack(xóa xâu
// con))
// ngược lại đẩy index char hiện tại vào;
// loop hết string, stack có dạng là các index còn lại ,sắp xếp tăng dần.
// xét các xâu đã loại tiềm năng:
// các phần chênh lệnh giữa các index liên kề nhau(là độ dài của 1 xâu con đã bị xóa) bên trong
// stack-> tìm max các chênh lệch đó
// nếu stack rỗng,tức là cả xâu bị xóa, ans= cả xâu;
// ngược lại:
// phần đầu(lấy đít stack(là index không bị xóa đầu tiên (nếu khác 0 thì phần từ 0 -> index-1 bị xóa
// (len =index-1+1=index)),lấy max các phần trên so sánh))
// phần đuôi(lấy đầu stack(là index cuối bị xóa (nếu khác s len-1 thì phần từ last+1 ->s.len-1  bị
// xóa ((len =s.len-1-(last+1)+1=s.len-last-1),lấy max các phần trên so sánh))
public class J03017loaibo100 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      String s = sc.next();
      Stack<Integer> st = new Stack<>();
      int n = s.length();
      for (int i = 0; i < n; i++) {
        if (st.size() < 2) st.push(i);
        else {
          if (s.charAt(i) == '0'
              && s.charAt(st.lastElement()) == '0'
              && s.charAt(st.elementAt(st.size() - 2)) == '1') {
            st.pop();
            st.pop();
          } else st.push(i);
        }
      }
      int ans = 0;
      for (int i = 1; i < st.size(); i++) {
        ans = Math.max(ans, st.elementAt(i) - st.elementAt(i - 1) - 1);
      }
      if (st.empty()) {
        ans = s.length();
      } else {
        ans = Math.max(ans, st.elementAt(0));
        ans = Math.max(ans, s.length() - st.lastElement() - 1);
      }
      System.out.println(ans);
    }
    sc.close();
  }
}
