/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Manhdepzai
 */
public class KhoaHoc {
    int makh;
    float hocphi;
    int thoiluong;
    String ghichu;

    public KhoaHoc() {
    }

    public KhoaHoc(int makh, float hocphi, int thoiluong, String ghichu) {
        this.makh = makh;
        this.hocphi = hocphi;
        this.thoiluong = thoiluong;
        this.ghichu = ghichu;
    }

    public int getMakh() {
        return makh;
    }

    public void setMakh(int makh) {
        this.makh = makh;
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

    public String getGhichu() {
        return ghichu;
    }

    public void setGhichu(String ghichu) {
        this.ghichu = ghichu;
    }

    

public Object[] todataRow(){
    return new Object[]{
      makh,hocphi,thoiluong,ghichu  
    };
}
}
