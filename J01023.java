import java.util.*;


public class J01023 {
  static ArrayList<String> gennum(String s){
    ArrayList<String> ans= new ArrayList<>();
    if (s.charAt(0)=='?') {
      for (char i = '1'; i <= '9'; i++) {
        ans.add(i+""+s.charAt(1));
      }
    }else{
      ans.add(s);
    }
    if (s.charAt(1)=='?') {
      ArrayList<String> a=new ArrayList<>();
      for(String i:ans){
        for (char c = '0'; c <= '9'; c++) {
          a.add(i.charAt(0)+""+c);
        }
      }
      return a;
    }
    return ans;
  }
  static String genno(String s){
    if (s.equals("?")) {
      return "+-*/";
    }
    return s;
  }
  static int cal(int a,int b,char op){
    if (op=='+') return a+b;
    if (op=='-') return a-b;
    if (op=='*') return a*b;
    if (op=='/'&& a%b==0) return a/b;
    else return 0;
  }
  static boolean check(String a,String b,char op, String c){
    int na=Integer.parseInt(a);
    int nb=Integer.parseInt(b);
    int nc=Integer.parseInt(c);
    return na>9&&nb>9&&nc>9&& cal(na,nb,op)==nc;
  }
  static void solve(String a,String op, String b,String equal,String c){
    ArrayList<String> sa=gennum(a);
    ArrayList<String> sb=gennum(b);
    ArrayList<String> sc=gennum(c);
    op=genno(op);
    for (String i : sa) {
      for (String j : sb) {
        for (String k : sc) {
          for(char s:op.toCharArray()){
            if (check(i,j,s,k)) {
              System.out.printf("%s %c %s %s %s\n",i,s,j,equal,k);
              return;
            }

          }
          
        }
        
      }
      
    }
    System.out.println("WRONG PROBLEM!");
  }

  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    while (t-- >0) {
      solve(sc.next(),sc.next(),sc.next(),sc.next(),sc.next());
      
    }
  } 
}
