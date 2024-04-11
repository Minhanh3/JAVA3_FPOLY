/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ktra1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Manhdepzai
 */
public class ServiceGiaoVien {

    Scanner _sc = new Scanner(System.in);
    List<GiaoVien> _lstGiaoViens = new ArrayList<>();
    GiaoVien _gv;

    void nhapDoiTuong() {
        String nhap;
        while (true) {
            _gv = new GiaoVien();
            _gv.setId(Integer.parseInt(getInputvalue("Id: ")));
            _gv.setTen(getInputvalue("Ten:"));
            _gv.setSogioday(Double.parseDouble(getInputvalue("So gio day:")));
            _lstGiaoViens.add(_gv);
            System.out.println("ban co muon nhap tiep khong? 1/2");
            nhap = _sc.nextLine();
            if (nhap.equalsIgnoreCase("1")) {
                break;
            }
        }
    }

    public void xuatDoiTuong() {
        if (_lstGiaoViens.isEmpty()) {
            System.out.println("Danh sach trong");
            return;
        }
        for (GiaoVien x : _lstGiaoViens) {
            x.Show();
        }
    }

    public void xuatTheoKhoang() {
        if (_lstGiaoViens.isEmpty()) {
            System.out.println("Danh sach trong");
            return;
        }
        double a, b, c = 0;
        a = Double.parseDouble(getInputvalue("So gio day bat dau: "));
        b = Double.parseDouble(getInputvalue("So gio day ket thuc: "));
        if (a > b) {
            a = b;
            b = c;
            c = a;
        }
        int temp = 0;
        for (int i = 0; i < _lstGiaoViens.size(); i++) {
            if( a <= _lstGiaoViens.get(i).getSogioday() && _lstGiaoViens.get(i).getSogioday() <= b){
                _lstGiaoViens.get(i).Show();
                temp++;
            }
            
        }
        
    }

    String getInputvalue(String text) {
        System.out.println("Moi ban nhap " + text);
        return _sc.nextLine();
    }
}
