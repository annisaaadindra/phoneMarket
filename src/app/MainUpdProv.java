package app;

import dao.MySQLConnection;
import dao.impl.ImplProv;
import dao.inface.InfaceProv;

public class MainUpdProv {
    public static void main(String[] args) throws Exception {
        InfaceProv provDAO = new ImplProv(MySQLConnection.getConnection());
        provDAO.update(4, "Sumatera Utara");
    }
}
