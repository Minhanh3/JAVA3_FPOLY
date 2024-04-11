package Manhdztesst;

import java.io.Serializable;

public class SinhVien implements Serializable{

    private String maNV, tenNV, gioiTinh;
    private int thamNien;

    public SinhVien() {
    }

    public SinhVien(String maNV, String tenNV, String gioiTinh, int thamNien) {
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

    public int getThamNien() {
        return thamNien;
    }

    public void setThamNien(int thamNien) {
        this.thamNien = thamNien;
    }

    private int Thuong() {
        if (this.thamNien > 13) {
            return 50000;
        }
        return 20000;
    }

    public Object[] toRowTable() {
        return new Object[]{
            maNV, tenNV, gioiTinh, thamNien, Thuong()
        };
    }
}
