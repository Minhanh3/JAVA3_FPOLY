/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import model.ChuyenDe;

public class CDsevice {

    Connection con = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    String sql = null;

    public List<ChuyenDe> getall() {
        sql = "SELECT MaCD,TenCD,HocPhi,ThoiLuong,MoTa FROM ChuyenDe";
        List<ChuyenDe> listcd = new ArrayList<>();
        try {
            con = DBconnect.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                ChuyenDe cd = new ChuyenDe(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getFloat(3),
                        rs.getInt(4),
                        rs.getString(5)
                );
                listcd.add(cd);
            }
            return listcd;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public int add(ChuyenDe cd) {
        sql = "INSERT INTO ChuyenDe(MaCD,TenCD,HocPhi,ThoiLuong,MoTa) values(?,?,?,?,?)";
        try {
            con = DBconnect.getConnection();
            ps = con.prepareStatement(sql);
            ps.setObject(1, cd.getMacd());
            ps.setObject(2, cd.getTencd());
            ps.setObject(3, cd.getHocphi());
            ps.setObject(4, cd.getThoiluong());
            ps.setObject(5, cd.getMota());
            return ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }
}
