package entity;

public class NhanVien {
    private  String maNhanVien, hoTen;
    private  double luong;

    public NhanVien() {
    }
    public NhanVien(String maNhanVien,String hoTen, double luong) {
        this.maNhanVien = maNhanVien;
        this.hoTen = hoTen;
        this.luong = luong;
    }

    public String getMaNhanVien() {
        return maNhanVien;
    }

    public void setMaNhanVien(String maNhanVien) {
        this.maNhanVien = maNhanVien;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public double getLuong() {
        return luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }
    public double getThuNhap(){
        return luong;
    }
    public double getThueTN(){
        if(luong < 9){
            return 0;
        } else if (luong >= 9 && luong <= 15) {
            return 10;
        }else {
            return 12;
        }
    }

    @Override
    public String toString() {
        return "NhanVien{" +
                "maNhanVien='" + maNhanVien + '\'' +
                ", hoTen='" + hoTen + '\'' +
                ", luong=" + luong +
                ' ';
    }
}
