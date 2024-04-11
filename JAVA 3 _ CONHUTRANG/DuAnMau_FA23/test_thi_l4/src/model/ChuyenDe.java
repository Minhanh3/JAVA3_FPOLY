/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Manhdepzai
 */
public class ChuyenDe {

    int macd;
    String tencd;
    float hocphi;
    int thoiluong;
    String mota;

    public ChuyenDe() {
    }

    public ChuyenDe(int macd, String tencd, float hocphi, int thoiluong, String mota) {
        this.macd = macd;
        this.tencd = tencd;
        this.hocphi = hocphi;
        this.thoiluong = thoiluong;
        this.mota = mota;
    }

    public int getMacd() {
        return macd;
    }

    public void setMacd(int macd) {
        this.macd = macd;
    }

    public String getTencd() {
        return tencd;
    }

    public void setTencd(String tencd) {
        this.tencd = tencd;
    }

    public float getHocphi() {
        return hocphi;
    }

    public void setHocphi(float hocphi) {
        this.hocphi = hocphi;
    }

    public int getThoiluong() {
        return thoiluong;
    }

    public void setThoiluong(int thoiluong) {
        this.thoiluong = thoiluong;
    }

    public String getMota() {
        return mota;
    }

    public void setMota(String mota) {
        this.mota = mota;
    }

    public Object[] todataRow() {
        return new Object[]{
            macd, tencd, hocphi, thoiluong, mota
        };
    }
}
