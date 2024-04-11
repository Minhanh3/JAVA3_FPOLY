/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sevice;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import model.NhanVien;

/**
 *
 * @author Manhdepzai
 */
public class NVsevice {

    Connection con = null;
    PreparedStatement ps = null;
    String sql = null;
    ResultSet rs = null;

    public List<NhanVien> getall() {
        sql = "SELECT MaNV , HoTen,MatKhau,VaiTro FROM NhanVien";
        List<NhanVien> listnv = new ArrayList<>();
        try {
            con = DBconnect.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                NhanVien nv = new NhanVien(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4));
                listnv.add(nv);
            }
            return listnv;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public int delete(int ma) {
        sql = "delete NhanVien where MaNV =?";
        try {
            con = DBconnect.getConnection();
            ps = con.prepareStatement(sql);
            ps.setObject(1, ma);
            return ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    public int insert(NhanVien nv) {
        sql = "INSERT INTO NhanVien(MaNV,HoTen,MatKhau,VaiTro) values(?,?,?,?)";
        try {
            con = DBconnect.getConnection();
            ps = con.prepareStatement(sql);
            ps.setObject(1, nv.getMa());
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
