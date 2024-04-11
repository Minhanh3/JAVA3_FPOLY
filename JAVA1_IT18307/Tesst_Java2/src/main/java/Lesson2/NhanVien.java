package Lesson2;

import java.io.Serializable;
import java.util.Vector;

public class NhanVien implements Serializable{

    private String ten;
    private String ma;
    private Integer luong;
    private Boolean gioitinh;
    private Integer tuoi;

    public NhanVien() {
    }

    public NhanVien(String ten, String ma, Integer luong, Boolean gioitinh, Integer tuoi) {
        this.ten = ten;
        this.ma = ma;
        this.luong = luong;
        this.gioitinh = gioitinh;
        this.tuoi = tuoi;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public Integer getLuong() {
        return luong;
    }

    public void setLuong(Integer luong) {
        this.luong = luong;
    }

    public Boolean getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(Boolean gioitinh) {
        this.gioitinh = gioitinh;
    }

    public Integer getTuoi() {
        return tuoi;
    }

    public void setTuoi(Integer tuoi) {
        this.tuoi = tuoi;
    }

    Vector<?> toRowTable() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
