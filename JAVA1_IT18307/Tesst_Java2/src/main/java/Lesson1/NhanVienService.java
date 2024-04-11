package Lesson1;

import Manhdztesst.SinhVien;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Manhdepzai
 */
public class NhanVienService implements NhanVienInterFace {

    @Override
    public String ghiFile(String path) {
        File file = new File(path);
        try {
            if (!file.exists()) {
                file.createNewFile();
            }
            try (FileOutputStream fos = new FileOutputStream(file);
                ObjectOutputStream oos = new ObjectOutputStream(fos)) {
                for (NhanVien nhanVien : listService) {
                    oos.writeObject(nhanVien);
                }
            }
            return "Ghi file thành công";
        } catch (Exception e) {
            return "Ghi file thất bại";
        }
    }

    @Override
    public String docFile(String path) {
        File file = new File(path);
        try {
            if (!file.exists()) {
                return "Không tìm thấy file";
            }
            try (FileInputStream fis = new FileInputStream(file); ObjectInputStream ois = new ObjectInputStream(fis)) {
                while (fis.available() > 0) {
                    listService.add((NhanVien) ois.readObject());
                }
            }
            return "Mở file thành công";
        } catch (Exception e) {
            return "Mở file thất bại";
        }
    }

    @Override
    public String xoa(int index) {
        if (index >= 0) {
            listService.remove(index);
            return "XÓa thành công";
        }
        return "Xóa thất bại";
    }
    public List<NhanVien> listService = new ArrayList<>();

    @Override
    public List<NhanVien> fakeData() {
        listService.add(new NhanVien("NV3", "NgManh", "Nữ", 14));
        listService.add(new NhanVien("NV7", "NgManh gg", "Nữ", 54));
        listService.add(new NhanVien("NV6", "NgManh hh", "Nam", 10));
        listService.add(new NhanVien("NV5", "NgManh jj", "Nữ", 14));
        listService.add(new NhanVien("NV4", "NgManh kk", "Nam", 12));
        return listService;
    }

    @Override
    public String them(NhanVien nhanVien) {
        return (nhanVien != null && listService.add(nhanVien)) ? " thêm Thành công" : " thêm thất bại";
    }

}
