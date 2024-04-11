/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MODE;

/**
 *
 * @author Manhdepzai
 */
public class ban {

    String ma, ten, ngaysinh, sothich;
    int gioitinh;
    int trangthai;

    public ban() {
    }

    public ban(String ma, String ten, String ngaysinh, String sothich, int gioitinh, int trangthai) {
        this.ma = ma;
        this.ten = ten;
        this.ngaysinh = ngaysinh;
        this.sothich = sothich;
        this.gioitinh = gioitinh;
        this.trangthai = trangthai;
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

    public String getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(String ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    public String getSothich() {
        return sothich;
    }

    public void setSothich(String sothich) {
        this.sothich = sothich;
    }

    public int getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(int gioitinh) {
        this.gioitinh = gioitinh;
    }

    public int getTrangthai() {
        return trangthai;
    }

    public void setTrangthai(int trangthai) {
        this.trangthai = trangthai;
    }

    public Object[] datarow() {
        return new Object[]{
            ma, ten, ngaysinh, sothich, gioitinh, trangthai
        };
    }
}
