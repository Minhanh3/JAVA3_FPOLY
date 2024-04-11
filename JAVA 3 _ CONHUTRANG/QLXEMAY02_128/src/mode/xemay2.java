/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mode;

/**
 *
 * @author Manhdepzai
 */
public class xemay2 {

    String ma;
    String ten;
    int tthai;
    double gianhap;
    double giaban;
    int sluong;

    public xemay2() {
    }

    public xemay2(String ma, String ten, int tthai, double gianhap, double giaban, int sluong) {
        this.ma = ma;
        this.ten = ten;
        this.tthai = tthai;
        this.gianhap = gianhap;
        this.giaban = giaban;
        this.sluong = sluong;
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

    public int getTthai() {
        return tthai;
    }

    public void setTthai(int tthai) {
        this.tthai = tthai;
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

    public int getSluong() {
        return sluong;
    }

    public void setSluong(int sluong) {
        this.sluong = sluong;
    }

    public Object[] dlvaobang() {
        return new Object[]{
            ma, ten, tthai, gianhap, giaban, sluong
        };
    }
}
