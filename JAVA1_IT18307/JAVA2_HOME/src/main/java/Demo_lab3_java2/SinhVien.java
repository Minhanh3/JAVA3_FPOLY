/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Demo_lab3_java2;

/**
 *
 * @author Manhdepzai
 */
public class SinhVien {
    private String hoten;
    private double diem;
    private String nganh;
    private String hocluc;
    private String trangthai;

    public SinhVien() {
    }

    public SinhVien(String hoten, double diem, String nganh, String hocluc, String trangthai) {
        this.hoten = hoten;
        this.diem = diem;
        this.nganh = nganh;
        this.hocluc = hocluc;
        this.trangthai = trangthai;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public double getDiem() {
        return diem;
    }

    public void setDiem(double diem) {
        this.diem = diem;
    }

    public String getNganh() {
        return nganh;
    }

    public void setNganh(String nganh) {
        this.nganh = nganh;
    }

    public String getHocluc() {
        return hocluc;
    }

    public void setHocluc(String hocluc) {
        this.hocluc = hocluc;
    }

    public String getTrangthai() {
        return trangthai;
    }

    public void setTrangthai(String trangthai) {
        this.trangthai = trangthai;
    }
    
    

    
}
