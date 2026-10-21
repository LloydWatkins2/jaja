import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/** J07013danhsachsinhvientrongfilenhiphan */
public class J07013danhsachsinhvientrongfilenhiphan {
  public static class SinhVien implements Serializable {
    String masv, ten, lop;
    Date dob;
    double gpa;

    public SinhVien(int id, String ten, String lop, String dob, double gpa) throws ParseException {
      this.masv = String.format("B20DCCN%03d", id);
      this.ten = ten;
      this.lop = lop;
      SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");
      this.dob = f.parse(dob);
      this.gpa = gpa;
    }

    @Override
    public String toString() {
      SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");
      return masv + " " + ten + " " + lop + " " + f.format(dob) + " " + String.format("%.2f", gpa);
    }
  }

  public static void main(String[] args)
      throws FileNotFoundException, IOException, ClassNotFoundException {
    ObjectInputStream sc = new ObjectInputStream(new FileInputStream("SV.in"));
    ArrayList<SinhVien> source = (ArrayList<SinhVien>) sc.readObject();
    for (SinhVien e : source) System.out.println(e);
  }
}
