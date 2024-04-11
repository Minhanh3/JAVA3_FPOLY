/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Lesson5;

import java.util.List;

/**
 *
 * @author Manhdepzai
 */
public interface KhachHanginterface {
    
    List<KhachHang> fakedata();
    
    String them(KhachHang khachHang);
    
    String sua(int index,KhachHang khachHang);
    
    String xoa(int index);
    
    String ghifile(String file);
    
    String docfile(String file);
    
}
