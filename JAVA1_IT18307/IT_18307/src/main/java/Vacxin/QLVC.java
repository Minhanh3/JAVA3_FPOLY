/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vacxin;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Manhdepzai
 */
public class QLVC {

    private ArrayList<Vaccine> _list;
    private Scanner _sc;

    public QLVC() {
        _list = new ArrayList<>();
        _sc = new Scanner(System.in);
    }
//1. nhap
    public void add() {
        String choice;
        do {
            _list.add(new Vaccine(getValue("Nhap mavc"), getValue("Nhap ten vc:"), getValue("Nhap ngay het han:"),Float.parseFloat(getValue("TgTac dung:"))));
            System.out.println("Nhap 1: de tiep tuc sinh vien");
            System.out.println("khac 1:    de thoat chuc nang");
            choice = _sc.nextLine();
        } while (choice.equals("1"));
    }
    //2. xuat ds
    public void show(){
        if(_list.isEmpty()){
            System.out.println("Danh sach vc trong");
        }else{
            System.out.println("Danh sach vc la");
            int count = 1;
            for (Vaccine vaccine : _list) {
                System.out.println("Vaccin thu: " + count);
                vaccine.inThongTin();
                count++;
            }
        }
    }
    //3.  xuat vc >6 thang
    public void showPassed(){
        if(_list.isEmpty()){
            System.out.println("Danh sach vc trong");
        }else{
            int count = 0;
            for (Vaccine vaccine : _list) {
               if(vaccine.getThoiGianTacDung() > 6.0){
                   count++;
                   System.out.println("Vaccin thu " + count);
                   vaccine.inThongTin();
               }
            }
            if(count == 0 ){
                System.out.println("Khong co vc nao > 6 thang");
            }
        }
    }
    //4. 
    public void sapXep(){
        Collections.sort(_list,(o1 ,o2) -> o2.getThoiGianTacDung().compareTo(o1.getThoiGianTacDung()));
//        Collections.sort(_list, (o1, o2) -> -1 * o1.getThoiGianTacDung().compareTo(o2.getThoiGianTacDung()));
    }
    //
    //tim kiem 
    public void search(){
        if(_list.isEmpty()){
            System.out.println("Danh sach vc trong");
        }else{
            String mvc = getValue("Ma vc can tim: ");
            for (Vaccine vaccine : _list) {
                if(mvc == vaccine.getMaVC()){
                    System.out.println("Ma vc can tim la: ");
                    vaccine.inThongTin();
                    return;
                }
            }
            System.out.println("Khong tim thay ma vc");
        }
    }
    //5. ke thua
    
    public void keThua(){
        System.out.println("Nhap thong tin vc: ");
        VaccineVN vcvn = new VaccineVN(getValue("Ma vc"),getValue("Ten VC"),getValue("Ngay het han"),Float.parseFloat(getValue("TGtac dung")),getValue("Quoc gia"));
        System.out.println("Thong tin vc vua nhap la: ");
        vcvn.inThongTin();
    }
    
    
    public String getValue(String x) {
        System.out.println("Nhap - : " + x);
        return _sc.nextLine();
    }
}
