//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        SanPham sp1 = new SanPham();
        sp1.nhap();
        sp1.xuat();
        SanPham sp2 = new SanPham();
        sp2.nhap();
        sp2.xuat();
        SanPham sp3 = new SanPham("sản phẩm 3",200.5);
    }
}