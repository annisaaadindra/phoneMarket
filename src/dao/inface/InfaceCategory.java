package dao.inface;

import java.util.List;

import entity.Category;

public interface InfaceCategory {
    public int addCategory(Category cat) throws Exception;
    public int updateCategory(Category cat) throws Exception;
    public int deleteCategory(int idCat) throws Exception;

    public Category selectOneCat (int idCat) throws Exception;
    public List<Category> showAllCategory() throws Exception;
}
