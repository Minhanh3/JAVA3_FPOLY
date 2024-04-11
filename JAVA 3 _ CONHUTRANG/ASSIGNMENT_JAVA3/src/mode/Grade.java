/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mode;

/**
 *
 * @author Manhdepzai
 */
public class Grade {
    int id;
    String masv;
    String hoten;
    int tienganh;
    int tinhoc;
    int gdtc;
    double diemtb;

    public Grade() {
    }

    public Grade(int id, String masv, String hoten, int tienganh, int tinhoc, int gdtc, double diemtb) {
        this.id = id;
        this.masv = masv;
        this.hoten = hoten;
        this.tienganh = tienganh;
        this.tinhoc = tinhoc;
        this.gdtc = gdtc;
        this.diemtb = diemtb;
    }

    public Grade(String masv, String hoten, int tienganh, int tinhoc, int gdtc, double diemtb) {
        this.masv = masv;
        this.hoten = hoten;
        this.tienganh = tienganh;
        this.tinhoc = tinhoc;
        this.gdtc = gdtc;
        this.diemtb = diemtb;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMasv() {
        return masv;
    }

    public void setMasv(String masv) {
        this.masv = masv;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public int getTienganh() {
        return tienganh;
    }

    public void setTienganh(int tienganh) {
        this.tienganh = tienganh;
    }

    public int getTinhoc() {
        return tinhoc;
    }

    public void setTinhoc(int tinhoc) {
        this.tinhoc = tinhoc;
    }

    public int getGdtc() {
        return gdtc;
    }

    public void setGdtc(int gdtc) {
        this.gdtc = gdtc;
    }

//
//    public double getDiemtb() {
//        return (this.tinhoc + this.tienganh + this.gdtc) / 3.0;
//    }
//
//    public void setDiemtb(double diemtb) {
//        this.diemtb = diemtb;
//    }
//    public Object[] toDataRow(){
//        return new Object[]{this.masv,this.hoten,tienganh,tinhoc,gdtc,diemtb};
//    }
}
