/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import com.microsoft.sqlserver.jdbc.ISQLServerPreparedStatement;
import java.util.ArrayList;
import mode.User;
import java.sql.*;
import java.util.List;
import mode.Grade;

public class UserDao {

    Connection con = null; // biên để kết nối
    PreparedStatement ps = null;
    String sql = null;
    ResultSet rs = null; // ket qua select

    public List<User> viewAll() {
        sql = "SELECT username, password ,role from Users";
        List<User> listu = new ArrayList<>();
        try { // lay duoc dl
            con = DBconnect.getConnection(); // ket noi database
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            //ket noi select la: resultSet
            while (rs.next()) {// doc tung dong den het rs thi dừng
                String un = rs.getString(1);
                String pwd = rs.getString(2);
                String role = rs.getString(3);
                User user = new User(un, pwd, role);
                listu.add(user);
            }
            return listu;
        } catch (Exception e) { // khong lay duoc dl
            e.printStackTrace();
            return null;
        }
    }

    public static void insert() {
    }

    public static void update() {
    }

    public static void delete() {
    }

    public static void checkLogin() {
    }

    public static void changePassword() {
    }

}
