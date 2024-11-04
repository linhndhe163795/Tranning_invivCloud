public class Vuong extends ChuNhat {

    public Vuong(double canh) {
        super(canh,canh);
    }
    public void xuat(){
        System.out.println("cạnh: " + super.dai);
        System.out.println("chu vi: " + super.getChuVi());
        System.out.println("diện tích: " + super.getDienTich());
    }


}
