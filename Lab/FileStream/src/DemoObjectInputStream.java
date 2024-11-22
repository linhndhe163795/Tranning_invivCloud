import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DemoObjectInputStream {
    public void TestObjectInputStream() {
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        try {
            fis = new FileInputStream("fileobject.dat");
            ois = new ObjectInputStream(fis);
            Stock[] stocks = (Stock[]) ois.readObject();
            System.out.println("Doc tu file: ");
            for (Stock s : stocks) {
                System.out.println(s.totring());
            }
            ois.close();fis.close();
        } catch (Exception e) {
            System.out.println("Co loi: " + e);
        }
    }
}
