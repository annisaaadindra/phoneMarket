package app;

import dao.MySQLConnection;
import dao.impl.ImplCategory;
import dao.inface.InfaceCategory;
import entity.Category;

public class MainUpdCategory {
    public static void main(String[] args) throws Exception {
        InfaceCategory catDAO = new ImplCategory(MySQLConnection.getConnection());
        Category cat = new Category();
        cat.setIdCat(2);
        cat.setCatName("Power bank");

        catDAO.updateCategory(cat);
    }
}
