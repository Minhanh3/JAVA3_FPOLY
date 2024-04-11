/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package server;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import model.nhanvien;

public class nhanvserver {

    Connection con = null; // biên để kết nối
    PreparedStatement ps = null;
    String sql = null;
    ResultSet rs = null; // ket qua select

    public List<nhanvien> getAll() { // lay het dl to database
        sql = "SELECT MaNV , HoTen,MatKhau,VaiTro FROM NhanVien";
        List<nhanvien> listSV = new ArrayList<>();
        try {
            con = DBconnect.getConnection(); // ket noi database
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            //ket noi select la: resultSet
            while (rs.next()) {
                nhanvien nv = new nhanvien(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4));
                listSV.add(nv);
            }
            return listSV;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public int delete(int id) {
        sql = "DELETE FROM NhanVien WHERE MaNV =?";
        try {
            con = DBconnect.getConnection();
            ps = con.prepareStatement(sql);
            ps.setObject(1, id);
            return ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    public int insert(nhanvien nv) {
        sql = "INSERT INTO NhanVien(MaNV,HoTen,MatKhau,VaiTro) values(?,?,?,?)";
        try {
            con = DBconnect.getConnection();
            ps = con.prepareStatement(sql);
            ps.setObject(1, nv.getManv());
            ps.setObject(2, nv.getHoten());
            ps.setObject(3, nv.getMatkhau());
            ps.setObject(4, nv.getVaitro());
            return ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }
}
