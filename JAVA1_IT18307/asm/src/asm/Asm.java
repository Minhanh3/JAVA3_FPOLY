/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package asm;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Asm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int chon;
        //tao arraylist cac nhan vien
        ArrayList <NhanVien> nhanVien = new ArrayList<NhanVien>();
        ArrayList <TruongPhong> truongPhong = new ArrayList<TruongPhong>();
        ArrayList <TiepThi> tiepThi = new ArrayList<TiepThi>();
        //cac doi tuong
        NhanVien nv = new NhanVien();
        TruongPhong tp = new TruongPhong();
        TiepThi tt = new TiepThi();
        do {
            System.out.print("--------------------------MENU-----------------------\n"
                    + "1. nhap danh sach nhan vien tu ban phim.\n"
                    + "2. xuat danh sach nhan vien ra man hinh.\n"
                    + "3. tim va hien thi nhan vien theo ma nhap tu ban phim.\n"
                    + "4. xoa nhan vien theo ma tu ban phim.\n"
                    + "5. cap nhat nhan vien theo ma nhap tu ban phim\n"
                    + "6. tim cac nhan vien theo khoang luong.\n"
                    + "7. sap xep nhan vien theo ho va ten.\n"
                    + "8. sap xep nhan vien theo thu nhap.\n"
                    + "9. xuat 5 nhan vien thu nhap cao nhat.\n"
                    + "0. thoat\n"
                    + "----------------------------------------------------\nchon(1-9): \n");
            chon = sc.nextInt(); sc.nextLine();
            switch (chon) {
                case 1:
                    String tiepTuc;
                    do{
                    System.out.println("1. Hanh Chinh\n"
                            + "2. Truong Phong\n"
                            + "3. Tiep Thi\n");
                    int chonNv = sc.nextInt(); sc.nextLine();
                    
                    switch (chonNv) {
                        case 1:
                            nv.nhapHoi(nhanVien);
                            break;
                        case 2:
                            tp.nhapHoiTP(truongPhong);
                            break;
                        case 3:
                            tt.nhapHoiTT(tiepThi);
                            break;
                        default:
                            System.out.println("khong co nhan vien nay");
                    }
                        System.out.println("nhap nhan vien khac:(y/n): ");
                        tiepTuc = sc.nextLine();
                    }while(tiepTuc.equalsIgnoreCase("y"));
                    break;
                case 2:
                    nv.xuatMang(nhanVien, tiepThi, truongPhong); 
                    break;
                case 3:                    
                            nv.timTheoMa(nhanVien, tiepThi, truongPhong);
                    break;
                case 4:           
                            nv.xoaTheoMa(nhanVien, tiepThi, truongPhong);                          
                    break;
                case 5:
                    nv.timKiemVaSua(nhanVien, truongPhong, tiepThi);
                    break;
                case 6:
                    nv.timTheoKhoangLuong(nhanVien, truongPhong, tiepThi);
                    break;
                case 7:
                    nv.sapXepTheoHoTen(nhanVien, truongPhong, tiepThi);
                    break;
                case 8:
                    nv.sapXepTheoThuNhap(nhanVien, truongPhong, tiepThi);
                    break;
                case 9:
                    nv.top5ThuNhap(nhanVien, truongPhong, tiepThi);
                    break;
                case 0:
                    break;
            }
        } while (chon != 0);
    }

}
