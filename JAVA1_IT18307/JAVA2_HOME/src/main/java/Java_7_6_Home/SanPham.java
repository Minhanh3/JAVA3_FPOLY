/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Java_7_6_Home;

/**
 *
 * @author Manhdepzai
 */
public class SanPham {
    String ten;
    double gia;
    int soluong;
    String thanhtien;

    public SanPham() {
    }

    public SanPham(String ten, double gia, int soluong, String thanhtien) {
        this.ten = ten;
        this.gia = gia;
        this.soluong = soluong;
        this.thanhtien = thanhtien;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public String getThanhtien() {
        return thanhtien;
    }

    public void setThanhtien(String thanhtien) {
        this.thanhtien = thanhtien;
    }
    
    
}
