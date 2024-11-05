import entity.NhanVien;
import manage.Menu;
import manage.QuanLyNhanSu;
import validation.Validation;

import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        QuanLyNhanSu qlns = new QuanLyNhanSu();
        Menu menu = new Menu();
        Validation validation = new Validation();
        qlns.taoData();
        while (true){
            menu.menu();
            System.out.print("Nhập lựa chọn của bạn: ");
            int option = validation.checkInputInRange(1,9);
            switch (option){
                case 1:
                    qlns.nhap();
                    break;
                case 2:
                    qlns.xuat();
                    break;
                case 3:
                    qlns.hienThiNhanVienTheoMa();
                    break;
                case 4:
                    qlns.xoaNhanVien();
                    break;
                case 5:
                    qlns.capNhapThongTinNhanVien();
                    break;
                case 6:
                    qlns.timNhanVienTheoMucLuong();
                    break;
                case 7:
                    qlns.sapXepTheoTen();
                    break;
                case 8:
                    qlns.sapXepTheoThuNhap();
                    break;
                case 9:
                    qlns.xuat5NhanVienCoThuNhapCaoNhat();
                    break;
                case 10:
                    return;
            }
        }

    }
}