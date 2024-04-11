
package Lesson1;

import java.util.List;


public interface NhanVienInterFace {
   
    String ghiFile(String path);
    
    String docFile(String path);
    
    String xoa(int index);
    
    List<NhanVien> fakeData();
    
    String them(NhanVien nhanVien);
}
