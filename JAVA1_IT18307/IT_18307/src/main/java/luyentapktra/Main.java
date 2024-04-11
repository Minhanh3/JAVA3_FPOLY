/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package luyentapktra;

import java.util.Scanner;

/**
 *
 * @author Manhdepzai
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        QLSV qlsv = new QLSV();
        do {
            System.out.println("**********Menu******************");
            System.out.println("1. Them sinh vien               ");
            System.out.println("2. Xuat danh sach sinh vien     ");
            System.out.println("3. Xuat qua mon sinh vien       ");
            System.out.println("4. Tim sinh vien theo ma        ");
            System.out.println("5. ke thua                      ");
            System.out.println("0. Thoat                        ");
            System.out.println("**********Menu******************");
            System.out.println("Moi chon chuc nang              ");
            choice = Integer.parseInt(sc.nextLine());
            switch(choice) {
                case 1:
                    qlsv.add();
                    break;
                case 2:
                    qlsv.show();
                    break;
                case 3:
                    qlsv.showPassed();
                    break;
                case 4:
                    qlsv.search();
                    break;
                case 5:
                    qlsv.keThua();
                    break;
                case 0:
                    System.out.println("xin chao va hen gap lai!");
                    break;
                default:
                    System.out.println("yeu cau nhap lai");
            }
        } while (choice != 0);

    }
}
