/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ASM_PH31746_NguyenDucManh;

import java.util.Scanner;

/**
 *
 * @author Manhdepzai
 */
public class asm {

    public static void main(String[] args) {
        int chon = 0;
        ThucHienChucNang chucNang = new ThucHienChucNang();

        // TODO code application logic here
        do {
            System.out.println("***************************************************************");
            System.out.println("***1. Nhap danh sach nhan vien tu ban phim.                 ***");
            System.out.println("***2. Xuat danh sach nhan vien ra man hinh.                 ***");
            System.out.println("***3. Tim va hien thi nhan vien theo ma nhap tu ban phim.   ***");
            System.out.println("***4. Xoa nhan vien theo ma nhap tu ban phim.               ***");
            System.out.println("***5. Cap nhat thong tin nhan vien theo ma nhap tu ban phim.***");
            System.out.println("***6. Tim cac nhan vien theo khoang luong nhap tu ban phim. ***");
            System.out.println("***7. Sap xep nhan vien theo ho va ten.                     ***");
            System.out.println("***8. Sap xep nhan vien theo thu nhap.                      ***");
            System.out.println("***9. Xuat 5 nhan vien co thu nhap cao nhat.                ***");
            System.out.println("***0. Thoat chuong trinh                                    ***");
            System.out.println("***************************************************************");
            Scanner s = new Scanner(System.in);
            System.out.print("Xin Moi Chon.: ");
            chon = s.nextInt();
            switch (chon) {
                case 0:
                    System.out.println("Xin chao va hen gap lai <3\n\n\n");
                    System.exit(0);
                    break;
                case 1:
                    chucNang.NhapDanhSach();
                    break;
                case 2:
                    chucNang.XuatDanhSach();
                    break;
                case 3:
                    chucNang.TimNhanVien();
                    break;
                case 4:
                    chucNang.XoaNhanVien();
                    break;
                case 5:
                    chucNang.CapNhapNhanVien();
                    break;
                case 6:
                    chucNang.TimNhanVienTheoKhoangLuong();
                    break;
                case 7:
                    chucNang.SapXepTheoten();
                    break;
                case 8:
                    chucNang.SapXepTheoThuNhap();
                    break;
                case 9:
                    chucNang.Top5();
                    break;
                default:
                    System.out.println("Nhap sai cu phap\n\n\n");
//                    System.exit(0);
            }
        } while (chon != 0);
        System.out.println("Xin chao va khong gap lai <3\n\n\n");
    }
}
