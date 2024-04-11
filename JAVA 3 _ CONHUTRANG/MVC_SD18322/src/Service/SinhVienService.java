    package Service;

import Mode.SinhVien;
import com.microsoft.sqlserver.jdbc.ISQLServerPreparedStatement;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class SinhVienService {

    Connection con = null; // biên để kết nối
    PreparedStatement ps = null;
    String sql = null;
    ResultSet rs = null; // ket qua select
    
    public List<SinhVien> getAll() { // lay het dl to database
        sql = "SELECT ID , NAME FROM SINHVIEN";
        List<SinhVien> listSV = new ArrayList<>();
        try { // lay duoc dl
            con = DBconnect.getConnection(); // ket noi database
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            //ket noi select la: resultSet
            while (rs.next()) {// doc tung dong den het rs thi dừng
                SinhVien sv = new SinhVien(rs.getInt(1), rs.getString(2));
                listSV.add(sv);
            }
            return listSV;
        } catch (Exception e) { // khong lay duoc dl
            e.printStackTrace();
            return null;
        }
    }

    ;
    public int addSinhVien(SinhVien sv) {
//        sql = "insert into SINHVIEN(ID , NAME) VALUES (??)";
//        try {//thêm được
//            con = DBconnect.getConnection();
//            ps = con.prepareStatement(sql);
//            ps.setObject(1, sv.getId()); // dấu ? thứ nhất
//            ps.setObject(2, sv.getName()); // dấu ? thứ hai
//            return ps.executeUpdate();
//            // ínert , delete , update:executeUpdate()
//        } catch (Exception e) {
//            e.printStackTrace();
//            return 0;
//        }
        sql = "INSERT INTO SinhVien(ID,NAME) values(?,?)";
        try {//thêm được
            con = DBconnect.getConnection();
            ps = con.prepareStatement(sql);
            ps.setObject(1, sv.getId()); // dấu ? thứ 1
            ps.setObject(2, sv.getName());
            return ps.executeUpdate();
        } catch (Exception e) { // không thêm được
            e.printStackTrace();
            return 0;
        }
    }

    public int deleteSinhVien(int id) { // đối số truyền vào luôn là khóa chính
        sql = "DELETE FROM SinhVien WHERE ID =?";
        try { // xóa đươc
            con = DBconnect.getConnection();
            ps = con.prepareStatement(sql);
            ps.setObject(1, id); // ? thứ nhất : cột số 1 object
            return ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    public int updateSinhVien(SinhVien sv, int id) {
        sql = "UPDATE SinhVien set NAME=? WHERE id=?";
        try {
            con = DBconnect.getConnection();
            ps = con.prepareStatement(sql);
            ps.setObject(1, sv.getName()); // dấu ? thứ nhất ở trên sql kia 
            ps.setObject(2, id);
            return ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    public SinhVien getSinhVien(int id) {
        // tìm sv theo khóa chính
        sql = "select id, name from sinhvien where id = ?";
        SinhVien sv = null;
        try { // tìm được
            con = DBconnect.getConnection();
            ps = con.prepareStatement(sql);
            ps.setObject(1, id); // ? thứ nhất
            rs = ps.executeQuery();
            while (rs.next()) {
                sv = new SinhVien(rs.getInt(1), rs.getString(2));
            }
            return sv;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public List<SinhVien> findName(String name) {
        sql = "SELECT ID, NAME FROM SinhVien WHERE NAME LIKE ?";
        List<SinhVien> listSV = new ArrayList<>();
        try {
            con = DBconnect.getConnection();
            ps = con.prepareStatement(sql);
//            ps.setString(1, "%" + name + "%");
            ps.setObject(1, name);
            rs = ps.executeQuery();
            while (rs.next()) {
                SinhVien sv = new SinhVien(
                        rs.getInt(1),rs.getString(name));
                // get lấy tên cột or cột getString(name)
                listSV.add(sv);
            }
            return listSV;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
    public List<SinhVien> Sortname(){
        sql = "SELECT ID, NAME FROM SinhVien ORDER BY NAME DESC";
        List<SinhVien> listSV = new ArrayList<>();
        try {
            con = DBconnect.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                SinhVien sv = new SinhVien(rs.getInt(1), rs.getString(2)); // get lấy tên cột or cột getString(name)
                listSV.add(sv);
            }
            return listSV;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
}
