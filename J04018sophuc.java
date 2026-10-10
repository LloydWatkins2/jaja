import java.util.Scanner;

public class J04018sophuc {
  public static class complx {
    int real;
    int ig;

    public complx(int real, int ig) {
      this.real = real;
      this.ig = ig;
    }

    public complx add(complx b) {
      return new complx(this.real + b.real, this.ig + b.ig);
    }

    public complx mul(complx b) {
      return new complx(this.real * b.real - this.ig * b.ig, this.real * b.ig + this.ig * b.real);
    }

    @Override
    public String toString() {
      return this.real + " + " + this.ig + 'i';
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      complx a1 = new complx(sc.nextInt(), sc.nextInt());
      complx a2 = new complx(sc.nextInt(), sc.nextInt());

      complx c1 = a1.add(a2);
      complx c2 = c1.mul(a1);
      complx d = c1.mul(c1);
      System.out.printf("%s, %s\n", c2, d);
    }
  }
}
