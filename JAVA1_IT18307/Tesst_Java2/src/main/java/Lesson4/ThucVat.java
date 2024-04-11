/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lesson4;

import java.io.Serializable;

/**
 *
 * @author Manhdepzai
 */
public class ThucVat implements Serializable{

    private String maTV;
    private String ten;
    private int tuoi;
    private String loaiTV;

    public ThucVat() {
    }

    public ThucVat(String maTV, String ten, int tuoi, String loaiTV) {
        this.maTV = maTV;
        this.ten = ten;
        this.tuoi = tuoi;
        this.loaiTV = loaiTV;
    }

    public String getMaTV() {
        return maTV;
    }

    public void setMaTV(String maTV) {
        this.maTV = maTV;
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

    public String getLoaiTV() {
        return loaiTV;
    }

    public void setLoaiTV(String loaiTV) {
        this.loaiTV = loaiTV;
    }

    public Object[] toRowTable() {
        return new Object[]{
            maTV, ten, tuoi, loaiTV
        };
    }
}
