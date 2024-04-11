/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import model.KhoaHoc;

/**
 *
 * @author Manhdepzai
 */
public class KHsevice {

    Connection con = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    String sql = null;

    public List<KhoaHoc> getall() {
        sql = "SELECT MaKH , HocPhi,ThoiLuong,GhiChu FROM KhoaHoc";
        List<KhoaHoc> listkh = new ArrayList<>();
        try {
            con = DBconnect.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                KhoaHoc kh = new KhoaHoc(
                        rs.getInt(1),
                        rs.getFloat(2),
                        rs.getInt(3),
                        rs.getString(4));
                listkh.add(kh);
            }
            return listkh;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public int insert(KhoaHoc kh) {
        sql = "INSERT INTO KhoaHoc(MaKH , HocPhi,ThoiLuong,GhiChu) values(?,?,?,?)";
        try {
            con = DBconnect.getConnection();
            ps = con.prepareStatement(sql);
            ps.setObject(1, kh.getMakh());
            ps.setObject(2, kh.getHocphi());
            ps.setObject(3, kh.getThoiluong());
            ps.setObject(4, kh.getGhichu());
            return ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    public int delete(int makh) {
        sql = " DELETE FROM KhoaHoc WHERE MaKH =?";
        try {
            con = DBconnect.getConnection();
            ps = con.prepareStatement(sql);
            ps.setObject(1, makh);
            return ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    public int update(KhoaHoc kh, int makh) {
        sql = "UPDATE KhoaHoc set HocPhi=?,ThoiLuong=?,GhiChu=? WHERE MaKH=?";
        try {
            con = DBconnect.getConnection();
            ps = con.prepareStatement(sql);
            ps.setObject(1, kh.getHocphi());
            ps.setObject(2, kh.getThoiluong());
            ps.setObject(3, kh.getGhichu());
            ps.setObject(4, makh);
            return ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

}
