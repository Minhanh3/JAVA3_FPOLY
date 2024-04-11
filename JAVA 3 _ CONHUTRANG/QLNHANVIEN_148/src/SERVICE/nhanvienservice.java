/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SERVICE;

import INF_FACE.Inf_nhanvien;
import MODE.nhanvien;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Manhdepzai
 */
public class nhanvienservice implements Inf_nhanvien {

    Connection con = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    String sql = null;

    public List<nhanvien> getall() {
        sql = "select Ma,Ten,Ho,GioiTinh,MatKhau,TrangThai from nhanvien";
        List<nhanvien> listnv = new ArrayList<>();
        try {
            con = DBconnect.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                nhanvien nv = new nhanvien(
                        rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getInt(6)
                );
                listnv.add(nv);
            }
            return listnv;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public int insert(nhanvien nv) {
        sql = "insert into nhanvien(Ma,Ten,Ho,GioiTinh,MatKhau,TrangThai) values(?,?,?,?,?,?)";
        try {
            con = DBconnect.getConnection();
            ps = con.prepareStatement(sql);
            ps.setObject(1, nv.getMa());
            ps.setObject(2, nv.getTen());
            ps.setObject(3, nv.getHo());
            ps.setObject(4, nv.getGioitinh());
            ps.setObject(5, nv.getMatkhau());
            ps.setObject(6, nv.getTrangthai());
            return ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    @Override
    public int delete(String ma) {
        sql = "delete nhanvien where Ma =?";
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

    @Override
    public int update(nhanvien nv, String ma) {
        sql = "update nhanvien set Ten=?,Ho=?,GioiTinh=?,MatKhau=?,TrangThai=? where Ma like ?";
        try {
            con = DBconnect.getConnection();
            ps = con.prepareStatement(sql);
            ps.setObject(1, nv.getTen());
            ps.setObject(2, nv.getHo());
            ps.setObject(3, nv.getGioitinh());
            ps.setObject(4, nv.getMatkhau());
            ps.setObject(5, nv.getTrangthai());
            ps.setObject(6, ma);

            return ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }

    }

}
