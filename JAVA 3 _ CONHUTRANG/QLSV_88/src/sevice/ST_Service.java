/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sevice;

import Interface.InF_Student;
import model.Student;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Manhdepzai
 */
public class ST_Service implements InF_Student {

    Connection con = null;
    PreparedStatement ps = null;
    String sql = null;
    ResultSet rs = null;

    public List<Student> getAll() {
        sql = "SELECT ID,TENSV ,PASS,MARK FROM STUDENT";
        List<Student> listsv = new ArrayList<>();
        try {
            con = DBconnect.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Student st = new Student(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getInt(4)
                );
                listsv.add(st);
            }
            return listsv;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    ;
    //service gọi thực thi interface
    @Override
    public int insert_ST(Student st) {
        sql = "INSERT INTO STUDENT(TENSV,PASS,MARK) VALUES(?,?,?)";
        try {
            con = DBconnect.getConnection();
            ps = con.prepareStatement(sql);
            ps.setObject(1, st.getName());
            ps.setObject(2, st.getPass());
            ps.setObject(3, st.getMark());
            return ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    @Override
    public int delete_ST(int id) {
        sql = "DELETE FROM STUDENT WHERE ID = ?";
        List<Student> listsv = new ArrayList<>();
        try {
            con = DBconnect.getConnection();
            ps = con.prepareStatement(sql);
            ps.setObject(1, id);
            return ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    @Override
    public int update_ST(Student st, int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
