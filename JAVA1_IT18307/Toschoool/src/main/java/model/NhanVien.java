package model;

public class NhanVien {
    private String maNV;
    private String tenNV;
    private boolean gioiTinh;
    private Integer thamNien;

    public NhanVien() {
    }

    public NhanVien(String maNV, String tenNV, boolean gioiTinh, Integer thamNien) {
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

    public boolean isGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public Integer getThamNien() {
        return thamNien;
    }

    public void setThamNien(Integer thamNien) {
        this.thamNien = thamNien;
    }
    
    public Integer tinhThuong(){
        if(this.thamNien > 12){
            return 500000;
        }
        return 200000;
    }
}
