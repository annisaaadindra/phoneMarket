package dao.inface;

import java.util.List;

import entity.ProductDetail;

public interface InfaceProductDetail {
    public int addProductDet(ProductDetail productDet);
    public int updProductDet(ProductDetail productDet);
    public int delProductDet(ProductDetail productDet);

    public List<ProductDetail> showAllProduct();
    public List<ProductDetail> showDetailsByProduct(int idProduct);
}
