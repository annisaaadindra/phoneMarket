package entity;

public class Kecamatan {
    private int idKec;
    private String nama;

    public Kecamatan() {
    }

    public Kecamatan(int idKec, String nama) {
        this.idKec = idKec;
        this.nama = nama;
    }

    public int getIdKec() {
        return idKec;
    }

    public void setIdKec(int idKec) {
        this.idKec = idKec;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
}
