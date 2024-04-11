package Lesson6;

import java.util.ArrayList;

public class KhachHangSevice {

    private ArrayList<KhachHang1> listkh = new ArrayList<>();

    public void insert(KhachHang1 kh) {
        this.listkh.add(kh);
    }

    public void update(int index, KhachHang1 kh) {
        this.listkh.set(index, kh);
    }

    public void delate(int index) {
        this.listkh.remove(index);
    }
    
    
}
