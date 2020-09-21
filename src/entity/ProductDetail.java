package entity;

public class ProductDetail {
    private int idDetProduct;
    private Varian var;
    private Color color;
    private Product product;
    private int stok;

    public ProductDetail() {
    }

    public ProductDetail(int idDetProduct, Product product, int stok) {
        this.idDetProduct = idDetProduct;
        this.product = product;
        this.stok = stok;
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
}
