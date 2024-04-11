/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package asm;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class NhanVien {

    public String maNV, hoTen;
    double luong;
    Scanner sc = new Scanner(System.in);
//ham tao khong tham so

    public NhanVien() {
    }
//ham tao co tham so

    public NhanVien(String maNV, String hoTen, double luong) {
        this.maNV = maNV;
        this.hoTen = hoTen;
        this.luong = luong;
    }
    //GETTER VA SETTER

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

    //cac phuong thuc
    public double getThuNhap() {
        return this.getLuong() - this.getThueTN();
    }

    public double getThueTN() {
        double thuNhap = this.luong;
        if (thuNhap <= 9000000) {
            return 0;
        } else if (thuNhap <= 15000000 && thuNhap >9000000) {
            return (thuNhap - 9000000) * 0.1;
        } else {
            return (thuNhap - 15000000) * 0.1 + 6000000 * 0.12;
        }
    }

    public void xuat() {
        System.out.println("Ma Nhan Vien: " + this.maNV);
        System.out.println("Ho Ten: " + this.hoTen);
        System.out.println("luong: " + this.luong);
        System.out.println("Thue thu nhap: " + this.getThueTN());
        System.out.println("tong thu nhap: " + this.getThuNhap());
        System.out.println("-------------------------");
    }

    public void nhap() {
        System.out.println("nhap ten nhan vien: ");
        this.hoTen = sc.nextLine();
        System.out.println("nhap ma nhan vien: ");
        this.maNV = sc.nextLine();
        System.out.println("nhap luong: ");
        this.luong = sc.nextDouble();
    }

    public void nhapHoi(ArrayList<NhanVien> a) {
        String luaChon;
        do {
            NhanVien nv = new NhanVien();
            nv.nhap();
            a.add(nv);
            System.out.println("nhap tiep(y/n)");
            luaChon = sc.nextLine();
        } while (luaChon.equalsIgnoreCase("y"));
    }

    public void xuatMang(ArrayList<NhanVien> a, ArrayList <TiepThi> b, ArrayList< TruongPhong> c) {
        for (NhanVien x : a) {
            x.xuat();
        }
        for (TiepThi x : b) {
            x.xuat();
        }
        for (TruongPhong x : c) {
            x.xuat();
        }
    }

    public void timTheoMa(ArrayList<NhanVien> a, ArrayList <TiepThi> b, ArrayList< TruongPhong> c) {
        boolean timKiem = false;
        System.out.println("nhap ma can tim: ");
        String maCanTim = sc.nextLine();
        //nhan vien
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i).getMaNV().equalsIgnoreCase(maCanTim)) {
                timKiem = true;
                a.get(i).xuat();
            }
        }
        //truong phong
        for (int i = 0; i < b.size(); i++) {
            if (b.get(i).getMaNV().equalsIgnoreCase(maCanTim)) {
                timKiem = true;
                b.get(i).xuat();
            }
        }
        //tiep thi
        for (int i = 0; i < c.size(); i++) {
            if (c.get(i).getMaNV().equalsIgnoreCase(maCanTim)) {
                timKiem = true;
                c.get(i).xuat();
            }
        }
        //xuat kq
        if (!timKiem) {
            System.out.println("khong tim thay!");
        }
    }

    public void xoaTheoMa(ArrayList<NhanVien> a, ArrayList <TiepThi> b, ArrayList< TruongPhong> c) {
        boolean timKiem = false;
        System.out.println("nhap ma can xoa: ");
        String maCanTim = sc.nextLine();
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i).getMaNV().equalsIgnoreCase(maCanTim)) {
                timKiem = true;
                a.remove(i);
            }
        }
        //tiep thi
        for (int i = 0; i < b.size(); i++) {
            if (b.get(i).getMaNV().equalsIgnoreCase(maCanTim)) {
                timKiem = true;
                b.remove(i);
            }
        }
        //truong phong
        for (int i = 0; i < c.size(); i++) {
            if (c.get(i).getMaNV().equalsIgnoreCase(maCanTim)) {
                timKiem = true;
                c.remove(i);
            }
        }
        //ket qua
        if (!timKiem) {
            System.out.println("khong tim thay!");
        } else {
            System.out.println("da xoa!");
        }
    }

    public void timKiemVaSua(ArrayList<NhanVien> a, ArrayList<TruongPhong> b, ArrayList<TiepThi> c) {
        boolean timKiem = false;
        System.out.println("nhap ma nhan vien can sua: ");
        String maCanSua = sc.nextLine().trim();
        //tim kiem kieu du lieu 1
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i).getMaNV().equalsIgnoreCase(maCanSua)) {
                System.out.println("nhap ten moi: ");
                String tenMoi = sc.nextLine();
                a.get(i).setHoTen(tenMoi);
                System.out.println("nhap luong moi: ");
                double luongMoi = sc.nextDouble();
                a.get(i).setLuong(luongMoi);
                timKiem = true;
            }
        }
        //tim kiem kieu du lieu 2
        for (int j = 0; j < b.size(); j++) {
            if (b.get(j).getMaNV().equalsIgnoreCase(maCanSua)) {
                System.out.println("nhap ten moi: ");
                String tenMoi = sc.nextLine();
                b.get(j).setHoTen(tenMoi);
                System.out.println("nhap luong moi: ");
                double luongMoi = sc.nextDouble();
                b.get(j).setLuong(luongMoi);
                System.out.println("nhap luong trach nhiem moi: ");
                double luongTrachNhiemMoi = sc.nextDouble();
                b.get(j).setTrachNhiem(luongTrachNhiemMoi);
                timKiem = true;
            }
        }

        //tim kiem kieu du lieu 3
        for (int k = 0; k < c.size(); k++) {
            if (c.get(k).getMaNV().equalsIgnoreCase(maCanSua)) {
                System.out.println("nhap ten moi: ");
                String tenMoi = sc.nextLine();
                c.get(k).setHoTen(tenMoi);
                System.out.println("nhap luong moi: ");
                double luongMoi = sc.nextDouble();
                c.get(k).setLuong(luongMoi);
                System.out.println("nhap doanh so moi: ");
                double doanhSoMoi = sc.nextDouble();
                c.get(k).setDoanhSo(doanhSoMoi);
                System.out.println("nhap hoa hong moi: ");
                double hoaHongMoi = sc.nextDouble();
                c.get(k).setHueHong(hoaHongMoi);
            }
        }

    }

    public void timTheoKhoangLuong(ArrayList<NhanVien> a, ArrayList<TruongPhong> b, ArrayList<TiepThi> c) {
        System.out.println("nhap khoang luong muon tim:");
        System.out.println("tu ");
        double tu = sc.nextDouble();
        System.out.println("den ");
        double den = sc.nextDouble();
        boolean timKiem = false;
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i).getLuong() >= tu && a.get(i).getLuong() <= den) {
                a.get(i).xuat();
                timKiem = true;
            }
        }

        for (int i = 0; i < b.size(); i++) {
            if (b.get(i).getLuong() >= tu && b.get(i).getLuong() <= den) {
                b.get(i).xuat();
                timKiem = true;

            }
        }

        for (int i = 0; i < c.size(); i++) {
            if (c.get(i).getLuong() >= tu && c.get(i).getLuong() <= den) {
                c.get(i).xuat();
                timKiem = true;

            }
        }
        if(!timKiem){
            System.out.println("khong tim thay!");
        }
    }
    
    public void sapXepTheoHoTen(ArrayList<NhanVien> a, ArrayList<TruongPhong> b, ArrayList<TiepThi> c){
        ArrayList<String> hoTenTong = new ArrayList<>();
        for (int i = 0; i < a.size(); i++) {
            hoTenTong.add(a.get(i).getHoTen());
            }
        

        for (int i = 0; i < b.size(); i++) {
            hoTenTong.add(b.get(i).getHoTen());
        }

        for (int i = 0; i < c.size(); i++) {
            hoTenTong.add(c.get(i).getHoTen());
        }
        
        Collections.sort(hoTenTong);
        Collections.reverse(hoTenTong);
        System.out.println("Danh sach ho ten sau khi sap xep theo ho ten: ");
        for(String x: hoTenTong){
            
            for (int i = 0; i < a.size(); i++) {
                if(a.get(i).getHoTen().equalsIgnoreCase(x)){
                    a.get(i).xuat();
                }
            }
            
        

        for (int i = 0; i < b.size(); i++) {
            if(b.get(i).getHoTen().equalsIgnoreCase(x)){
                    b.get(i).xuat();
            }
        }

        for (int i = 0; i < c.size(); i++) {
               if(c.get(i).getHoTen().equalsIgnoreCase(x)){
                    c.get(i).xuat();       
        }
        }
    }              
}
    
    public void sapXepTheoThuNhap(ArrayList<NhanVien> a, ArrayList<TruongPhong> b, ArrayList<TiepThi> c){
        ArrayList<Double> thuNhapTong = new ArrayList<>();
        for (int i = 0; i < a.size(); i++) {
            thuNhapTong.add(a.get(i).getThuNhap());
            }
        

        for (int i = 0; i < b.size(); i++) {
            thuNhapTong.add(b.get(i).getThuNhap());
        }

        for (int i = 0; i < c.size(); i++) {
            thuNhapTong.add(c.get(i).getThuNhap());
        }
        
        Collections.sort(thuNhapTong);
        Collections.reverse(thuNhapTong);
        System.out.println("Danh sach ho ten sau khi sap xep theo thu nhap: ");
        for(Double x: thuNhapTong){
            
            for (int i = 0; i < a.size(); i++) {
                if(a.get(i).getThuNhap() == x){
                    a.get(i).xuat();
                }
            }
            
        

        for (int i = 0; i < b.size(); i++) {
            if(b.get(i).getThuNhap() == x){
                    b.get(i).xuat();
            }
        }

        for (int i = 0; i < c.size(); i++) {
               if(c.get(i).getThuNhap() == x){
                    c.get(i).xuat();       
        }
        }
    }              
}
    
    public void top5ThuNhap(ArrayList<NhanVien> a, ArrayList<TruongPhong> b, ArrayList<TiepThi> c){
        ArrayList<Double> thuNhapTong = new ArrayList<>();
        for (int i = 0; i < a.size(); i++) {
            thuNhapTong.add(a.get(i).getThuNhap());
            }
        

        for (int i = 0; i < b.size(); i++) {
            thuNhapTong.add(b.get(i).getThuNhap());
        }

        for (int i = 0; i < c.size(); i++) {
            thuNhapTong.add(c.get(i).getThuNhap());
        }
        
        Collections.sort(thuNhapTong);
        Collections.reverse(thuNhapTong);
        System.out.println("Top 5 thu nhap: : ");
        int soLan = 0;
        for(Double x: thuNhapTong){
            soLan++;
            for (int i = 0; i < a.size(); i++) {
                if(a.get(i).getThuNhap() == x){
                    a.get(i).xuat();
                }
            }
            
        

        for (int i = 0; i < b.size(); i++) {
            if(b.get(i).getThuNhap() == x){
                    b.get(i).xuat();
            }
        }

        for (int i = 0; i < c.size(); i++) {
               if(c.get(i).getThuNhap() == x){
                    c.get(i).xuat();       
        }
        }
        if(soLan == 5){
            break;
        }
    }              
}
    
    
    
    
    
    
    
    
    
}
