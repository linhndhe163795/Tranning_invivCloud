package manage;

import entity.SinhVien;
import validation.Validation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class QuanLySinhVien {

    ArrayList<SinhVien> listSinhVien = new ArrayList<>();
    Validation validation = new Validation();
    Scanner sc = new Scanner(System.in);

    public void nhapDanhsachSinhVien() {
        while (true) {
            System.out.println("Nhập tên sinh vien: ");
            String tenSinhVien = validation.checkInputIsString();
            System.out.println("Nhập tên ngành học: ");
            String tenNganh = validation.checkInputIsString();
            System.out.println("Nhập điểm A: ");
            double diemA = validation.checkInputIsDouble();
            System.out.println("Nhập điểm B: ");
            double diemB = validation.checkInputIsDouble();
            System.out.println("Nhập điểm C: ");
            double diemC = validation.checkInputIsDouble();
            System.out.println("Nhập điểm D: ");
            double diemD = validation.checkInputIsDouble();
            listSinhVien.add(new SinhVien(tenSinhVien,tenNganh,diemA,diemB,diemC,diemD));
            System.out.println("Bạn có muốn tiếp tục (Y/N) : ");
            boolean option = validation.checkInputIsYesOrNo();
            if (!option) {
                break;
            }
        }
    }
    public void xuat(){
        for (SinhVien sv : listSinhVien) {
            System.out.println(sv.toString());
        }
    }
    public void sapXepSinhVienHocLuc(){
        ArrayList<SinhVien> listSinhVienHLG = new ArrayList<>();
       for (SinhVien sv : listSinhVien) {

           if(sv.getHocLuc().equals("Giỏi")){
               listSinhVienHLG.add(sv);
           }
       }
       for (SinhVien svg : listSinhVienHLG) {
           System.out.println(svg.toString());
       }
    }
    public void sapXepSinhVienTheoDiem(){
        Collections.sort(listSinhVien, (o1, o2) -> {
            return (int) (o1.getDiem() - o2.getDiem());
        });
        for (SinhVien sv : listSinhVien) {
            System.out.println(sv.toString());
        }
    }
}
