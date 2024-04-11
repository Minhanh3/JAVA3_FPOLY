/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MODE;

/**
 *
 * @author Manhdepzai
 */
public class sach {

    String ma;
    String ten;
    String ngaysb;
    int sotrang;
    int gia;
    int trangthai;

    public sach() {
    }

    public sach(String ma, String ten, String ngaysb, int sotrang, int gia, int trangthai) {
        this.ma = ma;
        this.ten = ten;
        this.ngaysb = ngaysb;
        this.sotrang = sotrang;
        this.gia = gia;
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

    public String getNgaysb() {
        return ngaysb;
    }

    public void setNgaysb(String ngaysb) {
        this.ngaysb = ngaysb;
    }

    public int getSotrang() {
        return sotrang;
    }

    public void setSotrang(int sotrang) {
        this.sotrang = sotrang;
    }

    public int getGia() {
        return gia;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }

    public int getTrangthai() {
        return trangthai;
    }

    public void setTrangthai(int trangthai) {
        this.trangthai = trangthai;
    }

    public Object[] todatarow() {
        return new Object[]{
            ma, ten, ngaysb, sotrang, gia, trangthai};
    }
}
