package app;

import dao.MySQLConnection;
import dao.impl.ImplVarian;
import dao.inface.InfaceVarian;

public class MainDelVarian {
    public static void main(String[] args) throws Exception {
        InfaceVarian varDAO = new ImplVarian(MySQLConnection.getConnection());
        varDAO.delete(5);
    }
}
