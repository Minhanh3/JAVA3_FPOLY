package Lesson4;

import java.util.List;

public interface ThucVatService {
    
     List<ThucVat> fakedata();
     
     String them(ThucVat thucVat);
     
     String sua(int index, ThucVat thucVat);
     
     String xoa(int index);
     
     String docfile(String File);
     
     String ghifile(String File);
     
}
