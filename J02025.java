import java.util.*;

public class J02025 {
  static boolean snt(int k){
    if(k<2) return false;
    for(int i=2;i<=Math.sqrt(k);i++){
      if(k%i==0){
        return false;
      }
    }
    return true;
  }
  static void trye (int end, ArrayList<Integer> a,int sum,String s) {
    if(snt(sum)){
      System.out.println(s);
    }
    for (int i = a.size()-1; i > end; i--) {
      trye(i,a,sum+a.get(i),s+a.get(i)+' ');
    }
  }
  public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    int t=sc.nextInt();
    while (t-- >0) {
      int max=sc.nextInt();
      ArrayList<Integer> a=new ArrayList<>();
      for (int  i = 0; i < max; i++) {
         a.add(sc.nextInt());
      }
      Collections.sort(a,Comparator.reverseOrder());
      trye(-1,a,0,"");
      
    }
    sc.close();

  } 
}

