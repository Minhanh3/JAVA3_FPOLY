/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QuanLySinhVien;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Manhdepzai
 */
public class SinhVienService {

    Connection con = null; // biên để kết nối
    PreparedStatement ps = null;
    String sql = null;
    ResultSet rs = null; // ket qua select

    public List<SinhVien> getAll() { // lay het dl to database
        sql = "SELECT ID ,MA , TEN , TUOI , HOCKY, NGANHHOC,DIEMTRUNGBINH,GIOITINH FROM SINHVIEN";
        List<SinhVien> listSV = new ArrayList<>();
        try { // lay duoc dl
            con = DBconnect.getConnection(); // ket noi database
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            //ket noi select la: resultSet
            while (rs.next()) {// doc tung dong den het rs thi dừng
                SinhVien sv = new SinhVien(
                        rs.getString(1),
                        rs.getString(2),
                        rs.getInt(3),
                        rs.getInt(4),
                        rs.getString(5),
                        rs.getFloat(6),
                        rs.getBoolean(7)
                );
                listSV.add(sv);
            }
            return listSV;
        } catch (Exception e) { // khong lay duoc dl
            e.printStackTrace();
            return null;
        }
    }

    public int addSinhVien(SinhVien sv) {
        sql = "INSERT INTO SinhVien(MA , TEN , TUOI , HOCKY, NGANHHOC,DIEMTRUNGBINH,GIOITINH) values(?,?,?,?,?,?,?)";
        try {//thêm được
            con = DBconnect.getConnection();
            ps = con.prepareStatement(sql);
            ps.setObject(1, sv.getMa()); // dấu ? thứ 1
            ps.setObject(2, sv.getTen());
            ps.setObject(3, sv.getTuoi());
            ps.setObject(4, sv.getHocky());
            ps.setObject(5, sv.getNganhhoc());
            ps.setObject(6, sv.getDiemtb());
            ps.setObject(7, sv.getClass());
            return ps.executeUpdate();
        } catch (Exception e) { // không thêm được
            e.printStackTrace();
            return 0;
        }
    }
}
