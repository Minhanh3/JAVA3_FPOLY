/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mode;

/**
 *
 * @author Manhdepzai
 */
public class Sach {
    int id;
    String masach;
    String tensach;
    String theloai;
    double dongia;

    public Sach() {
    }

    public Sach(int id, String masach, String tensach, String theloai, double dongia) {
        this.id = id;
        this.masach = masach;
        this.tensach = tensach;
        this.theloai = theloai;
        this.dongia = dongia;
    }
    
    public Sach( String masach, String tensach, String theloai, double dongia) {
        this.id = id;
        this.masach = masach;
        this.tensach = tensach;
        this.theloai = theloai;
        this.dongia = dongia;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMasach() {
        return masach;
    }

    public void setMasach(String masach) {
        this.masach = masach;
    }

    public String getTensach() {
        return tensach;
    }

    public void setTensach(String tensach) {
        this.tensach = tensach;
    }

    public String getTheloai() {
        return theloai;
    }

    public void setTheloai(String theloai) {
        this.theloai = theloai;
    }

    public double getDongia() {
        return dongia;
    }

    public void setDongia(double dongia) {
        this.dongia = dongia;
    }
    
    public Object[] toDataRow(){
        return new Object[]{
          id , masach,tensach,theloai,dongia  
        };
    }
}
