import java.util.Scanner;

public class J04016tichhaidoituongmatran {
  public static class Matrix {
    int n;
    int m;
    int[][] ar;

    public Matrix(int n, int m) {
      this.n = n;
      this.m = m;
      this.ar = new int[n][m];
    }

    public void nextMatrix(Scanner sc) {
      for (int i = 0; i < this.n; i++) {
        for (int j = 0; j < this.m; j++) {
          this.ar[i][j] = sc.nextInt();
        }
      }
    }

    public String mul(Matrix b) {
      Matrix ans = new Matrix(this.n, b.m);
      for (int i = 0; i < ans.n; i++) {
        for (int j = 0; j < ans.m; j++) {
          for (int k = 0; k < this.m; k++) {
            ans.ar[i][j] += (this.ar[i][k] * b.ar[k][j]);
          }
        }
      }
      String as = "";
      for (int i = 0; i < ans.n; i++) {
        for (int j = 0; j < ans.m; j++) {
          as += (ans.ar[i][j] + " ");
        }
        as += "\n";
      }
      return as;
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt(), m = sc.nextInt(), p = sc.nextInt();
    Matrix a = new Matrix(n, m);
    a.nextMatrix(sc);
    Matrix b = new Matrix(m, p);
    b.nextMatrix(sc);
    System.out.println(a.mul(b));
  }
}
