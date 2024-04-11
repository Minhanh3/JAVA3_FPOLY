/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SERVICE;

import IF_FACE.inf_sach;
import MODE.sach;
import java.util.List;
import java.sql.*;
import java.util.ArrayList;

public class sachservice implements inf_sach {

    Connection con = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    String sql = null;

    public List<sach> getall() {
        sql = "select ma,ten,NgayXuatBan,SoTrang,DonGia,TrangThai from sach";
        List<sach> lists = new ArrayList<>();
        try {
            con = DBconnect.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                sach s = new sach(
                        rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getInt(4),
                        rs.getInt(5),
                        rs.getInt(6)
                );
                lists.add(s);
            }
            return lists;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public int insert(sach s) {
        sql = "insert into sach(ma,ten,NgayXuatBan,SoTrang,DonGia,TrangThai) values(?,?,?,?,?,?)";
        try {
            con = DBconnect.getConnection();
            ps = con.prepareStatement(sql);
            ps.setObject(1, s.getMa());
            ps.setObject(2, s.getTen());
            ps.setObject(3, s.getNgaysb());
            ps.setObject(4, s.getSotrang());
            ps.setObject(5, s.getGia());
            ps.setObject(6, s.getTrangthai());
            return ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    @Override
    public int update(sach s, String ma) {
        sql = "update sach set Ten=?,ngayxuatban=?,sotrang=?,dongia=?,TrangThai=? where Ma like ?";
        try {
            con = DBconnect.getConnection();
            ps = con.prepareStatement(sql);
            ps.setObject(1, s.getTen());
            ps.setObject(2, s.getNgaysb());
            ps.setObject(3, s.getSotrang());
            ps.setObject(4, s.getGia());
            ps.setObject(5, s.getTrangthai());
            ps.setObject(6, ma);
            return ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    @Override
    public int delete(String ma) {
        sql = "delete sach where Ma =?";
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

}
