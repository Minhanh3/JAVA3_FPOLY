package service;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import com.microsoft.sqlserver.jdbc.ISQLServerPreparedStatement;
import mode.Sach;

public class SachService {

    Connection con = null;
    PreparedStatement ps = null;
    String sql = null;
    ResultSet rs = null;

    public List<Sach> getAll() {
        sql = "SELECT ID , MASACH , TENSACH , THELOAI ,DONGIA FROM SACH";
        List<Sach> listSach = new ArrayList<>();
        try {
            con = DBconnect.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Sach s = new Sach(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getDouble(5)
                );
                listSach.add(s);
            }
            return listSach;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public int addSach(Sach s) {
        sql = "INSERT INTO SACH(MASACH,TENSACH,THELOAI,DONGIA) VALUES(?,?,?,?)";
        try {
            con = DBconnect.getConnection();
            ps = con.prepareStatement(sql);
            ps.setObject(1, s.getMasach());
            ps.setObject(2, s.getTensach());
            ps.setObject(3, s.getTheloai());
            ps.setObject(4, s.getDongia());
            return ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    public Sach getSach(String theloai) {
        sql = "SELECT ID , MASACH , TENSACH ,THELOAI, DONGIA FROM SACH WHER THELOAI = ?";
        Sach s = null;
        try {
            con = DBconnect.getConnection();
            ps = con.prepareStatement(sql);
            ps.setObject(1, theloai);
            rs = ps.executeQuery();
            while (rs.next()) {
                s = new Sach(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getDouble(5)
                );
            }
            return s;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public int updateSach(Sach s, String masach) {
        sql = "UPDATE SACH SET TENSACH = ?, THELOAI = ?, DONGIA = ? WHERE MASACH = ?";
        try {
            con = DBconnect.getConnection();
            ps = con.prepareStatement(sql);
            ps.setObject(1, s.getTensach());
            ps.setObject(2, s.getTheloai());
            ps.setObject(3, s.getDongia());
            ps.setObject(4, masach);
            return ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    public List<Sach> findtheloai(String theloai) {
        sql = "SELECT MASACH ,TENSACH ,THELOAI,DONGIA FROM SACH WHERE THELOAI LIKE ?";
        List<Sach> lists = new ArrayList<>();
        try {
            con = DBconnect.getConnection();
            ps = con.prepareStatement(sql);
            ps.setObject(1, theloai);
            rs = ps.executeQuery();
            while (rs.next()) {
                Sach s = new Sach(
                        rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getDouble(4)
                );
                lists.add(s);
            }
            return lists;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
