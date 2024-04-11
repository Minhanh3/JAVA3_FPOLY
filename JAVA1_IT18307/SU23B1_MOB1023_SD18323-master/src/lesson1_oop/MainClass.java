package lesson1_oop;

import lesson1_demo.Samsung;

public class MainClass {
    public static void main(String[] args) {
        // Samsung galaxy; // Khai báo biến galaxy có kiểu Samsung
        Phone galaxy; // Khai báo biến galaxy có kiểu Phone
        galaxy = new Samsung(); // Khởi tạo đối tượng có kiểu Samsung, lưu vào biến galaxy
        galaxy.setNsx("Samsung");
        galaxy.setImei("Ss01");
        galaxy.setGia(150000000);
//        
//        System.out.println(
//            galaxy.getNsx() + " - " +
//            galaxy.getImei()+ " - " +
//            galaxy.getGia()
//        );

        Samsung p = new Samsung();
        p.setNsx("Oppo");
        p.setImei("PH4");
        p.setGia(7000);
        p.xuatThongTin();
        p.xuatThongTin("Note");
    }
}
