package manage;

import entity.NhanVien;
import entity.TiepThi;
import entity.TruongPhong;
import validation.Validation;

import java.util.*;

public class QuanLyNhanSu {
    Validation validation = new Validation();
    HashMap<String,NhanVien> hashMapNv = new HashMap<>();
    NhanVien nv1 = new TruongPhong("1","Linh",30,50);
    NhanVien nv2 = new TruongPhong("2","Duc",20,40);
    NhanVien nv3 = new TruongPhong("3","Nguyen",10,44);
    NhanVien nv4 = new TiepThi("4","Hai",15,28,30);
    NhanVien nv5 = new TiepThi("5","Yen",35,22,35);
    NhanVien nv6 = new TiepThi("6","Duong",45,12,36);
    public void taoData(){
        hashMapNv.put(nv1.getMaNhanVien(),nv1);
        hashMapNv.put(nv2.getMaNhanVien(),nv2);
        hashMapNv.put(nv3.getMaNhanVien(),nv3);
        hashMapNv.put(nv4.getMaNhanVien(),nv4);
        hashMapNv.put(nv5.getMaNhanVien(),nv5);
        hashMapNv.put(nv6.getMaNhanVien(),nv6);

    }
    public void nhap(){
        while (true){
            System.out.println("------------ Quản lý nhân sự ------------");
            System.out.print("Mã nhân viên: ");
            String maNhanVien = validation.checkInputIsString();
            if(this.checkMaNhanVien(maNhanVien))
            {
                System.out.println("Mã nhân viên đã tồn tại.");
                continue;
            }
            System.out.print("Nhập họ và tên: ");
            String hoVaTen = validation.checkInputIsString();
            System.out.print("Nhập lương nhân viên");
            double luong = validation.checkInputIsDouble();
            System.out.println("--------- Loại nhân viên-------");
            System.out.print("1. Tiếp thị");
            System.out.print("2. Trưởng phòng");
            int option = validation.checkInputInRange(1,2);
            if(option == 1){
                System.out.print("Nhập lương hoa hồng: ");
                double luongHoaHong = validation.checkInputIsDouble();
                System.out.print("Lương tiếp thị: ");
                double doanhSo = validation.checkInputIsDouble();
                NhanVien tiepThi = new TiepThi(maNhanVien,hoVaTen,luong,doanhSo,luongHoaHong);
               hashMapNv.put(maNhanVien,tiepThi);
            }else{
                System.out.print("Nhập lương trách nhiệm: ");
                double trachnhiem = validation.checkInputIsDouble();

                NhanVien tp = new TruongPhong(maNhanVien,hoVaTen,luong,trachnhiem);
                hashMapNv.put(maNhanVien,tp);
            }
            System.out.print("Do you want to continue (Y/N): ");
            boolean checkCoutinue = validation.checkInputIsYesOrNo();
            if(!checkCoutinue){
                break;
            }
        }
    }
    public void xuat(){
        System.out.println("------- Danh Sách nhân viên -------");
        // sử dụng hashMap để lấy ra values
        for (NhanVien nv : hashMapNv.values()) {
            System.out.println(nv.toString());
        }
    }
    public NhanVien timNhanVienTheoMa(){
        boolean check = true;
        System.out.print("Nhập mã nhân viên: ");
        String maNhanVien = validation.checkInputIsString();
        if(checkMaNhanVien(maNhanVien)){
            for (Map.Entry<String, NhanVien> entry : hashMapNv.entrySet()) {
                if (entry.getKey().equalsIgnoreCase(maNhanVien)) {
                    return entry.getValue();
                }
            }
        }else{
            System.err.println("Không có nhân viên có mã: " + maNhanVien);
        }
        return null;
    }
    public void timNhanVienTheoMaList(){
        boolean check = true;
        System.out.println("Nhập mã nhân viên: ");
        String maNhanVien = validation.checkInputIsString();
        Collection<NhanVien> values = hashMapNv.values();
        ArrayList<NhanVien> listNhanVien = new ArrayList<>(values);
        Optional<NhanVien> findNv = listNhanVien.stream().filter(x -> x.getMaNhanVien().equalsIgnoreCase(maNhanVien)).findAny();
        if(findNv.isEmpty()){
            System.err.println("Không tìm thấy nhân viên nào có mã: "+ maNhanVien);
        }else{
            System.out.println(findNv.toString());
        }
    }
    public boolean checkMaNhanVien(String maNhanVien){
        return  hashMapNv.entrySet().stream().anyMatch(x -> x.getKey().equalsIgnoreCase(maNhanVien));

    }
    public void xoaNhanVien(){
        NhanVien nv = timNhanVienTheoMa();
        boolean found = false;

        Iterator<Map.Entry<String, NhanVien>> iterator = hashMapNv.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, NhanVien> entry = iterator.next();
            if (entry.getKey().equalsIgnoreCase(nv.getMaNhanVien())) {
                iterator.remove();
                found = true;
                System.out.println("Nhân viên có mã " + nv.getMaNhanVien() + " đã được xóa.");
                break;
            }
        }
        if (!found) {
            System.err.println("Không có nhân viên có mã: " + nv.getMaNhanVien());
        }
    }
    public void capNhapThongTinNhanVien(){
        NhanVien nv = timNhanVienTheoMa();
        boolean found = false;
        if(nv != null){
            Iterator<Map.Entry<String, NhanVien>> iterator = hashMapNv.entrySet().iterator();
            while (iterator.hasNext()) {
                Map.Entry<String, NhanVien> entry = iterator.next();
                if (entry.getKey().equalsIgnoreCase(nv.getMaNhanVien())) {
                    System.out.print("Nhập họ và tên mới: ");
                    String updateHoVaTen = validation.checkInputIsString();
                    nv.setHoTen(updateHoVaTen);
                    System.out.print("Nhập lương: ");
                    double luong = validation.checkInputIsDouble();
                    nv.setLuong(luong);

                    if(nv instanceof TiepThi){
                        System.out.print("Nhập doanh so: ");
                        double doanhSo = validation.checkInputIsDouble();
                        ((TiepThi) nv).setDoanhSo(doanhSo);
                        System.out.print("Nhập hoa hồng: ");
                        double HoaHong = validation.checkInputIsDouble();
                        ((TiepThi) nv).setHoaHong(HoaHong);
                    }
                    if(nv instanceof TruongPhong){
                        System.out.println("Nhập lương trách nhiệm: ");
                        double trachnhiem = validation.checkInputIsDouble();
                        ((TruongPhong) nv).setTrachNhiem(trachnhiem);
                    }
                    found = true;
                    System.out.println("Nhân viên có mã " + nv.getMaNhanVien() + " đã update.");
                    break;
                }
            }
        }
        if (!found) {
            System.err.println("Không có nhân viên " );
        }
    }
    public void timNhanVienTheoMucLuong(){
        System.out.print("Nhập mức lương tối thiểu: ");
        double luongToiThieu = validation.checkInputIsDouble();
        System.out.print("Nhập mức lương tối đa: ");
        double luongToiDa = validation.checkInputIsDouble();
        hashMapNv.forEach((k,v)->{
            if(v.getLuong() <= luongToiDa && v.getLuong() >= luongToiThieu){
                System.out.println(v);
            }
        });
    }
    public void sapXepTheoTen(){
        hashMapNv.entrySet()
                .stream()
                .sorted((o1, o2) -> o1.getValue().getHoTen().compareTo(o2.getValue().getHoTen()))
                .forEach(entry -> System.out.println(entry.getValue().toString()));
    }
    public void sapXepTheoThuNhap(){
        hashMapNv.entrySet()
                .stream()
                .sorted((o1, o2) -> (int) o1.getValue().getLuong() - (int) (o2.getValue().getLuong()))
                .forEach(nv -> System.out.println(nv.getValue().toString()));
    }
    public void xuat5NhanVienCoThuNhapCaoNhat(){
          hashMapNv.entrySet()
                   .stream()
                   .sorted((o1, o2) -> (Double.compare(o2.getValue().getLuong(), o1.getValue().getLuong())))
                   .limit(5)
                  .forEach(nv -> System.out.println(nv.getValue().toString()));
    }
    public void hienThiNhanVienTheoMa(){
        NhanVien nv = timNhanVienTheoMa();
        if(nv != null){
            System.out.println(nv.toString());
        }
    }
}
