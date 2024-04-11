package service;

import com.microsoft.sqlserver.jdbc.ISQLServerPreparedStatement;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import mode.XeMay;

public class XeMayService {

    Connection con = null;
    PreparedStatement ps = null;
    String sql = null;
    ResultSet rs = null;

    public List<XeMay> getall() {
        sql = "SELECT MA , TEN , SOPHANKHOI , MAUXE , GIA FROM XEMAY";
        List<XeMay> listxe = new ArrayList<>();
        try {
            con = DBconnect.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                XeMay xe = new XeMay(
                        rs.getString(1),
                        rs.getString(2),
                        rs.getInt(3),
                        rs.getString(4),
                        rs.getFloat(5)
                );
                listxe.add(xe);
            }
            return listxe;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    ;

    public int addXemay(XeMay xe) {
        sql = "INSERT INTO (MA , TEN ,SOPHANKHOI , MAUXE , GIA , FROM XEMAY)  VALUES (?,?,?,?,?)";
        try {//thêm được
            con = DBconnect.getConnection();
            ps = con.prepareStatement(sql);
            ps.setObject(1, xe.getMakhungxe()); // dấu ? thứ 1
            ps.setObject(2, xe.getTen());
            ps.setObject(3, xe.getSophankhoi());
            ps.setObject(4, xe.getMauxe());
            ps.setObject(5, xe.getGiaban());
            return ps.executeUpdate();
        } catch (SQLException e) { // không thêm được
            e.printStackTrace();
            return 0;
        }
    }

    public XeMay getXeMay(int ma) {
        sql = "SELECT MA , TEN , SOPHANKHOI , MAUXE , GIA FROM XEMAY where ma = ?";
        XeMay xe = null;
        try { // tìm được
            con = DBconnect.getConnection();
            ps = con.prepareStatement(sql);
            ps.setObject(1, ma); // ? thứ nhất
            rs = ps.executeQuery();
            while (rs.next()) {
                xe = new XeMay(
                        rs.getString(1),
                        rs.getString(2),
                        rs.getInt(3),
                        rs.getString(4),
                        rs.getFloat(5)
                );
            }
            return xe;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

}
