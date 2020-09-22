package app;

import dao.MySQLConnection;
import dao.impl.ImplCategory;
import dao.inface.InfaceCategory;

public class MainDelCategory {
    public static void main(String[] args) throws Exception {
        InfaceCategory catDAO = new ImplCategory(MySQLConnection.getConnection());
        catDAO.deleteCategory(3);
    }
}
