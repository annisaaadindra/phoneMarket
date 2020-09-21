package entity;

public class Province {
    private int idProv;
    private String provName;

    public Province() {
    }

    public Province(int idProv, String provName) {
        this.idProv = idProv;
        this.provName = provName;
    }

    public int getIdProv() {
        return idProv;
    }

    public void setIdProv(int idProv) {
        this.idProv = idProv;
    }

    public String getProvName() {
        return provName;
    }

    public void setProvName(String provName) {
        this.provName = provName;
    }

    
}
