package Lesson3;

import java.io.Serializable;

public class SanPham implements Serializable {

    private String ten;
    private String ma;
    private double dongia;
    private String danhmuc;

    public SanPham() {
    }

    public SanPham(String ten, String ma, double dongia, String danhmuc) {
        this.ten = ten;
        this.ma = ma;
        this.dongia = dongia;
        this.danhmuc = danhmuc;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
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

    public Object[] toRowTable() {
        return new Object[]{
            ma,ten,dongia,danhmuc
        };
    }

}
