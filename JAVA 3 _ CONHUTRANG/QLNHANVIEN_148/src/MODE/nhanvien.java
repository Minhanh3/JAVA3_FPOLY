/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MODE;

/**
 *
 * @author Manhdepzai
 */
public class nhanvien {
//    Ma,Ten,Ho,GioiTinh,MatKhau,TrangThai

    String ma, ten, ho, gioitinh, matkhau;
    int trangthai;

    public nhanvien() {
    }

    public nhanvien(String ma, String ten, String ho, String gioitinh, String matkhau, int trangthai) {
        this.ma = ma;
        this.ten = ten;
        this.ho = ho;
        this.gioitinh = gioitinh;
        this.matkhau = matkhau;
        this.trangthai = trangthai;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getHo() {
        return ho;
    }

    public void setHo(String ho) {
        this.ho = ho;
    }

    public String getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }

    public String getMatkhau() {
        return matkhau;
    }

    public void setMatkhau(String matkhau) {
        this.matkhau = matkhau;
    }

    public int getTrangthai() {
        return trangthai;
    }

    public void setTrangthai(int trangthai) {
        this.trangthai = trangthai;
    }

    public Object[] todataRow() {
        return new Object[]{
            ma,ten,ho,gioitinh,matkhau,trangthai
        };
    }

}
