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
public class NhanVienTiepThi extends NhanVien {

    private double doanhso,hoaHong;

    public NhanVienTiepThi() {
    }

    public NhanVienTiepThi(double doanhso, double hoaHong, String manv, String tennv, double luongCB) {
        super(manv, tennv, luongCB);
        this.doanhso = doanhso;
        this.hoaHong = hoaHong;
    }

    public double getdoanhso() {
        return doanhso;
    }

    public void setdoanhso(double doanhso) {
        this.doanhso = doanhso;
    }

    public double getHoaHong() {
        return hoaHong;
    }

    public void setHoaHong(double hoaHong) {
        this.hoaHong = hoaHong;
    }

    @Override
    public void NhapTT() {
        super.NhapTT();
        Scanner s = new Scanner(System.in);
        System.out.println("Nhap luong doanh so:");
        doanhso = s.nextDouble();
        System.out.println("Nhap hoa hong: ");
        hoaHong = s.nextDouble();
    }

    @Override
    public void XuatTT() {
        super.XuatTT();
        System.out.println(" - Luongdoanhso: " + doanhso + " - HoaHong " + hoaHong);
    }

    @Override
    public double getThuNhap() {
        return super.getLuongCB() + doanhso + hoaHong;
    }

}
