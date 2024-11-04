import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Manage m = new Manage();
        ArrayList<String> listName = new ArrayList<>();
        System.out.println("chọn option : ");
        while (true) {
            m.menu();
            System.out.println("chọn option : ");
            int option = sc.nextInt();
            switch (option) {
                case 1:
                    listName = m.nhap();
                    break;
                case 2:
                    m.xuat(listName);
                    break;
                case 3:
                    m.ngaunhien(listName);
                    break;
                case 4:
                    m.sapxep(listName);
                    break;
                case 5:
                    System.out.println("Nhập tên bạn muốn xóa:");
                    sc.nextLine();
                    String nameRemove = sc.nextLine();
                    if(m.KiemTraTonTaiTen(listName,nameRemove)){
                        m.xoa(listName,nameRemove);
                    }else{
                        System.out.println("Không tìm thấy tên!");
                    }
                    break;
                case 6:
                    return;
            }
        }
    }
}