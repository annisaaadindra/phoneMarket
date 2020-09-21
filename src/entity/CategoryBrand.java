package entity;

public class CategoryBrand {
    private Brand brand;
    private int idCatBrand;
    private Category category;

    public CategoryBrand() {
    }

    public CategoryBrand(Brand brand, int idCatBrand, Category category) {
        this.brand = brand;
        this.idCatBrand = idCatBrand;
        this.category = category;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public int getIdCatBrand() {
        return idCatBrand;
    }

    public void setIdCatBrand(int idCatBrand) {
        this.idCatBrand = idCatBrand;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }    
}
