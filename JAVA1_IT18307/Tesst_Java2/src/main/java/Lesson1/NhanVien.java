package Lesson1;

import java.io.Serializable;

public class NhanVien implements Serializable {

    private String maNV;
    private String tenNV;
    private String gioiTinh;
    private Integer thamNien;

    public NhanVien() {
    }

    public NhanVien(String maNV, String tenNV, String gioiTinh, Integer thamNien) {
        this.maNV = maNV;
        this.tenNV = tenNV;
        this.gioiTinh = gioiTinh;
        this.thamNien = thamNien;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getTenNV() {
        return tenNV;
    }

    public void setTenNV(String tenNV) {
        this.tenNV = tenNV;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public Integer getThamNien() {
        return thamNien;
    }

    public void setThamNien(Integer thamNien) {
        this.thamNien = thamNien;
    }

    private int Thuong() {
        if (this.thamNien >= 15) {
            return 50000;
        }
        return 30000;
    }

    public Object[] toRowTable() {
        return new Object[]{
            maNV, tenNV, gioiTinh, thamNien, Thuong()
        };

    }

}
