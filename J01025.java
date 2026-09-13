import java.util.*;
public class J01025 {
  static class point {
        int x, y;
        point() {}
        point(int x, int y) { this.x = x; this.y = y; }
        double distance(point other) {
            return Math.sqrt(Math.pow(this.x - other.x, 2) + Math.pow(this.y - other.y, 2));
        }
  }  

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        point td1=new point(sc.nextInt(),sc.nextInt());
        point pt1=new point(sc.nextInt(),sc.nextInt());
        point td2=new point(sc.nextInt(),sc.nextInt());
        point pt2=new point(sc.nextInt(),sc.nextInt());

        point tren=new point(Math.min(td1.x,td2.x),Math.max(pt1.y,pt2.y));
        point duoi=new point(Math.max(pt1.x,pt2.x),Math.min(td1.y,td2.y));

        point trunggian=new point(tren.x,duoi.y);

        int ans=(int) Math.max(trunggian.distance(tren),trunggian.distance(duoi));
        System.out.println(ans*ans);
  }
  
}
