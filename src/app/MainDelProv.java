package app;

import dao.MySQLConnection;
import dao.impl.ImplProv;
import dao.inface.InfaceProv;

public class MainDelProv {
    public static void main(String[] args) throws Exception {
        InfaceProv provDAO = new ImplProv(MySQLConnection.getConnection());
        provDAO.delete(3);
    }
}
