package dao.inface;

import java.util.List;

import entity.CategoryBrand;

public interface InfaceCategoryBrand {
    public int addCatBrand(CategoryBrand catbrand);
    public int updCatBrand(CategoryBrand catbrand);
    public int delCatBrand(CategoryBrand catbrand);
    
    public List<CategoryBrand> showAllCatBrand();
    public List<CategoryBrand> showCatbyBrand(int idBrand);
    public List<CategoryBrand> showBrandsByCat(int idCat);
}
