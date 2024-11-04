import java.util.Scanner;

public class SanPham {
    private String tenSp;
    private double donGia;
    private double giamGia;

    public SanPham(String tenSp, double donGia, double giamGia) {
        this.tenSp = tenSp;
        this.donGia = donGia;
        this.giamGia = giamGia;
    }

    public SanPham(String tenSp, double donGia) {
        this.tenSp = tenSp;
        this.donGia = donGia;
    }

    public SanPham() {
    }

    public String getTenSp() {
        return tenSp;
    }

    public void setTenSp(String tenSp) {
        this.tenSp = tenSp;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public double getGiamGia() {
        return giamGia;
    }

    public void setGiamGia(double giamGia) {
        this.giamGia = giamGia;
    }
    public double getThueNhapKhau(){
        return donGia * 10 / 100;
    }
    public void xuat(){
        System.out.println("Tên sản phẩm: " + tenSp);
        System.out.println("Giá sản phẩm: " + donGia);
        System.out.println("Giảm giá: " + giamGia);
        System.out.println("Thuế nhap khẩu: " + getThueNhapKhau());
    }
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        Validation validation = new Validation();
        System.out.println("Nhập tên sản phẩm");
        tenSp = validation.checkInputIsString();
        System.out.println("Nhập đơn giá");
        donGia = validation.checkInputIsDouble();
        System.out.println("Nhập giảm giá");
        giamGia = validation.checkInputIsDouble();
    }
}
