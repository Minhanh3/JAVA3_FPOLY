package Lesson2;

import java.util.List;

public interface NhanVienInterFace {

    List<NhanVien> fakeData();

    String xoa(int index);

    String sua(int index, NhanVien nhanVien);

    String docFile(String path);

    String ghiFile(String path);

    String them(NhanVien nhanVien);
}
