package entity;

public class Bill {
    private int idTagihan;
    private Order order;
    private DeliveryFee deliveryFee;
    private int totalBayar;

    public Bill() {
    }

    public Bill(Order order, DeliveryFee deliveryFee, int totalBayar) {
        this.order = order;
        this.deliveryFee = deliveryFee;
        this.totalBayar = totalBayar;
    }

    public int getIdTagihan() {
        return idTagihan;
    }

    public void setIdTagihan(int idTagihan) {
        this.idTagihan = idTagihan;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public DeliveryFee getDeliveryFee() {
        return deliveryFee;
    }

    public void setDeliveryFee(DeliveryFee deliveryFee) {
        this.deliveryFee = deliveryFee;
    }

    public int getTotalBayar() {
        return totalBayar;
    }

    public void setTotalBayar() {
        totalBayar = order.getTotalHarga() + deliveryFee.getDeliveryFee();
    }

    
}
