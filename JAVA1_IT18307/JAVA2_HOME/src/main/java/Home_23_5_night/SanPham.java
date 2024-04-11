/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Home_23_5_night;

/**
 *
 * @author Manhdepzai
 */
public class SanPham {
    private String ten;
    private String gia;
    private int soluong;
    private int tinhtrang;
    private String danhmuc;

    public SanPham() {
    }

    public SanPham(String ten, String gia, int soluong, int tinhtrang, String danhmuc) {
        this.ten = ten;
        this.gia = gia;
        this.soluong = soluong;
        this.tinhtrang = tinhtrang;
        this.danhmuc = danhmuc;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getGia() {
        return gia;
    }

    public void setGia(String gia) {
        this.gia = gia;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public int getTinhtrang() {
        return tinhtrang;
    }

    public void setTinhtrang(int tinhtrang) {
        this.tinhtrang = tinhtrang;
    }

    public String getDanhmuc() {
        return danhmuc;
    }

    public void setDanhmuc(String danhmuc) {
        this.danhmuc = danhmuc;
    }
    
}
