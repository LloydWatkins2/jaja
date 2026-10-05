import java.util.Scanner;

public class J04002khaibaolopchunhat {
  public static class hcn {
    double width;
    double height;
    String color;

    public hcn() {}
    ;

    public hcn(double width, double height, String color) {
      this.width = width;
      this.height = height;
      this.color = color;
    }

    double getWidth() {
      return this.width;
    }

    public void setWidth(double width) {
      this.width = width;
    }

    public double getHeight() {
      return this.height;
    }

    public void setHeight(double height) {
      this.height = height;
    }

    public void setColor(String s) {
      this.color = s;
    }

    public String getColor() {
      StringBuilder st = new StringBuilder(this.color.toLowerCase());
      st.setCharAt(0, Character.toUpperCase(st.charAt(0)));
      return st.toString();
    }

    public long findArea() {
      return (long) (this.width * this.height);
    }

    public long findPr() {
      return (long) (this.width + this.height) * 2;
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double w = sc.nextDouble();
    double h = sc.nextDouble();
    String color = sc.next();
    if (w == (long) w && h == (long) h && h > 0 && w > 0) {
      hcn h1 = new hcn(w, h, color);
      System.out.printf("%d %d %s", h1.findPr(), h1.findArea(), h1.getColor());
    } else {
      System.out.println("INVALID");
    }
    sc.close();
  }
}
