package service;

import java.util.List;
import model.NhanVien;

public interface NhanVienService {
    List<NhanVien> getList();
    
    NhanVien addNhanVien(String maNV, String tenNV, boolean gioiTinh, Integer thamNien);
    
    NhanVien fixNhanVien(int index, String maNV, String tenNV, boolean gioiTinh, Integer thamNien);
    
    void deleteNhanVien(int index);
}
