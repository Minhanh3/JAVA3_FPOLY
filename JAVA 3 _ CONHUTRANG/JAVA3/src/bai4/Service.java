/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai4;

import java.util.ArrayList;

/**
 *
 * @author Manhdepzai
 */
public class Service {

    private ArrayList<SanPham> listSV = new ArrayList<>();

    public ArrayList<SanPham> fakedata() {
        listSV.add(new SanPham("SP1", "Dầu gội", "chai", 12000, "Sunsik"));
        listSV.add(new SanPham("SP2", "Sữa tam", "thung", 16000, "Sunsik"));
        listSV.add(new SanPham("SP3", "Sữa rửa mặt", "lon", 17000, "Sunsik"));
        listSV.add(new SanPham("SP4", "Dau xả", "lọ", 12800, "Sunsik"));
        listSV.add(new SanPham("SP5", "Dầu gội", "chai", 12080, "Sunsik"));
        return listSV;
    }
}
