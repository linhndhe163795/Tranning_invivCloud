package entity;

public class SinhVienIT extends SinhVienPoly {
    private double diemJava;
    private double diemC;
    private double diemSQL;

    public SinhVienIT(String hoTen, String nganh, double diemJava, double diemC, double diemSQL) {
        super(hoTen, nganh);
        this.diemJava = diemJava;
        this.diemC = diemC;
        this.diemSQL = diemSQL;
    }

    @Override
    public double getDiem() {
        return (diemJava + diemC + diemSQL) / 3;
    }
}
