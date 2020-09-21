package app;

import dao.MySQLConnection;
import dao.impl.ImplCity;
import dao.inface.InfaceCity;

public class MainUpdCity {
    public static void main(String[] args) throws Exception {
        InfaceCity cityDAO = new ImplCity(MySQLConnection.getConnection());
        cityDAO.update(1, "Jakarta Selatan");
        
    }
}
