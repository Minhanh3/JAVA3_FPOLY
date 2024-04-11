package View;

import java.util.List;

public class SpService implements spInterface<List<SanPham>>{

    @Override
    public String sua(int index, SanPham sanPham) {
        return sua(index, sanPham);
    }

    @Override
    public String xoa(int index) {
        return sua(index, SanPham);
    }

    @Override
    public String docFile(String path) {
    }

    @Override
    public String ghiFile(String path) {
    }

    @Override
    public String them(SanPham sanPham) {
    }
    
    
}
