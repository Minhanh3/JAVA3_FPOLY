/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai6;

import java.util.function.ObjDoubleConsumer;

/**
 *
 * @author Manhdepzai
 */
public class SinhVien {

    private int id;
    private String masv;
    private String ten;
    private int tuoi;
    private int kyhoc;
    private String nganhhoc;
    private float diemtb;
    private boolean gioitinh;

    public SinhVien() {
    }

    public SinhVien(int id, String masv, String ten, int tuoi, int kyhoc, String nganhhoc, float diemtb, boolean gioitinh) {
        this.id = id;
        this.masv = masv;
        this.ten = ten;
        this.tuoi = tuoi;
        this.kyhoc = kyhoc;
        this.nganhhoc = nganhhoc;
        this.diemtb = diemtb;
        this.gioitinh = gioitinh;
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

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public int getKyhoc() {
        return kyhoc;
    }

    public void setKyhoc(int kyhoc) {
        this.kyhoc = kyhoc;
    }

    public String getNganhhoc() {
        return nganhhoc;
    }

    public void setNganhhoc(String nganhhoc) {
        this.nganhhoc = nganhhoc;
    }

    public float getDiemtb() {
        return diemtb;
    }

    public void setDiemtb(float diemtb) {
        this.diemtb = diemtb;
    }

    public boolean isGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(boolean gioitinh) {
        this.gioitinh = gioitinh;
    }

    public Object[] toDataRow() {
        return new Object[]{id, masv, ten, tuoi, kyhoc, nganhhoc, diemtb, gioitinh};
    }

}
