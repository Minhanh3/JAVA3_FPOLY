package Manhdztesst;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class SinhVienService implements SVInterFace {

    @Override
    public String ghiFile(String path) {
        File file = new File(path);
        try {
            if (!file.exists()) {
                file.createNewFile();
            }
            try (FileOutputStream fos = new FileOutputStream(file); 
                    ObjectOutputStream oos = new ObjectOutputStream(fos)) {
                for (SinhVien sinhVien : listService) {
                    oos.writeObject(sinhVien);
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
                    listService.add((SinhVien) ois.readObject());
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
            return "Xoa thanh cong";
        }
        return "Xoa that bai";
    }

    @Override
    public List<SinhVien> fakeData() {
        listService.add(new SinhVien("Nv2", "manjdz", "Nu", 23));
        listService.add(new SinhVien("Nv2", "manjdz", "Nu", 53));
        listService.add(new SinhVien("Nv2", "manjdz", "Nu", 20));
        listService.add(new SinhVien("Nv2", "manjdz", "Nu", 13));
        listService.add(new SinhVien("Nv2", "manjdz", "Nu", 2));
        return listService;
    }

    private List<SinhVien> listService = new ArrayList<>();
}
