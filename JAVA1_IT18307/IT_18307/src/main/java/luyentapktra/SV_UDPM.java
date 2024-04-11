/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package luyentapktra;

/**
 *
 * @author Manhdepzai
 */
public class SV_UDPM extends SinhVien{
    private double DiemJava;

    public SV_UDPM() {
    }

    public SV_UDPM(double DiemJava) {
        this.DiemJava = DiemJava;
    }

    public SV_UDPM( int MaSV, String Ten, int NamSinh, double DiemCsharp,double DiemJava) {
        super(MaSV, Ten, NamSinh, DiemCsharp);
        this.DiemJava = DiemJava;
    }

    public double getDiemJava() {
        return DiemJava;
    }

    public void setDiemJava(double DiemJava) {
        this.DiemJava = DiemJava;
    }

    @Override
    public void inThongTin() {
        super.inThongTin(); 
        System.out.println("Diem java:      " + getDiemJava());
    }
    
}
