
package lab1;

import java.util.Scanner;

public class Ex2MainClass {
    public static void main(String [] args){
        Scanner s = new Scanner(System.in);
        
        for (int i = 0; i < 3; i++) {
            Product p1;
            if (i != 0) {
                p1 = new Product();
            }else{
                p1 = new NoTaxProduct();
            }
            System.out.print("Name: ");
            String st = s.nextLine();
            p1.setName(st);
            
            System.out.print("Price: ");
            float f = s.nextFloat();
            s.nextLine();
            
            p1.setPrice(f);
            
            System.out.printf("Name: %s - Price: % .2f - Tax: %.2f \n" ,
                    p1.getName(), p1.getPrice(),p1.getImportTax());
        }
    }
}
