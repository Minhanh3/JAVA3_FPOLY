package Lesson2;

import java.util.ArrayList;
import java.util.List;

public class NhanVienService implements NhanVienInterFace {

    private List<NhanVien> listService = new ArrayList<>();

    @Override
    public List<NhanVien> fakeData() {
        listService.add(new NhanVien("Manh yy", "Nv2", 20000, true, 20));
        listService.add(new NhanVien("Manh tt", "Nv3", 60000, false, 25));
        listService.add(new NhanVien("Manh hh", "Nv4", 40000, true, 21));
        listService.add(new NhanVien("Manh gg", "Nv5", 50000, false, 23));
        return listService;
    }

    @Override
    public String xoa(int index) {
        return (index >= 0 && listService.remove(index) != null) ? "Xoa thanh cong" : "Xoa That bai";
    }

    @Override
    public String sua(int index, NhanVien nhanVien) {
        return (index >= 0 && nhanVien != null) ? " Sua thanh cong" : " Sua that bai";
    }

    @Override
    public String docFile(String path) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String ghiFile(String path) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String them(NhanVien nhanVien) {
        return (nhanVien != null && listService.add(nhanVien)) ? " Them thanh cong" : " Them that bai";
    }

}
