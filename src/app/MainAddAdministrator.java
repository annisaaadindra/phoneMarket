package app;

import dao.MySQLConnection;
import dao.impl.ImplAdm;
import dao.inface.InfaceAdm;
import entity.Administrator;

public class MainAddAdministrator {
    public static void main(String[] args) throws Exception {
        Administrator adm = new Administrator("Ans", "yik@fuh.e", "98765ri89");

        InfaceAdm admDAO = new ImplAdm(MySQLConnection.getConnection());
        admDAO.insert(adm);
    }
}
