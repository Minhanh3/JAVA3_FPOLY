/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab6;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class bai3 {
    // Hàm kiểm tra định dạng email
    public static boolean isValidEmail(String email) {
        return email.matches("^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$");
    }

    // Hàm kiểm tra định dạng số điện thoại
    public static boolean isValidPhoneNumber(String phone) {
        return phone.matches("^\\d{10}$");
    }

    // Hàm kiểm tra định dạng chứng minh nhân dân
    public static boolean isValidId(String id) {
        return id.matches("^\\d{9}$");
    }
    private static String[][] students = new String[5][4];
    Scanner s = new Scanner(System.in);

    public String[] nhap() {
        String name, email, phone, id;

//        for (int i = 0; i < 5; i++) {
            System.out.print("Nhap ho ten: ");
            name = s.nextLine();
            System.out.print("Email: ");
            email = s.next();
            System.out.print("SDT: ");
            phone = s.next();
            System.out.print("CMND: ");
            id = s.next();
            // luu thong tin vao mang

//        }
        String[] student = {name, email, phone, id};
        return student;
    }

    public void kiemtra(String[] student) {
        String name = student[0];
        String email = student[1];
        String phone = student[2];
        String id = student[3];
        if (!isValidEmail(email)) {
            System.out.println("Email khong dung dinh dang.");
        }
        else{
            System.out.println("No problem (email)");
        }

        // Kiểm tra định dạng số điện thoại
        if (!isValidPhoneNumber(phone)) {
            System.out.println("So dien thoai khong dung dinh dang.");
        }else{
            System.out.println("No problem (phone)");
        }

        // Kiểm tra định dạng chứng minh nhân dân
        if (!isValidId(id)) {
            System.out.println("Chung minh nhan dan khong dung dinh dang.");
        }else{
            System.out.println("No problem (CMND)");
        }
    }
    
}