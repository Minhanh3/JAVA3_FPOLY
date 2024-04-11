/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vacxin;

/**
 *
 * @author Manhdepzai
 */
public class VaccineVN extends Vaccine{
    private String QuocGia;

    public VaccineVN() {
    }

    public VaccineVN(String QuocGia) {
        this.QuocGia = QuocGia;
    }

    public VaccineVN( String MaVC, String tenVC, String NgayHetHan, Float ThoiGianTacDung, String QuocGia) {
        super(MaVC, tenVC, NgayHetHan, ThoiGianTacDung);
        this.QuocGia = QuocGia;
    }

    public String getQuocGia() {
        return QuocGia;
    }

    public void setQuocGia(String QuocGia) {
        this.QuocGia = QuocGia;
    }

    
    @Override
    public void inThongTin() {
        super.inThongTin(); 
        System.out.println("Quoc Gia:" + getQuocGia());
    }
}
