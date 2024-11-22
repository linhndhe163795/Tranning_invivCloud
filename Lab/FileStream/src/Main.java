import java.io.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException {
        // ghi file

        try{
            FileOutputStream fos = new FileOutputStream("file1.txt");
            String text = "Test file output stream";
            // đọc file
            FileInputStream fis = new FileInputStream("file1.txt");
            byte[] bytes = text.getBytes();
            fos.write(bytes);
            int c;
            // buffer đọc file từng phần
            System.out.println("Đọc file: ");
            while ((c = fis.read()) != -1) {
                System.out.print((char) c);
            }
            fis.close();
        }catch (FileNotFoundException e){
            System.out.println("File not found");
        }catch (IOException e){
            e.printStackTrace();
        }
        DemoDataOutputStream ddos = new DemoDataOutputStream();
        ddos.demoDataOutputStream();
        System.out.println();
        System.out.println("Đọc file dataInputStream: ");
        DemoDataInputStream din = new DemoDataInputStream();
        din.TestDataInputStream();
        DemoObjectInputStream dos = new DemoObjectInputStream();
        dos.TestObjectInputStream();
        DemoObjectOutputStream ddos2 = new DemoObjectOutputStream();
        ddos2.Test();


    }
}