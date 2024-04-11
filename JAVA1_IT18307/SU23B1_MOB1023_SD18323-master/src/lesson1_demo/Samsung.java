package lesson1_demo;

import lesson1_oop.Phone;

public class Samsung extends Phone {
    public void xuatThongTin()
    {
//        super.xuatThongTin();
        System.out.println(
            "Samsung - " + 
            this.getImei() + " - " + 
            this.getGia()
        );
    }
    
    public void xuatThongTin(String dongSP)
    {
        System.out.println(
            "Samsung - " + dongSP + " - " +
            this.getImei() + " - " + 
            this.getGia()
        );
    }
}
