import entity.SinhVien;
import entity.SinhVienIT;
import entity.SinhVienKinhTe;
import manage.Menu;
import manage.QuanLySinhVien;
import validation.Validation;

import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        SinhVienIT svIt = new SinhVienIT("Nguyen Van A", "IT",4,5,4);
        SinhVienKinhTe svKt = new SinhVienKinhTe("Nguyen Van B", "KinhTe",9,5);
        svIt.xuat();
        svKt.xuat();
        Menu menu = new Menu();
        Validation validation = new Validation();
        QuanLySinhVien qlsv = new QuanLySinhVien();

        while (true) {
            menu.menu();
            System.out.println("Enter option: ");
            int option = validation.checkInputInRange(1, 5);
            switch (option) {
                case 1:
                    qlsv.nhapDanhsachSinhVien();
                    break;
                case 2:
                    qlsv.xuat();
                    break;
                case 3:
                    qlsv.sapXepSinhVienHocLuc();
                    break;
                case 4:
                    qlsv.sapXepSinhVienTheoDiem();
                    break;
                case 5:
                    return;
            }
        }
    }
}