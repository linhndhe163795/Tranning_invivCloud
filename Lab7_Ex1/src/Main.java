//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ChuNhat cn = new ChuNhat(5,2);
        ChuNhat hv = new Vuong(5);
        cn.getChuVi();
        cn.getDienTich();
        cn.xuat();
        hv.xuat();

    }
}