/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ktra1;

/**
 *
 * @author Manhdepzai
 */
public class GiaoVien {
    private int id;
    private String ten;
    private double sogioday;

    public GiaoVien() {
    }

    public GiaoVien(int id, String ten, double sogioday) {
        this.id = id;
        this.ten = ten;
        this.sogioday = sogioday;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public double getSogioday() {
        return sogioday;
    }

    public void setSogioday(double sogioday) {
        this.sogioday = sogioday;
    }
    public void Show(){
        System.out.printf("ID: %d \t Ten: %s \t So gio day: %.1f \n",id ,ten, sogioday);
    }
}
