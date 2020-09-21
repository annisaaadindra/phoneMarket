package app;

import dao.MySQLConnection;
import dao.impl.ImplAddress;
import dao.inface.InfaceAddress;
import entity.Address;

public class MainUpdAddress {
    public static void main(String[] args) throws Exception {
        InfaceAddress adrDAO = new ImplAddress(MySQLConnection.getConnection());
        Address adr = adrDAO.selectAddress(6);
        adrDAO.update(adr);
        System.out.println("------------------");
        System.out.println("**menampilkan data yang telah diupdate**");
        adrDAO.selectAddress(6);
    }
}
