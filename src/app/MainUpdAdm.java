package app;

import dao.MySQLConnection;
import dao.impl.ImplAdm;
import dao.inface.InfaceAdm;

public class MainUpdAdm {
    public static void main(String[] args) throws Exception {
        InfaceAdm admDAO = new ImplAdm(MySQLConnection.getConnection());
        admDAO.update(3, "sjakn@dsjn.cx", "Annisaa", "uhj09876tgh");
    }
}
