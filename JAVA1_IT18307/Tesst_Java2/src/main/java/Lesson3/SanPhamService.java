package Lesson3;

import java.util.ArrayList;
import java.util.List;

public class SanPhamService implements SanPhamInterface {

    List<SanPham> listsp = new ArrayList<>();

    @Override
    public List<SanPham> fakedata() {
        listsp.add(new SanPham("Mac", "LT52", 25000, "laptop"));
        listsp.add(new SanPham("Mac", "LT52", 25000, "laptop"));
        listsp.add(new SanPham("Mac", "LT52", 25000, "laptop"));
        listsp.add(new SanPham("Mac", "LT52", 25000, "laptop"));
        return listsp;
    }

    @Override
    public String them(SanPham sanPham) {
        return (sanPham != null && listsp.add(sanPham)) ? " Them thanh công" : " thêm thất bại";
    }

    @Override
    public String sua(int index, SanPham sanPham) {
        return (index >= 0 && sanPham != null)? "Sua thanh cong" : "Sua that bai"; 
    }

    @Override
    public String xoa(int index) {
        if (index >= 0) {
            listsp.remove(index);
            return "Xoa thanh cong";
        }
        return "XOa that bai";
    }

    @Override
    public String docfile(String path) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String ghifile(String path) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
