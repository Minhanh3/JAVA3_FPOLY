package service;

import mode.*;
import java.util.List;
import java.sql.*;
import java.util.ArrayList;

public class xeservice implements if_face.IF_XEMAY {

    Connection con = null;
    PreparedStatement ps = null;
    String sql = null;
    ResultSet rs = null;

    public List<xemay2> getall() {
        sql = "select ma,ten,trangthai,gianhap,giaban,soluong from xemay";
        List<xemay2> xe = new ArrayList<>();
        try {
            con = DBconnect.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                xemay2 x = new xemay2(rs.getString(1),
                        rs.getString(2),
                        rs.getInt(3),
                        rs.getDouble(4),
                        rs.getDouble(5),
                        rs.getInt(6));
                xe.add(x);
            }
            return xe;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public int insert(xemay2 xe) {
        sql = "insert into xemay(ma,ten,trangthai,gianhap,giaban,soluong) values(?,?,?,?,?,?)";
        try {
            con = DBconnect.getConnection();
            ps = con.prepareStatement(sql);
            ps.setObject(1, xe.getMa());
            ps.setObject(2, xe.getTen());
            ps.setObject(3, xe.getTthai());
            ps.setObject(4, xe.getGianhap());
            ps.setObject(5, xe.getGiaban());
            ps.setObject(6, xe.getSluong());
            return ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    @Override
    public int delete(String ma) {
        sql = "delete xemay where ma =?";
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
    public int update(xemay2 xe, String ma) {
        sql = "update XeMay set Ten=?,TrangThai=?,GiaNhap=?,GiaBan=?,SoLuong=? where Ma like ?";
        try {
            con = DBconnect.getConnection();
            ps = con.prepareStatement(sql);
            ps.setObject(1, xe.getTen());
            ps.setObject(2, xe.getTthai());
            ps.setObject(3, xe.getGianhap());
            ps.setObject(4, xe.getGiaban());
            ps.setObject(5, xe.getSluong());
            ps.setObject(6, ma);
            return ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

}
