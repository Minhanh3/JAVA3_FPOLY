/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vacxin;

import java.util.Scanner;

/**
 *
 * @author Manhdepzai
 */
public class Vaccine {

    private String MaVC, tenVC, NgayHetHan;
    private Float ThoiGianTacDung;

    public Vaccine() {
    }

    public Vaccine(String MaVC, String tenVC, String NgayHetHan, Float ThoiGianTacDung) {
        this.MaVC = MaVC;
        this.tenVC = tenVC;
        this.NgayHetHan = NgayHetHan;
        this.ThoiGianTacDung = ThoiGianTacDung;
    }

    Vaccine(String value, String value0, String value1, float parseFloat, String value2) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getMaVC() {
        return MaVC;
    }

    public void setMaVC(String MaVC) {
        this.MaVC = MaVC;
    }

    public String getTenVC() {
        return tenVC;
    }

    public void setTenVC(String tenVC) {
        this.tenVC = tenVC;
    }

    public String getNgayHetHan() {
        return NgayHetHan;
    }

    public void setNgayHetHan(String NgayHetHan) {
        this.NgayHetHan = NgayHetHan;
    }

    public Float getThoiGianTacDung() {
        return ThoiGianTacDung;
    }

    public void setThoiGianTacDung(Float ThoiGianTacDung) {
        this.ThoiGianTacDung = ThoiGianTacDung;
    }

    public void inThongTin() {
        System.out.println("Ma vaccine: " + getMaVC());
        System.out.println("Ten vaccine: " + getTenVC());
        System.out.println("Thoi gian tac dung: " + getThoiGianTacDung());
        System.out.println("Ngay het han:" + getNgayHetHan());
        System.out.println("   " );

    }
}
