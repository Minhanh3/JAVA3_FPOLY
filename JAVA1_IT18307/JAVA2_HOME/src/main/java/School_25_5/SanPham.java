/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package School_25_5;

/**
 *
 * @author Manhdepzai
 */
public class SanPham {
    private String name;
    private String masp;
    private String danhmuc;
    private int tinhtrang;
    private int dongia;

    public SanPham() {
    }

    public SanPham(String name, String masp, String danhmuc, int tinhtrang, int dongia) {
        this.name = name;
        this.masp = masp;
        this.danhmuc = danhmuc;
        this.tinhtrang = tinhtrang;
        this.dongia = dongia;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMasp() {
        return masp;
    }

    public void setMasp(String masp) {
        this.masp = masp;
    }

    public String getDanhmuc() {
        return danhmuc;
    }

    public void setDanhmuc(String danhmuc) {
        this.danhmuc = danhmuc;
    }

    public int getTinhtrang() {
        return tinhtrang;
    }

    public void setTinhtrang(int tinhtrang) {
        this.tinhtrang = tinhtrang;
    }

    public int getDongia() {
        return dongia;
    }

    public void setDongia(int dongia) {
        this.dongia = dongia;
    }
    
    
}
