package entity;

import java.util.Date;

public class Order {
    private int idOrder;
    private Customer cst;
    private Address adr;
    private Date dateOrder;
    private int totalHarga;

    public Order() {
    }

    public Order(Customer cst, Address adr, Date dateOrder, int totalHarga) {
        this.cst = cst;
        this.adr = adr;
        this.dateOrder = dateOrder;
        this.totalHarga = totalHarga;
    }

    public int getIdOrder() {
        return idOrder;
    }

    public void setIdOrder(int idOrder) {
        this.idOrder = idOrder;
    }

    public Customer getCst() {
        return cst;
    }

    public void setCst(Customer cst) {
        this.cst = cst;
    }

    public Address getAdr() {
        return adr;
    }

    public void setAdr(Address adr) {
        this.adr = adr;
    }

    public Date getDateOrder() {
        return dateOrder;
    }

    public void setDateOrder(Date dateOrder) {
        this.dateOrder = dateOrder;
    }

    public int getTotalHarga() {
        return totalHarga;
    }

    public void setTotalHarga(int totalHarga) {
        this.totalHarga = totalHarga;
    }
}
