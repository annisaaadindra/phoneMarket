package app;

import dao.MySQLConnection;
import dao.impl.ImplProv;
import dao.inface.InfaceProv;
import entity.Province;

public class MainAddProvince {
    public static void main(String[] args) throws Exception {
        Province prov = new Province();
        prov.setProvName("Sumatera Utara");

        InfaceProv provDAO = new ImplProv(MySQLConnection.getConnection());
        provDAO.insert(prov);
    }
}
