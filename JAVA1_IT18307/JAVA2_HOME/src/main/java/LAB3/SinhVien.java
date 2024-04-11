/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB3;

/**
 *
 * @author hnc0801
 */
public class SinhVien {
    private String hoTen;
    private String diem;
    private String nganh;
    private String hocLuc;
    private String thuong;
    
    @Override
    public String toString(){
        return hoTen + "|" + diem + "|" +
            nganh + "|" + hocLuc + "|" +thuong;
    }

    public SinhVien(String hoTen, String diem, String nganh, String hocLuc, String thuong) {
        this.hoTen = hoTen;
        this.diem = diem;
        this.nganh = nganh;
        this.hocLuc = hocLuc;
        this.thuong = thuong;
    }

    public SinhVien() {
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getDiem() {
        return diem;
    }

    public void setDiem(String diem) {
        this.diem = diem;
    }

    public String getNganh() {
        return nganh;
    }

    public void setNganh(String nganh) {
        this.nganh = nganh;
    }

    public String getHocLuc() {
        return hocLuc;
    }

    public void setHocLuc(String hocLuc) {
        this.hocLuc = hocLuc;
    }

    public String getThuong() {
        return thuong;
    }

    public void setThuong(String thuong) {
        this.thuong = thuong;
    }
    
    
}
