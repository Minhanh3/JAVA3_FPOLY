package Lesson6;

public class KhachHang1 {

    private String maKH, tenKH;
    private int gioitinh;
    private String sdt;
    private String nhomKH;

    public KhachHang1() {
    }

    public KhachHang1(String maKH, String tenKH, int gioitinh, String sdt, String nhomKH) {
        this.maKH = maKH;
        this.tenKH = tenKH;
        this.gioitinh = gioitinh;
        this.sdt = sdt;
        this.nhomKH = nhomKH;
    }

    public String getMaKH() {
        return maKH;
    }

    public void setMaKH(String maKH) {
        this.maKH = maKH;
    }

    public String getTenKH() {
        return tenKH;
    }

    public void setTenKH(String tenKH) {
        this.tenKH = tenKH;
    }

    public int getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(int gioitinh) {
        this.gioitinh = gioitinh;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getNhomKH() {
        return nhomKH;
    }

    public void setNhomKH(String nhomKH) {
        this.nhomKH = nhomKH;
    }

    public int giamgia() {
        if (this.nhomKH == "VIP") {
            return 10;
        }
        if (this.nhomKH == "Thân Thiết") {
            return 5;
        }
        return 8;
    };
}
