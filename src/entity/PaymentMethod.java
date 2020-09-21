package entity;

public class PaymentMethod {
    private int method;
    private String nama;

    public PaymentMethod() {
    }

    public PaymentMethod(int method, String nama) {
        this.method = method;
        this.nama = nama;
    }

    public int getMethod() {
        return method;
    }

    public void setMethod(int method) {
        this.method = method;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    
}
