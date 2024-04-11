/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package View;

/**
 *
 * @author Manhdepzai
 */
public interface spInterface<T> {
    String sua(int index , SanPham sanPham);
    
    String xoa(int index);
    
    String docFile(String path);
    
    String ghiFile(String path);
    
    String them(SanPham sanPham);
}
