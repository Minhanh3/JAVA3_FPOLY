package lesson8_exception;

public class MainClass {
    public static void main(String[] args) {
        int a = 5, b = 0;
        
        try {
            int kq = a / b;
            System.out.println(kq);
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
        
        System.out.println("Xử lý hoàn tất.");
        
    }
}
