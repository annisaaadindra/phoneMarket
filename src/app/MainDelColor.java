package app;

import dao.MySQLConnection;
import dao.impl.ImplColor;
import dao.inface.InfaceColor;

public class MainDelColor {
    public static void main(String[] args) throws Exception {
        InfaceColor colorDAO = new ImplColor(MySQLConnection.getConnection());
        colorDAO.delColor(7);
    }
}
