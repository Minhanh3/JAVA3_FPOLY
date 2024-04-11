/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package luyentapktra;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Manhdepzai
 */
public class QLSV {

    private ArrayList<SinhVien> _list;
    private Scanner _sc;

    public QLSV() {
        _list = new ArrayList<>();
        _sc = new Scanner(System.in);
    }

    public void add() {
        String choice;
        do {
            _list.add(new SinhVien(Integer.parseInt(getValue("ma sinh vien")), getValue("ten sinh vien"), Integer.parseInt(getValue("nam sinh")), Double.parseDouble("Diem C sharp")));
            System.out.println("Nhap 1: de tiep tuc sinh vien");
            System.out.println("khac 1:    de thoat chuc nang");
            choice = _sc.nextLine();
        } while (choice.equals("1"));
    }
//xuat sinh vien

    public void show() {
        if (_list.isEmpty()) {
            System.out.println("Danh sach sinh vien trong");
        } else {
            System.out.println("danh sach sinh vien la:");
            int count = 1;
            for (SinhVien sinhVien : _list) {
                System.out.println("Sinh vien thu " + count);
                sinhVien.inThongTin();
                count++;
            }
        }
    }
//xuat sinh vien qua mon >= 5

    public void showPassed() {
        if (_list.isEmpty()) {
            System.out.println("Danh sach sinh vien trong");
        } else {
            int count = 0;
            for (SinhVien sinhVien : _list) {
                if (sinhVien.getDiemCsharp() >= 5.0) {
                    count++;
                    System.out.println("Sinh thu " + count);
                    sinhVien.inThongTin();
                }
            }
            if (count == 0) {
                System.out.println("Khong co sinh vien nao qua mon C trong danh sach");
            }
        }
    }
//tim kiếm sinh vien

    public void search() {
        if (_list.isEmpty()) {
            System.out.println("Danh sach sinh vien trong: ");
        } else {
            int msv = Integer.parseInt(getValue("Ma sinh vien can tim"));
            for (SinhVien sinhVien : _list) {
                if (sinhVien.getMaSV() == msv) {
                    System.out.println("Sinh vien can tim la: ");
                    sinhVien.inThongTin();
                    return;
                }
            }
            System.out.println("Khong tim thay sinh vien co ma: " + msv);
        }
    }
// kê thừa

    public void keThua() {
        System.out.println("Nhap vao thong tin sinh vien UDPM:");
        SV_UDPM udpm = new SV_UDPM(Integer.parseInt(getValue("ma sinh vien")), getValue("ten sinh vien"), Integer.parseInt(getValue("nam sinh: ")), Double.parseDouble(getValue("diem c sharp")), Double.parseDouble(getValue("diem java")));
        System.out.println("Thong tin sinh vien UDPM vua nhap la: ");
        udpm.inThongTin();
    }

    private String getValue(String x) {
        System.out.println("Nhap vao " + x);
        return _sc.nextLine();
    }
}
