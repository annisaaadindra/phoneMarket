package entity;

public class Address {
    private int idAddress;
    private String address;
    private String noTelfon;
    private String kodePos;
    private Kecamatan kec;
    private City city;
    private Province prov;
    private Customer cst;

    public Address() {
    }

    public Address(String address, String noTelfon, String kodePos, Kecamatan kec, City city, Province prov,
            Customer cst) {
        this.address = address;
        this.noTelfon = noTelfon;
        this.kodePos = kodePos;
        this.kec = kec;
        this.city = city;
        this.prov = prov;
        this.cst = cst;
    }

    public Address(int idAddress, String address, String noTelfon, String kodePos, Kecamatan kec, City city,
            Province prov, Customer cst) {
        this.idAddress = idAddress;
        this.address = address;
        this.noTelfon = noTelfon;
        this.kodePos = kodePos;
        this.kec = kec;
        this.city = city;
        this.prov = prov;
        this.cst = cst;
    }

    public int getIdAddress() {
        return idAddress;
    }

    public void setIdAddress(int idAddress) {
        this.idAddress = idAddress;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNoTelfon() {
        return noTelfon;
    }

    public void setNoTelfon(String noTelfon) {
        this.noTelfon = noTelfon;
    }

    public String getKodePos() {
        return kodePos;
    }

    public void setKodePos(String kodePos) {
        this.kodePos = kodePos;
    }

    public Kecamatan getKec() {
        return kec;
    }

    public void setKec(Kecamatan kec) {
        this.kec = kec;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public Province getProv() {
        return prov;
    }

    public void setProv(Province prov) {
        this.prov = prov;
    }

    public Customer getCst() {
        return cst;
    }

    public void setCst(Customer cst) {
        this.cst = cst;
    }

}
