package entity;

public class RefKecamatan {
    private int idKec;
    private String kecName;

    public RefKecamatan() {
    }

    public RefKecamatan(int idKec, String kecName) {
        this.idKec = idKec;
        this.kecName = kecName;
    }

    public int getIdKec() {
        return idKec;
    }

    public void setIdKec(int idKec) {
        this.idKec = idKec;
    }

    public String getKecName() {
        return kecName;
    }

    public void setKecName(String kecName) {
        this.kecName = kecName;
    }
}
