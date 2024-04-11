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
public class TruongPhong extends NhanVien {

    private double luongTN;

    public TruongPhong() {
    }

    public TruongPhong(String manv, String tennv, double luongCB,double luongTN) {
        super(manv, tennv, luongCB);
        this.luongTN = luongTN;
    }

    public double getluongTN() {
        return luongTN;
    }

    public void setluongTN(double luongTN) {
        this.luongTN = luongTN;
    }

    @Override
    public void NhapTT() {
        super.NhapTT(); 
        Scanner s = new Scanner(System.in);
        System.out.println("Nhap luong trach nhiem: ");
        this.luongTN = s.nextDouble();
    }

    @Override
    public void XuatTT() {
        super.XuatTT();
        System.out.println(" - luong TN: " + luongTN);
    }

    @Override
    public double getThuNhap() {
        return super.getLuongCB() + luongTN;
    }

}
