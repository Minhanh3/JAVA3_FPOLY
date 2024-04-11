/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package asm;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class TruongPhong extends NhanVien{
    private double trachNhiem;
    Scanner sc = new Scanner(System.in);
    public TruongPhong(double trachNhiem, String maNV, String hoTen, double luong) {
        super(maNV, hoTen, luong);
        this.trachNhiem = trachNhiem;
    }

    public TruongPhong() {
    }

    public double getTrachNhiem() {
        return trachNhiem;
    }

    public void setTrachNhiem(double trachNhiem) {
        this.trachNhiem = trachNhiem;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public double getLuong() {
        return luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }
    
    @Override
    public double getThuNhap() {
       return this.getLuong() + this.getTrachNhiem() - this.getThueTN();
    }

    @Override
    public void xuat() {
     System.out.println("Ma Nhan Vien: " + this.maNV);
        System.out.println("Ho Ten: " + this.hoTen);
        System.out.println("luong: " + this.luong);
        System.out.println("tien trach nhiem: " + this.trachNhiem);
        System.out.println("tong thu nhap: " + this.getThuNhap());
        System.out.println("-------------------------");
    }

    @Override
    public void nhap() {
        System.out.println("nhap ten nhan vien: ");
        this.hoTen = sc.nextLine();
        System.out.println("nhap ma nhan vien: ");
        this.maNV = sc.nextLine();
        System.out.println("nhap luong: ");
        this.luong = sc.nextDouble();
        System.out.println("nhap luong trach nhiem: ");
        this.trachNhiem = sc.nextDouble();
    }


    public void nhapHoiTP(ArrayList<TruongPhong> a) {
        String luaChon;
        do{
            TruongPhong nv = new TruongPhong(); 
            nv.nhap();
            a.add(nv);
            System.out.println("nhap tiep(y/n)");
            luaChon = sc.nextLine();
        }while(luaChon.equalsIgnoreCase("y"));
    }
    
    public void xuatMangTP(ArrayList<TruongPhong> a){
        for(TruongPhong x: a){
            x.xuat();
        }
    
    } 
    
    public void timTheoMaTp(ArrayList<TruongPhong> a) {
        boolean timKiem = false;
        System.out.println("nhap ma can tim: ");
        String maCanTim = sc.nextLine();
        for(int i = 0; i < a.size(); i++){
            if(a.get(i).getMaNV().equalsIgnoreCase(maCanTim)){
                timKiem = true;
                a.get(i).xuat();
            }
    }
        if(!timKiem){
            System.out.println("khong tim thay!");
        }
    }
    
    public void xoaTheoMaTP(ArrayList<TruongPhong> a) {
        boolean timKiem = false;
        System.out.println("nhap ma can xoa: ");
        String maCanTim = sc.nextLine();
        for(int i = 0; i < a.size(); i++){
            if(a.get(i).getMaNV().equalsIgnoreCase(maCanTim)){
                timKiem = true;
                a.remove(i); 
            }
    }
        if(!timKiem){
            System.out.println("khong tim thay!");
        }else{
            System.out.println("da xoa!");
        }
    }
}
