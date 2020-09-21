package app;

import dao.MySQLConnection;
import dao.impl.ImplAdm;
import dao.inface.InfaceAdm;

public class MainDelAdministrator {
    public static void main(String[] args) throws Exception {
        InfaceAdm admDAO = new ImplAdm(MySQLConnection.getConnection());
        admDAO.delete(3);
    }
}
