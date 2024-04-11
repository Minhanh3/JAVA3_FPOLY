/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Manhdepzai
 */
public class nhanvien {
    int manv;
    String hoten,matkhau,vaitro;

    public nhanvien() {
    }

    public nhanvien(int manv, String hoten, String matkhau, String vaitro) {
        this.manv = manv;
        this.matkhau = matkhau;
        this.hoten = hoten;
        this.vaitro = vaitro;
    }

    public int getManv() {
        return manv;
    }

    public void setManv(int manv) {
        this.manv = manv;
    }

    public String getMatkhau() {
        return matkhau;
    }

    public void setMatkhau(String matkhau) {
        this.matkhau = matkhau;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getVaitro() {
        return vaitro;
    }

    public void setVaitro(String vaitro) {
        this.vaitro = vaitro;
    }
    
    public Object[] todataRow(){
        return new Object[]{
            manv,hoten,matkhau,vaitro
        };
    } 
}
