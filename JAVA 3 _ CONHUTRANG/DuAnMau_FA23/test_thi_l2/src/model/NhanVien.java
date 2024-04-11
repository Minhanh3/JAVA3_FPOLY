/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Manhdepzai
 */
public class NhanVien {
    private int ma;
    private String hoten,matkhau,vaitro;

    public NhanVien() {
    }

    public NhanVien(int ma, String hoten, String matkhau, String vaitro) {
        this.ma = ma;
        this.hoten = hoten;
        this.matkhau = matkhau;
        this.vaitro = vaitro;
    }

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getMatkhau() {
        return matkhau;
    }

    public void setMatkhau(String matkhau) {
        this.matkhau = matkhau;
    }

    public String getVaitro() {
        return vaitro;
    }

    public void setVaitro(String vaitro) {
        this.vaitro = vaitro;
    }
 
    
    public Object[] getrow(){
        return new Object[]{
          ma,hoten,matkhau,vaitro  
        };
    }
    
}
