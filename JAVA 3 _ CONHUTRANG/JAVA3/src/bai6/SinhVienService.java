package bai6;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class SinhVienService {

    Connection con = null; // biên để kết nối
    PreparedStatement ps = null;
    String sql = null;
    ResultSet rs = null; // ket qua select

    public List<SinhVien> getAll() { // lay het dl to database
        sql = "SELECT id , ma_sinh_vien , ten_sinh_vien,tuoi ,ky_hoc,nganh_hoc, diem_trung_binh, gioi_tinh from sinh_vien";
        List<SinhVien> listSV = new ArrayList<>();
        try { // lay duoc dl
            con = DBconnect.getConnection(); // ket noi database
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            //ket noi select la: resultSet
            while (rs.next()) {// doc tung dong den het rs thi dừng
//                SinhVien sv = new SinhVien(
//                        rs.getInt(1),
//                        rs.getString(2),
//                        rs.getInt(3),
//                        rs.getInt(4),
//                        rs.getString(5),
//                        rs.getFloat(6),
//                        rs.getInt(7));
//                listSV.add(sv);
            }
            return listSV;
        } catch (Exception e) { // khong lay duoc dl
            e.printStackTrace();
            return null;
        }
    }
//
//    ;
//    public int addSinhVien(SinhVien sv) {
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
//    }
//
//    public int deleteSinhVien(int id) { // đối số truyền vào luôn là khóa chính
//        sql = "delete from sinhvien where id=?";
//        try { // xóa đươc
//            con = DBconnect.getConnection();
//            ps = con.prepareStatement(sql);
//            ps.setObject(1, id); // ? thứ nhất : cột số 1 object
//            return ps.executeUpdate();
//        } catch (Exception e) {
//            e.printStackTrace();
//            return 0;
//        }
//    }
//
//    public int updateSinhVien(SinhVien sv, int id) {
//        sql = "update sinhvien set name? where id=? ";
//        try {
//            con = DBconnect.getConnection();
//            ps = con.prepareStatement(sql);
//            ps.setObject(1, sv.getName()); // dấu ? thứ nhất ở trên sql kia 
//            ps.setObject(2, id);
//            return ps.executeUpdate();
//        } catch (Exception e) {
//            e.printStackTrace();
//            return 0;
//        }
//    }
//
//    public SinhVien getSinhVien(int id) {
//        // tìm sv theo khóa chính
//        sql = "select id, name from sinhvien where id = ?";
//        SinhVien sv = null;
//        try { // tìm được
//            con = DBconnect.getConnection();
//            ps = con.prepareStatement(sql);
//            ps.setObject(1, id); // ? thứ nhất
//            while (rs.next()) {                
//                sv = new SinhVien(rs.getInt(1), rs.getString(2));
//            }
//            return sv;
//        } catch (Exception e) {
//            e.printStackTrace();
//            return null;
//        }
//    }
}
