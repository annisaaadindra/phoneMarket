package app;

import dao.MySQLConnection;
import dao.impl.ImplCity;
import dao.inface.InfaceCity;

public class MainDelCity {
    public static void main(String[] args) throws Exception {
        InfaceCity cityDAO = new ImplCity(MySQLConnection.getConnection());
        cityDAO.delete(5);
    }
}
