import entity.NhanVien;
import manage.Enums;
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
            int option = validation.checkInputInRange(Enums.MIN.getValues(),Enums.MAX.getValues());
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
                    qlns.timNhanVienTheoMaList();
                    break;
                case 5:
                    qlns.xoaNhanVien();
                    break;
                case 6:
                    qlns.capNhapThongTinNhanVien();
                    break;
                case 7:
                    qlns.timNhanVienTheoMucLuong();
                    break;
                case 8:
                    qlns.sapXepTheoTen();
                    break;
                case 9:
                    qlns.sapXepTheoThuNhap();
                    break;
                case 10:
                    qlns.xuat5NhanVienCoThuNhapCaoNhat();
                    break;
                case 11:
                    return;
            }
        }
    }
}