package lesson1_oop;

public class Phone {
    private String nsx;
    private String imei;
    private double gia;

    public Phone() {
    }

    public Phone(String nsx, String imei, double gia) {
        this.nsx = nsx;
        this.imei = imei;
        this.gia = gia;
    }
    
    

    public String getNsx() {
        return nsx;
    }

    public void setNsx(String nsx) {
        this.nsx = nsx;
    }

    public String getImei() {
        return imei;
    }

    public void setImei(String imei) {
        this.imei = imei;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }
    
    public void xuatThongTin()
    {
        System.out.println(
            this.getNsx() + " - " + 
            this.getImei() + " - " + 
            this.getGia()
        );
    }
}
