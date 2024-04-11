/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MODE;

/**
 *
 * @author Manhdepzai
 */
public class XeMay {

    String ma;
    String ten;
    int trangthai;
    double gianhap;
    double giaban;
    int soluong;

    public XeMay() {
    }

    public XeMay(String ma, String ten, int trangthai, double gianhap, double giaban, int soluong) {
        this.ma = ma;
        this.ten = ten;
        this.trangthai = trangthai;
        this.gianhap = gianhap;
        this.giaban = giaban;
        this.soluong = soluong;
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

    public int getTrangthai() {
        return trangthai;
    }

    public void setTrangthai(int trangthai) {
        this.trangthai = trangthai;
    }

    public double getGianhap() {
        return gianhap;
    }

    public void setGianhap(double gianhap) {
        this.gianhap = gianhap;
    }

    public double getGiaban() {
        return giaban;
    }

    public void setGiaban(double giaban) {
        this.giaban = giaban;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public Object[] toDataRow() {
        return new Object[]{
            ma, ten, gianhap, giaban, trangthai, soluong
        };
    }

}
