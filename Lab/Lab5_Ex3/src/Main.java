import manage.Menu;
import manage.QuanLySanPham;
import validation.Validation;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();
        Validation validation = new Validation();
        QuanLySanPham qlsp = new QuanLySanPham();
        while (true) {
            menu.menu();
            System.out.println("Enter option: ");
            int option = validation.checkInputInRange(1, 5);
            switch (option) {
                case 1:
                    qlsp.nhapDanhsachSanPham();
                    break;
                case 2:
                    qlsp.sapXepSanPhamTheoGia();
                    break;
                case 3:
                    qlsp.xoaSanPham();
                    break;
                case 4:
                    System.out.println("Giá trung bình: " + qlsp.tinhTrungBinhGiaSanPham());
                    break;
                case 5:
                    return;
            }
        }
    }
}