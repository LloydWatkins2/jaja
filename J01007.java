import java.util.*;
import java.io.*;
import java.lang.*;

public class J01007{
  static HashSet<Long> init(){
    long[] n=new long[93];
    n[0]=0;
    n[1]=1;
    HashSet<Long> check= new HashSet<>();
    check.add(n[0]);
    check.add(n[1]);
    for (int i = 2; i <n.length; i++) {
      n[i]=n[i-1]+n[i-2];
      check.add(n[i]);
    }
    return check;
  }
  public static void main(String[] args){
    HashSet<Long> check= init();
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    while (t>0) {
      long n=sc.nextLong();
      if (check.contains(n)) {
        System.out.println("YES");
      }else{
        System.out.println("NO");
      }
      t--;
    }
  }
}
