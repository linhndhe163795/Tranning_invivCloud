package entity;

public class TruongPhong extends NhanVien {
    private double trachNhiem;

    public TruongPhong(String maNhanVien, String hoTen, double luong, double trachNhiem) {
        super(maNhanVien, hoTen, luong);
        this.trachNhiem = trachNhiem;
    }


    public double getTrachNhiem() {
        return trachNhiem;
    }

    public void setTrachNhiem(double trachNhiem) {
        this.trachNhiem = trachNhiem;
    }
    @Override
    public double getThuNhap(){
        double ThuNhap = super.getThuNhap() + trachNhiem - ((super.getThuNhap() + trachNhiem) * super.getThuNhap() / 100);
        return ThuNhap ;
    }

    @Override
    public String toString() {
        return super.toString() +
                "TruongPhong " +
                "trachNhiem=" + trachNhiem +
                ", ThuNhap=" + getThuNhap() +
                '}';
    }
}
