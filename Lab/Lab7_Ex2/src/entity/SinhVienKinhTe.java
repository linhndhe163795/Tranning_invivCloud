package entity;

public class SinhVienKinhTe extends SinhVienPoly
{
    private double diemMarketing, diemSales;

    public SinhVienKinhTe(String hoTen, String nganh, double diemMarketing, double diemSales) {
        super(hoTen, nganh);
        this.diemMarketing = diemMarketing;
        this.diemSales = diemSales;
    }

    @Override
    public double getDiem() {
        return (2 * diemMarketing + diemSales) / 3;
    }
}
