/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package luyentapktra;

/**
 *
 * @author Manhdepzai
 */
public class SinhVien {

    private int MaSV;
    private String Ten;
    private int NamSinh;
    private double DiemCsharp;

    public SinhVien() {
    }

    public SinhVien(int MaSV, String Ten, int NamSinh, double DiemCsharp) {
        this.MaSV = MaSV;
        this.Ten = Ten;
        this.NamSinh = NamSinh;
        this.DiemCsharp = DiemCsharp;
    }

    public int getMaSV() {
        return MaSV;
    }

    public void setMaSV(int MaSV) {
        this.MaSV = MaSV;
    }

    public String getTen() {
        return Ten;
    }

    public void setTen(String Ten) {
        this.Ten = Ten;
    }

    public int getNamSinh() {
        return NamSinh;
    }

    public void setNamSinh(int NamSinh) {
        this.NamSinh = NamSinh;
    }

    public double getDiemCsharp() {
        return DiemCsharp;
    }

    public void setDiemCsharp(double DiemCsharp) {
        this.DiemCsharp = DiemCsharp;
    }

    public void inThongTin() {
        System.out.println("Ma sinh vien                : " + getMaSV());
        System.out.println("Ten Sinh vien                : " + getTen());
        System.out.println("Nam sinh                 : " + getNamSinh());
        System.out.println("Diem C Sharp sinh vien: " + getDiemCsharp());
    }
}
