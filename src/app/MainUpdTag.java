package app;

import dao.MySQLConnection;
import dao.impl.ImplTag;
import dao.inface.InfaceTag;

public class MainUpdTag {
    public static void main(String[] args) throws Exception {
        InfaceTag tagDAO = new ImplTag(MySQLConnection.getConnection());
        tagDAO.update(1, "Xiaomi murah");
    }
}
