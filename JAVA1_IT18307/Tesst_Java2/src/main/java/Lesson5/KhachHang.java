/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lesson5;

/**
 *
 * @author Manhdepzai
 */
public class KhachHang {

    private String maKH;
    private String tenKH;
    private int gioiTinh;
//    private String sdt;
    private String nhomKH;

    public KhachHang() {
    }

    public KhachHang(String maKH, String tenKH, int gioiTinh, String nhomKH) {
        this.maKH = maKH;
        this.tenKH = tenKH;
        this.gioiTinh = gioiTinh;
        this.nhomKH = nhomKH;
    }

    public String getMaKH() {
        return maKH;
    }

    public void setMaKH(String maKH) {
        this.maKH = maKH;
    }

    public String getTenKH() {
        return tenKH;
    }

    public void setTenKH(String tenKH) {
        this.tenKH = tenKH;
    }

    public int getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(int gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getNhomKH() {
        return nhomKH;
    }

    public void setNhomKH(String nhomKH) {
        this.nhomKH = nhomKH;
    }

    public Object[] toRowTable() {
        return new Object[]{
            maKH, tenKH, gioiTinh, nhomKH
        };
    }

}
