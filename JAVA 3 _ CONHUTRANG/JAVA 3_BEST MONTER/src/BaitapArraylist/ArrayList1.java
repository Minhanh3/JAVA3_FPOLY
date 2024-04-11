/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BaitapArraylist;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Manhdepzai
 */
public class ArrayList1 {

    static ArrayList<Integer> dsData = new ArrayList<Integer>();

    public static void menu() {
        System.out.println("--------------------1.them");
        System.out.println("--------------------2.xuat");
        System.out.println("--------------------3.sua");
        System.out.println("--------------------4.xoa");
        System.out.println("--------------------5.tim kiem");
        System.out.println("--------------------6.sap xep");
        System.out.println("--------------------7.thoat");
        System.out.println("--------------------Baby chon gi vay\n");
        int choice = new Scanner(System.in).nextInt();
        switch (choice) {
            case 1:
                them();
                break;
            case 2:
                xuat();
                break;
            case 3:
                sua();
                break;
            case 4:
                xoa();
                break;
            case 5:
                timkiem();
                break;
            case 6:
                sapxep();
                break;
            case 7:
                System.err.println("cám ơn00");
                System.exit(0);
                break;

            default:
                throw new AssertionError();
        }
    }

    public static void main(String[] args) {
        while (true) {
            menu();
        }
    }

    private static void them() {
        System.out.println("Nhập giá trị cần thêm");
        int value = new Scanner(System.in).nextInt();
        dsData.add(value);

    }

    private static void xuat() {
        for (int i = 0; i < dsData.size(); i++) {
            System.out.print(dsData.get(i)+"\t");
        }
        System.out.println( );
    }

    private static void sua() {
        System.out.println("Vị trí sửa");
        int vt = new Scanner(System.in).nextInt();
        System.out.println("Số mới");
        int value = new Scanner(System.in).nextInt();
        dsData.set(vt, value);
        xuat();
    }

    private static void xoa() {
        System.out.println("Vị trí xóa");
        int vt = new Scanner(System.in).nextInt();
        dsData.remove(vt);
        xuat();
    }

    private static void timkiem() {
        System.out.println("Nhâp so muon tim");
        int t = new Scanner(System.in).nextInt();
        if (dsData.contains(t)) {
            System.out.println("Có " + t +" Trong danh sách");
        }else{
            System.out.println("Khong co " + t + " Trong danh sach");
        }
    }

    private static void sapxep() {
        Collections.sort(dsData);
        xuat();
    }
}
