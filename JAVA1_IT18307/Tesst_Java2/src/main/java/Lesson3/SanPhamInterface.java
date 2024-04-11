package Lesson3;

import java.util.List;

public interface SanPhamInterface {
    
    List<SanPham> fakedata();
    
    String them(SanPham sanPham);
    
    String sua(int index, SanPham sanPham);
    
    String xoa(int index);
    
    String docfile(String path);
    
    String ghifile(String path);
    
}
