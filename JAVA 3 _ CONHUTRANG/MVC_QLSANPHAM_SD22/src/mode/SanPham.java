/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mode;

/**
 *
 * @author Manhdepzai
 */
public class SanPham {

    String maSP;
    String tenSP;
    private LoaiSanPham loai;
    // LẤY DỮ LIỆU CỦA BẢNG 1 SANG BẢNG NHIỀU

    public SanPham() {
    }

    public SanPham(String maSP, String tenSP, LoaiSanPham loai) {
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.loai = loai;
    }

    public String getMaSP() {
        return maSP;
    }

    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public LoaiSanPham getLoai() {
        return loai;
    }

    public void setLoai(LoaiSanPham loai) {
        this.loai = loai;
    }

    public Object[] toDataRow() {
        return new Object[]{
            maSP, tenSP //bang co gi lay cai do
        };
    }

}
