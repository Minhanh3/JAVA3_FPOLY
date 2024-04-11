/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import java.sql.*;
import com.microsoft.sqlserver.jdbc.ISQLServerPreparedStatement;
import java.util.ArrayList;
import java.util.List;
import mode.Grade;

public class QLdiemSevice {

    Connection con = null; // biên để kết nối
    PreparedStatement ps = null;
    String sql = null;
    ResultSet rs = null; // ket qua select

    public List<Grade> getAll() { // lay het dl to database
        sql = "SELECT SinhVien.MaSinhVien, hoten,tinhoc ,tienganh,giaoducthechat,(tinhoc+tienganh+giaoducthechat)/3.0 AS 'DIEM TB'\n"
                + "FROM SinhVien,Grade\n"
                + "WHERE SinhVien.MaSinhVien = Grade.MaSinhVien";
        List<Grade> listSV = new ArrayList<>();
        try { // lay duoc dl
            con = DBconnect.getConnection(); // ket noi database
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            //ket noi select la: resultSet
            while (rs.next()) {// doc tung dong den het rs thi dừng
                Grade gra = new Grade(rs.getString(1), rs.getString(2), rs.getInt(3), rs.getInt(4),
                        rs.getInt(4), rs.getInt(5)
                );
                listSV.add(gra);
            }
            return listSV;
        } catch (Exception e) { // khong lay duoc dl
            e.printStackTrace();
            return null;
        }
    }

    public int addSinhVien(Grade gra) {
        sql = "INSERT INTO Grade VALUES (?,?,?,?)";
        try {//thêm được
            con = DBconnect.getConnection();
            ps = con.prepareStatement(sql);
            ps.setObject(1, gra.getMasv()); // dấu ? thứ 1
            ps.setObject(2, gra.getTinhoc());
            ps.setObject(3, gra.getTienganh());
            ps.setObject(4, gra.getGdtc());
            return ps.executeUpdate();
        } catch (Exception e) { // không thêm được
            e.printStackTrace();
            return 0;
        }
    }
    
    public static void viewAll() {
    }

    public static void insert() {
    }

    public static void update() {
    }

    public static void delete() {
    }

    public static void checkLogin() {
    }

    public static void changePassword() {
    }
}
