/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai4;

/**
 *
 * @author Manhdepzai
 */
public class SanPham {

    private String ma;
    private String ten;
    private String dvt;
    private int gia;
    private String cungcap;

    public SanPham() {
    }

    public SanPham(String ma, String ten, String dvt, int gia, String cungcap) {
        this.ma = ma;
        this.ten = ten;
        this.dvt = dvt;
        this.gia = gia;
        this.cungcap = cungcap;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getDvt() {
        return dvt;
    }

    public void setDvt(String dvt) {
        this.dvt = dvt;
    }

    public int getGia() {
        return gia;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }

    public String getCungcap() {
        return cungcap;
    }

    public void setCungcap(String cungcap) {
        this.cungcap = cungcap;
    }

}
