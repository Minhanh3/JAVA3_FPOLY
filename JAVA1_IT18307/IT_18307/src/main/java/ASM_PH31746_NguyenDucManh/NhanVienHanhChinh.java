/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ASM_PH31746_NguyenDucManh;

/**
 *
 * @author Manhdepzai
 */
public class NhanVienHanhChinh extends NhanVien{

    public NhanVienHanhChinh() {
    }

    public NhanVienHanhChinh(String manv, String tennv, double luongCB) {
        super(manv, tennv, luongCB);
    }
    
    
    @Override
    public double getThuNhap() {
        return super.getLuongCB();
    }
    
}
