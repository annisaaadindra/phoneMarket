package app;

import dao.MySQLConnection;
import dao.impl.ImplVarian;
import dao.inface.InfaceVarian;

public class MainUpdVarian {
    public static void main(String[] args) throws Exception {
        InfaceVarian varDAO = new ImplVarian(MySQLConnection.getConnection());
        varDAO.update(1, "128 GB");
    }
}
