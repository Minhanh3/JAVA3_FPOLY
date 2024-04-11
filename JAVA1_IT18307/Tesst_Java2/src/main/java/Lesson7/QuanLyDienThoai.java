/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lesson7;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Manhdepzai
 */
public class QuanLyDienThoai {
    
    List<DienThoai> listdt = new ArrayList<>();

    public List<DienThoai> fakedate() {
        listdt.add(new DienThoai("DT1", "Apple", "Đen", 256, 5500));
        listdt.add(new DienThoai("DT1", "Apple", "Đen", 256, 5500));
        listdt.add(new DienThoai("DT1", "Apple", "Đen", 256, 5500));
        listdt.add(new DienThoai("DT1", "Apple", "Đen", 256, 5500));

        return listdt;
    }

    public String them(DienThoai dt) {
        return (dt != null & listdt.add(dt)) ? "Thêm Thành công" : " Thêm thất bại";
    }

    public String ghifile(String path) {
        File file = new File(path);
        try {
            if (!file.exists()) {
                file.createNewFile();
            }
            try (FileOutputStream fos = new FileOutputStream(file); ObjectOutputStream oos = new ObjectOutputStream(fos)) {
                for (DienThoai dienThoai : listdt) {
                    oos.writeObject(dienThoai);
                }
            }
            return "Ghi Thành công";
        } catch (Exception e) {
            return "Ghi thất bại";
        }
    }

    public String mofile(String path) {
        File file = new File(path);
        try {
            if (!file.exists()) {
                file.createNewFile();
            }
            try (FileInputStream fis = new FileInputStream(file); ObjectInputStream ois = new ObjectInputStream(fis)) {
                while (fis.available() > 0) {
                    listdt.add((DienThoai) ois.readObject());
                }
            }
            return "Ghi Thành công";
        } catch (Exception e) {
            return "Ghi thất bại";
        }
    }

}
