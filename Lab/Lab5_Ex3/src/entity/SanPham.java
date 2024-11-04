package entity;

public class SanPham {
    private String ten_san_pham;
    private double gia_san_pham;

    public SanPham(String ten_san_pham, double gia_san_pham) {
        this.ten_san_pham = ten_san_pham;
        this.gia_san_pham = gia_san_pham;
    }
    public SanPham (){}

    public String getTen_san_pham() {
        return ten_san_pham;
    }

    public void setTen_san_pham(String ten_san_pham) {
        this.ten_san_pham = ten_san_pham;
    }

    public double getGia_san_pham() {
        return gia_san_pham;
    }

    public void setGia_san_pham(double gia_san_pham) {
        this.gia_san_pham = gia_san_pham;
    }
    @Override
    public String toString(){
        return ten_san_pham + "\t" + gia_san_pham;
    }
}
