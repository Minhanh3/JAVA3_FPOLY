/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lesson5;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Manhdepzai
 */
public class KhachHangService implements KhachHanginterface {

    private List<KhachHang> KHService = new ArrayList<>();

    @Override
    public List<KhachHang> fakedata() {
        KHService.add(new KhachHang("Kh3", "Manh", 0, "Vip"));
        KHService.add(new KhachHang("Kh4", "Manhz", 1, "Thân Thiết"));
        KHService.add(new KhachHang("Kh5", "Manhk", 1, "Vip"));
        KHService.add(new KhachHang("Kh6", "Manhy", 0 ,  "Mới"));
        return KHService;
    }

    @Override
    public String them(KhachHang khachHang) {
        return (khachHang != null && KHService.add(khachHang)) ? "Thêm thành công" : " thêm thất bại";
    }

    @Override
    public String sua(int index, KhachHang khachHang) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String xoa(int index) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String ghifile(String file) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String docfile(String file) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
