/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab6.bai2;

/**
 *
 * @author ADMIN
 */
import java.util.Scanner;

class SanPham {
    private String ten;
    private double gia;
    private String hang;

    public SanPham() {}

    public SanPham(String ten, double gia, String hang) {
        this.ten = ten;
        this.gia = gia;
        this.hang = hang;
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ten san pham: ");
        this.ten = sc.nextLine();
        System.out.print("Nhap gia san pham: ");
        this.gia = sc.nextDouble();
        sc.nextLine();
        System.out.print("Nhap hang san pham: ");
        this.hang = sc.nextLine();
    }

    public void xuat() {
        System.out.println("Ten: " + this.ten);
        System.out.println("Gia: " + this.gia);
        System.out.println("Hang: " + this.hang);
    }

    public String getHang() {
        return this.hang;
    }
}