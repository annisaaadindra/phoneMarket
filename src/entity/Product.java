package entity;

public class Product {
    private int idProduct;
    private String nama;
    private CategoryBrand catbrand;

    public Product() {
    }

    public Product(int idProduct, String nama) {
        this.idProduct = idProduct;
        this.nama = nama;
    }

    public int getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(int idProduct) {
        this.idProduct = idProduct;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public CategoryBrand getCatbrand() {
        return catbrand;
    }

    public void setCatbrand(CategoryBrand catbrand) {
        this.catbrand = catbrand;
    }
}
