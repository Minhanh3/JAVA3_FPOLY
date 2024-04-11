/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ASM_PH31746_NguyenDucManh;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Manhdepzai
 */
public class ThucHienChucNang {

    ArrayList<NhanVien> listNV = new ArrayList<>();
    Scanner s = new Scanner(System.in);

//y1: nhap danh sach
    public void NhapDanhSach() {
        do {
            System.out.println("Moi chon: 1.NV Hanh Chinh  - 2.Truong phong - 3.NV Tiep Thi");
            int chon = s.nextInt();

            switch (chon) {
                case 1:
                    NhanVienHanhChinh nvhc = new NhanVienHanhChinh();
                    nvhc.NhapTT();
                    listNV.add(nvhc);
                    break;
                case 2:
                    TruongPhong tp = new TruongPhong();
                    tp.NhapTT();
                    listNV.add(tp);
                    break;
                case 3:
                    NhanVienTiepThi nvtt = new NhanVienTiepThi();
                    nvtt.NhapTT();
                    listNV.add(nvtt);
                    break;
            }
            if (chon == 0) {
                break;
            }
        } while (true);
    }

    //y2: xuat danh sach
    public void XuatDanhSach() {
        for (NhanVien nv : listNV) {
            if (nv instanceof NhanVienHanhChinh) {
                ((NhanVienHanhChinh) nv).XuatTT();
            } else if (nv instanceof TruongPhong) {
                ((TruongPhong) nv).XuatTT();
            } else if (nv instanceof NhanVienTiepThi) {
                ((NhanVienTiepThi) nv).XuatTT();
            }
        }
    }

    //y3 - tim nhan vien thao ma
    public void TimNhanVien() {
        s.nextLine();
        System.out.println("\n Nhap ma nv can tim:");
        String ma = s.nextLine();
        boolean flag = false;

        for (NhanVien nv : listNV) {
            if (nv.getManv().equalsIgnoreCase(ma)) {
                flag = true;

                if (nv instanceof NhanVienHanhChinh) {
                    ((NhanVienHanhChinh) nv).XuatTT();
                } else if (nv instanceof TruongPhong) {
                    ((TruongPhong) nv).XuatTT();
                } else if (nv instanceof NhanVienTiepThi) {
                    ((NhanVienTiepThi) nv).XuatTT();
                }
                break;
            }
        }
        if (flag == false) {
            System.out.println("khong tim thay nv");
        }
    }

    //y4 - xoa nhan vien
    public void XoaNhanVien() {
        s.nextLine();
        System.out.println("\n Nhap ma nv can delete:");
        String ma = s.nextLine();
        boolean flag = false;

        for (NhanVien nv : listNV) {
            if (nv.getManv().equalsIgnoreCase(ma)) {
                flag = true;
                listNV.remove(nv);
                break;
            }
        }

        if (flag == false) {
            System.out.println("khong tim thay nv");
        }
    }

    //y5 - cap nhap nahn vien
    public void CapNhapNhanVien() {

        System.out.println("\n Nhap nhan vien:");
        String ma = s.nextLine();
//        boolean flag = false;
        for (NhanVien nv : listNV) {
            if (nv.getManv().equalsIgnoreCase(ma)) {
                if (nv instanceof NhanVienHanhChinh) {
                    ((NhanVienHanhChinh) nv).NhapTT();
                } else if (nv instanceof TruongPhong) {
                    ((TruongPhong) nv).NhapTT();
                } else if (nv instanceof NhanVienTiepThi) {
                    ((NhanVienTiepThi) nv).NhapTT();
                }
//                flag = true;
//                break;
            }
        }
//        if (flag == false) {
//            System.out.println("khong tim thay nv");
//        }
    }

    //y6 - tim nhan vien theo khoang luong
    public void TimNhanVienTheoKhoangLuong() {
        double bd = 0, kt = 0;
        do {
            System.out.println("\n Nhap khoang luong bat dau:");
            bd = s.nextDouble();
            System.out.println("Nhap khoang luong ket thuc");
            kt = s.nextDouble();

            if (bd > kt) {
                System.out.println("Nhap lai:");
            } else {
                break;
            }
        } while (true);

        boolean flag = false;
        for (NhanVien nv : listNV) {
            if (nv.getThuNhap() >= bd && nv.getThuNhap() <= kt) {
                if (nv instanceof NhanVienHanhChinh) {
                    ((NhanVienHanhChinh) nv).XuatTT();
                } else if (nv instanceof TruongPhong) {
                    ((TruongPhong) nv).XuatTT();
                } else if (nv instanceof NhanVienTiepThi) {
                    ((NhanVienTiepThi) nv).XuatTT();
                }
                flag = true;
                break;
            }
        }
        if (flag == false) {
            System.out.println("khong tim thay khoang luong");
        }
    }

    //y7 
    public void SapXepTheoten() {
        Collections.sort(listNV, (nv1, nv2) -> (int) (nv1.getTennv().compareTo(nv2.getTennv())));
//        ArrayList<String> hoTenTong = new ArrayList<>();
//        for (int i = 0; i < a.size(); i++) {
//            hoTenTong.add(a.get(i).getTennv());
//        }
//        for (int i = 0; i < b.size(); i++) {
//            hoTenTong.add(b.get(i).getTennv());
//        }
//        for (int i = 0; i < c.size(); i++) {
//            hoTenTong.add(c.get(i).getTennv());
//        }
//
//        Collections.sort(hoTenTong);
//        Collections.reverse(hoTenTong);
//        System.out.println("Danh sach ho ten khi sap xep:");
//        for (String x : hoTenTong) {
//
//            for (int i = 0; i < a.size(); i++) {
//                if (a.get(i).getTennv().equalsIgnoreCase(x)) {
//                    a.get(i).XuatTT();
//                }
//            }
//            for (int i = 0; i < b.size(); i++) {
//                if (b.get(i).getTennv().equalsIgnoreCase(x)) {
//                    b.get(i).XuatTT();
//                }
//            }
//            for (int i = 0; i < c.size(); i++) {
//                if (c.get(i).getTennv().equalsIgnoreCase(x)) {
//                    c.get(i).XuatTT();
//                }
//            }
//        }

    }

    //y8
    public void SapXepTheoThuNhap() {
        Collections.sort(listNV, (nv1, nv2) -> (int) (nv1.getThuNhap() - nv2.getThuNhap()));
    }

    //y9
    public void Top5() {
        SapXepTheoThuNhap();

        for (int i = 0; i < 5; i++) {
//            listNV.get(i).Xuat();
            if (listNV.get(i) instanceof NhanVienHanhChinh) {
                ((NhanVienHanhChinh) listNV.get(i)).XuatTT();
            } else if (listNV.get(i) instanceof TruongPhong) {
                ((TruongPhong) listNV.get(i)).XuatTT();
            } else if (listNV.get(i) instanceof NhanVienTiepThi) {
                ((NhanVienTiepThi) listNV.get(i)).XuatTT();
            }
        }
        //foreach
//        int i = 1;
//        for (NhanVien nv : listNV) {
//            if (nv instanceof NhanVienHanhChinh) {
//                ((NhanVienHanhChinh) nv).XuatTT();
//            } else if (nv instanceof TruongPhong) {
//                ((TruongPhong) nv).XuatTT();
//            } else if (nv instanceof NhanVienTiepThi) {
//                ((NhanVienTiepThi) nv).XuatTT();
//            }
//            i++;
//            if(i== 5){
//                break;
//            }
//        }
    }
}
