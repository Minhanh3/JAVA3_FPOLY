/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package asm;

import java.util.ArrayList;

/**
 *
 * @author ADMIN
 */
public class TiepThi extends NhanVien {

    private double doanhSo, hueHong;

    public TiepThi(double doanhSo, double hueHong, String maNV, String hoTen, double luong) {
        super(maNV, hoTen, luong);
        this.doanhSo = doanhSo;
        this.hueHong = hueHong;
    }

    public TiepThi() {
    }

    public double getDoanhSo() {
        return doanhSo;
    }

    public void setDoanhSo(double doanhSo) {
        this.doanhSo = doanhSo;
    }

    public double getHueHong() {
        return hueHong;
    }

    public void setHueHong(double hueHong) {
        this.hueHong = hueHong;
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
    public void xuat() {
        System.out.println("Ma Nhan Vien: " + this.maNV);
        System.out.println("Ho Ten: " + this.hoTen);
        System.out.println("luong: " + this.luong);
        System.out.println("Doanh so: " + this.doanhSo);
        System.out.println("hoa hong" + this.hueHong);
        System.out.println("tong thu nhap: " + this.getThuNhap());
        System.out.println("-----------------------");
    }

    @Override
    public double getThuNhap() {
        return this.getLuong() - this.getThueTN() *this.getHueHong()/100;
    }

    @Override
    public void nhap() {
        System.out.println("nhap ten nhan vien: ");
        this.hoTen = sc.nextLine();
        System.out.println("nhap ma nhan vien: ");
        this.maNV = sc.nextLine();
        System.out.println("nhap luong: ");
        this.luong = sc.nextDouble();
        System.out.println("nhap doanh so: ");
        this.doanhSo = sc.nextDouble();
        System.out.println("nhap hoa hong(%): ");
        this.hueHong = sc.nextDouble();
        System.out.println("tong thu nhap: " + this.getThuNhap());
        System.out.println("-------------------------");
    }
    public void nhapHoiTT(ArrayList <TiepThi> a){
        String luaChon;
        do{
            TiepThi nv = new TiepThi();
            nv.nhap();
            a.add(nv);
            System.out.println("nhap tiep(y/n)");
            luaChon = sc.nextLine();
        }while(luaChon.equalsIgnoreCase("y"));
    }

        public void xuatMangTT(ArrayList<TiepThi> a){
        for(TiepThi x: a){
            x.xuat();
        }
    
        
    } 


    public void timTheoMaTT(ArrayList<TiepThi> a) {
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
    
    public void xoaTheoMaTT(ArrayList<TiepThi> a) {
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
