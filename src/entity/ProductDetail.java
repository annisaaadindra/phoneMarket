package entity;

import java.util.Date;

public class ProductDetail {
    private int idDetProduct;
    private Varian var;
    private Color color;
    private Product product;
    private int stok;
    private int harga;
    private Date lastUpdated;

    public ProductDetail() {
    }

    public ProductDetail(Varian var, Color color, Product product) {
        this.var = var;
        this.color = color;
        this.product = product;
    }

    public int getIdDetProduct() {
        return idDetProduct;
    }

    public void setIdDetProduct(int idDetProduct) {
        this.idDetProduct = idDetProduct;
    }

    public Varian getVar() {
        return var;
    }

    public void setVar(Varian var) {
        this.var = var;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

}
