/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package INF_FACE;

import MODE.nhanvien;

/**
 *
 * @author Manhdepzai
 */
public interface Inf_nhanvien {
    public int insert(nhanvien nv);
    
    public int delete(String ma);
    
    public int update(nhanvien nv, String ma);
    
}
