package dao.inface;

import java.util.List;

import entity.Product;

public interface InfaceProduct {
    public int addProduct(Product product);
    public int updProduct(Product product);
    public int delProduct(Product product);

    public List<Product> showAllProduct();
    public List<Product> showProductByCatBrand(int idCatBrand);
    public List<Product> showProductByCat(int idCat);
    public List<Product> showProductByBrand(int idBrand);
}
