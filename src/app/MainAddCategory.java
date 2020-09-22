package app;

import dao.MySQLConnection;
import dao.impl.ImplCategory;
import dao.inface.InfaceCategory;
import entity.Category;

public class MainAddCategory {
    public static void main(String[] args) throws Exception {
        InfaceCategory catDAO = new ImplCategory(MySQLConnection.getConnection());
        Category cat = new Category();
        cat.setCatName("Charger");

        catDAO.addCategory(cat);
    }
}
