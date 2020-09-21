package app;

import dao.MySQLConnection;
import dao.impl.ImplTag;
import dao.inface.InfaceTag;

public class MainDelTag {
    public static void main(String[] args) throws Exception {
        InfaceTag tagDAO = new ImplTag(MySQLConnection.getConnection());
        tagDAO.delete(6);
    }
}
