/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

import model.*;

/**
 *
 * @author Manhdepzai
 */
public class SanPham {
    private String ten;
    private String masp;
    private double dongia;
    private String danhmuc;

    public SanPham() {
    }

    public SanPham(String ten, String masp, double dongia, String danhmuc) {
        this.ten = ten;
        this.masp = masp;
        this.dongia = dongia;
        this.danhmuc = danhmuc;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getMasp() {
        return masp;
    }

    public void setMasp(String masp) {
        this.masp = masp;
    }

    public double getDongia() {
        return dongia;
    }

    public void setDongia(double dongia) {
        this.dongia = dongia;
    }

    public String getDanhmuc() {
        return danhmuc;
    }

    public void setDanhmuc(String danhmuc) {
        this.danhmuc = danhmuc;
    }
    
    
}
