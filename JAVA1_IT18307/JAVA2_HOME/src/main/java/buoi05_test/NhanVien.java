package buoi05_test;
public class NhanVien {
    private String ten;
    private String gia;
    private String soLuong;
    private int tinhTrang;
    private String danhMuc;

    public NhanVien() {
    }

    public NhanVien(String ten, String gia, String soLuong, int tinhTrang, String danhMuc) {
        this.ten = ten;
        this.gia = gia;
        this.soLuong = soLuong;
        this.tinhTrang = tinhTrang;
        this.danhMuc = danhMuc;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getGia() {
        return gia;
    }

    public void setGia(String gia) {
        this.gia = gia;
    }

    public String getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(String soLuong) {
        this.soLuong = soLuong;
    }

    public int getTinhTrang() {
        return tinhTrang;
    }

    public void setTinhTrang(int tinhTrang) {
        this.tinhTrang = tinhTrang;
    }

    public String getDanhMuc() {
        return danhMuc;
    }

    public void setDanhMuc(String danhMuc) {
        this.danhMuc = danhMuc;
    }
    
    
}
