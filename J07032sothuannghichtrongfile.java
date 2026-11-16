import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

/** J07032sothuannghichtrongfile */
public class J07032sothuannghichtrongfile {
  public static void main(String[] args)
      throws IOException, FileNotFoundException, ClassNotFoundException {
    ObjectInputStream ob1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
    ObjectInputStream ob2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
  }
}
