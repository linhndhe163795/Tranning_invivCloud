import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DemoDataOutputStream {
  public void demoDataOutputStream() throws IOException {
      try  {
          FileOutputStream fos = new FileOutputStream("data1.dat");
          DataOutputStream dos = new DataOutputStream(fos);
          dos.writeUTF("Hello word!");
          dos.writeInt(123);
          dos.writeDouble(45.67);
          dos.writeBoolean(true);
          dos.flush();
          dos.close();
      } catch (IOException e)
      {
          e.printStackTrace();
      }
  }
}
