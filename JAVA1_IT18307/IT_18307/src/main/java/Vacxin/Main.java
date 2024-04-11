/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vacxin;

import java.util.Scanner;
import luyentapktra.QLSV;

/**
 *
 * @author Manhdepzai
 */
public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int choice;
        QLVC qlvc = new QLVC();
        do {
            System.out.println("***************Menu*****************");
            System.out.println("1.          ");
            System.out.println("2.          ");
            System.out.println("3.         ");
            System.out.println("4. ");
            System.out.println("5.                         ");
            System.out.println("0. Nhap danh sach doi tuong         ");
            System.out.println("Moi ban chon chuc nang");
            choice = Integer.parseInt(s.nextLine());
            switch (choice) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 0:
                    System.out.println("xin chao va hen gap lai");
                    break;
                default:
                    System.out.println("Moi ban chon lai");
            }

        } while (choice != 0);

    }

}
