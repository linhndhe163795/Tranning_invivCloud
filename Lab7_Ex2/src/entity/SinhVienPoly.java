package entity;

public abstract   class SinhVienPoly {
    protected String hoTen;
    protected String nganh;

    public SinhVienPoly(String hoTen, String nganh) {
        this.hoTen = hoTen;
        this.nganh = nganh;
    }
    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getNganh() {
        return nganh;
    }

    public void setNganh(String nganh) {
        this.nganh = nganh;
    }
    public abstract double getDiem();
    public String getHocLuc(){
        if(this.getDiem() < 5){
            return "Yếu";
        } else if (this.getDiem() < 6.5 && this.getDiem() > 5){
            return "Trung bình";
        } else if (this.getDiem() < 9 && this.getDiem() >= 6.5) {
            return "Giỏi";
        }else{
            return "Xuất sắc";
        }
    }
    public void xuat() {
        System.out.println("Họ tên: " + hoTen);
        System.out.println("Ngành: " + nganh);
        System.out.println("Điểm: " + getDiem());
        System.out.println("Học lực: " + getHocLuc());
    }
}
