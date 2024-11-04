package entity;

public class SinhVien extends SinhVienPoly{
    private double diemA, diemB, diemC, diemD;

    public SinhVien(String hoTen, String nganh, double diemA, double diemB, double diemC, double diemD) {
        super(hoTen, nganh);
        this.diemA = diemA;
        this.diemB = diemB;
        this.diemC = diemC;
        this.diemD = diemD;
    }

    public double getDiemA() {
        return diemA;
    }

    public void setDiemA(double diemA) {
        this.diemA = diemA;
    }

    public double getDiemB() {
        return diemB;
    }

    public void setDiemB(double diemB) {
        this.diemB = diemB;
    }

    public double getDiemC() {
        return diemC;
    }

    public void setDiemC(double diemC) {
        this.diemC = diemC;
    }

    public double getDiemD() {
        return diemD;
    }

    public void setDiemD(double diemD) {
        this.diemD = diemD;
    }

    @Override
    public double getDiem() {
        return (diemA + diemB + diemC + diemD) / 4;
    }

    @Override
    public String toString() {
        return "Ten:" + super.hoTen + " Ngành: " + super.nganh + " Điểm A= " + diemA + " Điểm B= " +diemB
                +" Điểm C= "+ diemC + " Điêm D= "+ diemD + " Học lực: " + super.getHocLuc() + " Điểm trung bình: " + getDiem();
    }
}
