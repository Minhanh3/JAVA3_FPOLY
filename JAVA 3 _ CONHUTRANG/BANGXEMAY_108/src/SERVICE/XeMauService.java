/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SERVICE;

import INTERFACE.IF_XeMay;
import MODE.XeMay;
import java.util.List;
import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author Manhdepzai
 */
public class XeMauService implements IF_XeMay {

    Connection con = null;
    PreparedStatement ps = null;
    String sql = null;
    ResultSet rs = null;

    public List<XeMay> GetAll() {
        sql = "select ma,ten,trangthai,gianhap,giaban,soluong from  xemay";
        List<XeMay> listxm = new ArrayList<>();
        try {
            con = DBconnect.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                XeMay xm = new XeMay(
                        rs.getString(1),
                        rs.getString(2),
                        rs.getInt(3),
                        rs.getDouble(4),
                        rs.getDouble(5),
                        rs.getInt(6)
                );
                listxm.add(xm);
            }
            return listxm;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public int Insert(XeMay xm) {
        sql = "insert into xemay(ma,ten,trangthai,gianhap,giaban,soluong) values(?,?,?,?,?,?)";
        try {
            con = DBconnect.getConnection();
            ps = con.prepareStatement(sql);
            ps.setObject(1, xm.getMa());
            ps.setObject(2, xm.getTen());
            ps.setObject(3, xm.getTrangthai());
            ps.setObject(4, xm.getGianhap());
            ps.setObject(5, xm.getGiaban());
            ps.setObject(6, xm.getSoluong());
            return ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }

    }

    @Override
    public int delete(String ma) {
        sql = "delete XeMay where Ma =?";
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
    public int update(XeMay xm, String ma) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
