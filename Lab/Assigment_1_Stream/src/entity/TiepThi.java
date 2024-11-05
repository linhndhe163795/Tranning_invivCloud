package entity;

public class TiepThi extends NhanVien {
    private double doanhSo, hoaHong;

    public TiepThi(String maNhanVien, String hoTen, double luong, double doanhSo, double hoaHong) {
        super(maNhanVien, hoTen, luong);
        this.doanhSo = doanhSo;
        this.hoaHong = hoaHong;
    }

    public double getHoaHong() {
        return hoaHong;
    }

    public void setHoaHong(double hoaHong) {
        this.hoaHong = hoaHong;
    }

    public double getDoanhSo() {
        return doanhSo;
    }

    public void setDoanhSo(double doanhSo) {
        this.doanhSo = doanhSo;
    }
    @Override
    public double getThuNhap(){
        return super.getThuNhap() + doanhSo  + hoaHong - (super.getThuNhap() + doanhSo  + hoaHong) * super.getThueTN() / 100 ;
    }

    @Override
    public String toString() {
        return super.toString() +
                "TiepThi " +
                "doanhSo=" + doanhSo +
                ", hoaHong=" + hoaHong +
                ", thuNhap=" + getThuNhap() +
                '}';
    }
}
