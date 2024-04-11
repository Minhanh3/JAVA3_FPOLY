package Lesson4;

import Manhdztesst.SinhVien;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class ThucVatServicelmpl implements ThucVatService {

    private List<ThucVat> listService = new ArrayList<>();

    @Override
    public List<ThucVat> fakedata() {
        listService.add(new ThucVat("TV2", "Cây", 32, "Cỏ"));
        listService.add(new ThucVat("TV2", "Cây", 32, "Cỏ"));
        listService.add(new ThucVat("TV2", "Cây", 32, "Cỏ"));
        listService.add(new ThucVat("TV2", "Cây", 32, "Cỏ"));
        
        return listService;
    }

    @Override
    public String them(ThucVat thucVat) {
        return (thucVat != null && listService.add(thucVat)) ? "Thêm thành công" : "Thêm thất bại";
    }

    @Override
    public String sua(int index, ThucVat thucVat) {
        if (index >= 0) {
            if (thucVat != null) {
                listService.set(index, thucVat);
                return "Sửa thành công";
            }
            return "Vui lòng nhập thông tin update";
        }
        return "Vui lòng chọn vị trí update";
    }

    @Override
    public String xoa(int index) {
        return (index >= 0 && listService.remove(index) != null ) ? "Xóa thành công" : "Xóa thất bại " ;
    }

    @Override
    public String docfile(String File) {
        File file = new File(File);
        try {
            if (!file.exists()) {
                return "Không tim thấy File" ;
            }
            try (FileInputStream fis = new FileInputStream(file); ObjectInputStream ois = new ObjectInputStream(fis)) {
                while(fis.available() > 0 ){
                    listService.add((ThucVat) ois.readObject());
                }
            }
            return "Đọc file thành công";
        } catch (Exception e) {
            return "Đọc file thất bại";
        }
    }

    @Override
    public String ghifile(String File) {
        File file = new File(File);
        try {
            if(!file.exists()){
                file.createNewFile();
            }
            try(FileOutputStream fos = new FileOutputStream(file); ObjectOutputStream oos = new ObjectOutputStream(fos)){
                for (ThucVat thucVat : listService) {
                    oos.writeObject(thucVat);
                }
            }
             return "Ghi file thành công";
        } catch (IOException e) {
            return "Ghi thất bại";
        }
    }

}
