import java.util.Scanner;

public class J04005khaibaoopthisinh {
  public static class thisinh {
    String ten;
    String dob;
    double p1;
    double p2;
    double p3;

    public thisinh() {}

    public thisinh(String ten, String dob, double p1, double p2, double p3) {
      this.ten = ten;
      this.dob = dob;
      this.p1 = p1;
      this.p2 = p2;
      this.p3 = p3;
    }

    public double tinhdiem() {
      return this.p1 + this.p2 + this.p3;
    }

    public void show() {
      System.out.printf("%s %s %.1f", this.ten, this.dob, this.tinhdiem());
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String ten = sc.nextLine();
    String dob = sc.nextLine();
    thisinh uyenp = new thisinh(ten, dob, sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
    uyenp.show();
    sc.close();
  }
}
