/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab6;

/**
 *
 * @author Admin
 */
public class bai3_main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        bai3 chuongtrinh = new bai3();
        String[][] students = new String[5][4];
        for (int i = 0; i < 1; i++) {
            System.out.println("Nhap thong tin sinh vien thu " + (i + 1));
            students[i] = chuongtrinh.nhap();
        }
        for (int i = 0; i < 1; i++) {
            chuongtrinh.kiemtra(students[i]);
        }
    }

}
