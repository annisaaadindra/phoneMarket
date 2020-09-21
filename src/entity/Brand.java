package entity;

public class Brand {
    public int idMerk;
    public String nama;

    public Brand() {
    }

    public Brand(int idMerk, String nama) {
        this.idMerk = idMerk;
        this.nama = nama;
    }

    public int getIdMerk() {
        return idMerk;
    }

    public void setIdMerk(int idMerk) {
        this.idMerk = idMerk;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
}
