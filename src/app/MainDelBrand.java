package app;

import dao.MySQLConnection;
import dao.impl.ImplBrand;
import dao.inface.InfaceBrand;

public class MainDelBrand {
    public static void main(String[] args) throws Exception {
        InfaceBrand brandDAO = new ImplBrand(MySQLConnection.getConnection());
        brandDAO.delBrand(5);
    }
}
