package manage;

import entity.SanPham;
import validation.Validation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class QuanLySanPham {
    ArrayList<SanPham> listSanPham = new ArrayList();
    Validation validation = new Validation();
    Scanner sc = new Scanner(System.in);

    public void nhapDanhsachSanPham() {
        while (true) {
            System.out.println("Nhập tên sản phẩm: ");
            String tenSanPham = validation.checkInputIsString();
            System.out.println("Nhập giá sản phẩm: ");
            double giaSanPham = validation.checkInputIsDouble();
            System.out.println("Bạn có muốn tiếp tục (Y/N) : ");
            listSanPham.add(new SanPham(tenSanPham, giaSanPham));
            boolean option = validation.checkInputIsYesOrNo();
            if (!option) {
                break;
            }
        }
    }

    public void sapXepSanPhamTheoGia() {
        Comparator<SanPham> comparator = new Comparator<SanPham>() {
            @Override
            public int compare(SanPham o1, SanPham o2) {
                return (int) (o2.getGia_san_pham() - o1.getGia_san_pham());
            }
        };
        Collections.sort(listSanPham, comparator);
        for (SanPham sanPham : listSanPham) {
            System.out.println(sanPham.toString());
        }
    }

    public boolean checkSanPhamTonTai(String tenSanPham) {
        for (SanPham sanPham : listSanPham) {
            if (sanPham.getTen_san_pham().equals(tenSanPham)) {
                return true;
            }
        }
        return false;
    }

    public void xoaSanPham() {
        String tenSanPham = validation.checkInputIsString();
        for (int i = 0; i < listSanPham.size(); i++) {
            boolean checkSanPhamTonTai = checkSanPhamTonTai(tenSanPham);
            if (checkSanPhamTonTai) {
                if (listSanPham.get(i).getTen_san_pham().equals(tenSanPham)) {
                    listSanPham.remove(i);
                    System.out.println("Xóa thành công sản phẩm " + tenSanPham);
                }
            } else {
                System.out.println("Không tìm thấy sản phẩm");
            }
        }
        this.sapXepSanPhamTheoGia();
    }
    public double tinhTrungBinhGiaSanPham() {
        double giaSanPham = 0;
        for (SanPham sanPham : listSanPham) {
            giaSanPham += sanPham.getGia_san_pham();
        }
        return giaSanPham / listSanPham.size();
    }
}
