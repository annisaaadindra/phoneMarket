package entity;

public class DeliveryFee {
    private int id;
    private int deliveryFee;
    private Courier courier;
    private City city;

    public DeliveryFee() {
    }

    public DeliveryFee(int id, int deliveryFee, Courier courier, City city) {
        this.id = id;
        this.deliveryFee = deliveryFee;
        this.courier = courier;
        this.city = city;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDeliveryFee() {
        return deliveryFee;
    }

    public void setDeliveryFee(int deliveryFee) {
        this.deliveryFee = deliveryFee;
    }

    public Courier getCourier() {
        return courier;
    }

    public void setCourier(Courier courier) {
        this.courier = courier;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

}
