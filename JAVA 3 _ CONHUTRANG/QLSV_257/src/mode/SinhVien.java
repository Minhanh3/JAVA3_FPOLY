package mode;

/**
 *
 * @author Manhdepzai
 */
public class SinhVien {

    int id;
    private String ma;
    String ten;
    int tuoi;
    int hocky;
    String nganhhoc;
    float diemtb;
    boolean gioitinh;

    public SinhVien() {
    }

    public SinhVien(int id, String ma, String ten, int tuoi, int hocky, String nganhhoc, float diemtb, boolean gioitinh) {
        this.id = id;
        this.ma = ma;
        this.ten = ten;
        this.tuoi = tuoi;
        this.hocky = hocky;
        this.nganhhoc = nganhhoc;
        this.diemtb = diemtb;
        this.gioitinh = gioitinh;
    }

    public SinhVien(String ma, String ten, int tuoi, int hocky, String nganhhoc, float diemtb, boolean gioitinh) {
        this.id = id;
        this.ma = ma;
        this.ten = ten;
        this.tuoi = tuoi;
        this.hocky = hocky;
        this.nganhhoc = nganhhoc;
        this.diemtb = diemtb;
        this.gioitinh = gioitinh;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public int getHocky() {
        return hocky;
    }

    public void setHocky(int hocky) {
        this.hocky = hocky;
    }

    public String getNganhhoc() {
        return nganhhoc;
    }

    public void setNganhhoc(String nganhhoc) {
        this.nganhhoc = nganhhoc;
    }

    public float getDiemtb() {
        return diemtb;
    }

    public void setDiemtb(float diemtb) {
        this.diemtb = diemtb;
    }

    public boolean isGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(boolean gioitinh) {
        this.gioitinh = gioitinh;
    }

    public Object[] toDataRow() {
        return new Object[]{
            this.id, this.ma, this.ten, this.tuoi, this.hocky, this.nganhhoc, this.diemtb, this.gioitinh};
    }
}
