/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab6.bai2;

/**
 *
 * @author Manhdepzai
 */
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<SanPham> danhSachSanPham = new ArrayList<>();
        
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            SanPham sanPham = new SanPham();
            System.out.println("Nhap thong tin san pham thu " + (i + 1) + ":");
            sanPham.nhap();
            danhSachSanPham.add(sanPham);
        }

        System.out.println("Cac san pham co hang la Nokia:");
        for (SanPham sanPham : danhSachSanPham) {
            if (sanPham.getHang().equals("Nokia")) {
                sanPham.xuat();
            }
        }
    }
}
