/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SEVICE;

import INFFACE.inf_faceban;
import MODE.ban;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class banservice implements inf_faceban {

    Connection con = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    String sql = null;

    public List<ban> getall() {
        sql = "select Ma,Ten,NgaySinh,SoThich,GioiTinh,TrangThai from ban";
        List<ban> listb = new ArrayList<>();
        try {
            con = DBconnect.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                ban b = new ban(
                        rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getInt(5),
                        rs.getInt(6)
                );
                listb.add(b);
            }
            return listb;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public int insert(ban b) {
        sql = "insert into ban(Ma,Ten,NgaySinh,SoThich,GioiTinh,TrangThai) values(?,?,?,?,?,?)";
        try {
            con = DBconnect.getConnection();
            ps = con.prepareStatement(sql);
            ps.setObject(1, b.getMa());
            ps.setObject(2, b.getTen());
            ps.setObject(3, b.getNgaysinh());
            ps.setObject(4, b.getSothich());
            ps.setObject(5, b.getGioitinh());
            ps.setObject(6, b.getTrangthai());
            return ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    @Override
    public int delete(String ma) {
        sql = "delete ban where Ma =?";
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
    public int update(String ma, ban b) {
        sql = "update ban set Ten=?,NgaySinh=?,SoThich=?,GioiTinh=?,TrangThai=? where Ma like ?";
        try {
            con = DBconnect.getConnection();
            ps = con.prepareStatement(sql);
            ps.setObject(1, b.getTen());
            ps.setObject(2, b.getNgaysinh());
            ps.setObject(3, b.getSothich());
            ps.setObject(4, b.getGioitinh());
            ps.setObject(5, b.getTrangthai());
            ps.setObject(6, ma);
            return ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

}
