package app;

import dao.MySQLConnection;
import dao.impl.ImplCustomer;
import dao.inface.InfaceCustomer;

public class MainDelCustomer {
    public static void main(String[] args) throws Exception {
        InfaceCustomer cstDAO = new ImplCustomer(MySQLConnection.getConnection());
        cstDAO.delete(3);
    }
}
