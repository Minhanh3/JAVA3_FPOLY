/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mode;

/**
 *
 * @author Manhdepzai
 */
public class XeMay {

    String makhungxe;
    String ten;
    int sophankhoi;
    String mauxe;
    float giaban;

    public XeMay() {
    }

    public XeMay(String makhungxe, String ten, int sophankhoi, String mauxe, float giaban) {
        this.makhungxe = makhungxe;
        this.ten = ten;
        this.sophankhoi = sophankhoi;
        this.mauxe = mauxe;
        this.giaban = giaban;
    }

    public String getMakhungxe() {
        return makhungxe;
    }

    public void setMakhungxe(String makhungxe) {
        this.makhungxe = makhungxe;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getSophankhoi() {
        return sophankhoi;
    }

    public void setSophankhoi(int sophankhoi) {
        this.sophankhoi = sophankhoi;
    }

    public String getMauxe() {
        return mauxe;
    }

    public void setMauxe(String mauxe) {
        this.mauxe = mauxe;
    }

    public float getGiaban() {
        return giaban;
    }

    public void setGiaban(float giaban) {
        this.giaban = giaban;
    }

    public Object[] todata() {
        return new Object[]{
            makhungxe, ten, sophankhoi, mauxe, giaban
        };
    }
}
