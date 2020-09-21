package entity;

public class City {
    private int idKota;
    private String namaKota;

    public City() {
    }

    public City(int idKota, String namaKota) {
        this.idKota = idKota;
        this.namaKota = namaKota;
    }

    public int getIdKota() {
        return idKota;
    }

    public void setIdKota(int idKota) {
        this.idKota = idKota;
    }

    public String getNamaKota() {
        return namaKota;
    }

    public void setNamaKota(String namaKota) {
        this.namaKota = namaKota;
    }

   
}
