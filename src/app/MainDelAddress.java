package app;

import dao.MySQLConnection;
import dao.impl.ImplAddress;
import dao.inface.InfaceAddress;

public class MainDelAddress {
    public static void main(String[] args) throws Exception {
        InfaceAddress addrDAO = new ImplAddress(MySQLConnection.getConnection());
        addrDAO.delete(5);
    }
}
