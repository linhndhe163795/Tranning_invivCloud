import java.io.*;

public class DemoDataInputStream {
      public void TestDataInputStream() throws IOException {
              try {
                      FileInputStream fis = new FileInputStream("data1.dat");
                      DataInputStream dis = new DataInputStream(fis);
                      int items = dis.readInt();
                      for (int i = 0; i < items; i++) {
                           int n = dis.readInt();
                              System.out.println(n + " ");
                      }
                      dis.close();
//                     System.out.println("string " + dis.readUTF());
//                     System.out.println("double " +dis.readDouble());
              }catch ( Exception ex)
              {
                      ex.printStackTrace();
              }
      }
}
