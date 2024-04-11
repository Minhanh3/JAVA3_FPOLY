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
public abstract class NhanVien {

    private String manv, tennv;
    private double luongCB;

    public NhanVien() {
    }

    public NhanVien(String manv, String tennv, double luongCB) {
        this.manv = manv;
        this.tennv = tennv;
        this.luongCB = luongCB;
    }

    public String getManv() {
        return manv;
    }

    public void setManv(String manv) {
        this.manv = manv;
    }

    public String getTennv() {
        return tennv;
    }

    public void setTennv(String tennv) {
        this.tennv = tennv;
    }

    public double getLuongCB() {
        return luongCB;
    }

    public void setLuongCB(double luongCB) {
        this.luongCB = luongCB;
    }

    public void NhapTT() {
        Scanner s = new Scanner(System.in);
        System.out.println("Nhap ma nv:");
        manv = s.nextLine();
        System.out.println("Nhap ten nv: ");
        tennv = s.nextLine();
        System.out.println("Nhap luong: ");
        luongCB = s.nextDouble();

    }

    public void XuatTT() {
        System.out.println("\n Ma nv: " + manv + " - Ten Nv: " + tennv + " - luong CB: " + luongCB);

    }

    public abstract double getThuNhap();

    public double getTHUETN() {
        double thue = 0;
        if (getThuNhap() < 9000000) {
            thue = 0;
        } else if (getThuNhap() >= 9000000 && getThuNhap() <= 15000000) {
            thue = getThuNhap() * 0.1;
        } else if (getThuNhap() > 15000000) {
            thue = getThuNhap() * 0.12;
        }
        return thue;
    }

}
