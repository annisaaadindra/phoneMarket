package app;

import dao.MySQLConnection;
import dao.impl.ImplKecamatan;
import dao.inface.InfaceKecamatan;


public class MainUpdKecamatan {
    public static void main(String[] args) throws Exception {
        InfaceKecamatan kecDAO = new ImplKecamatan(MySQLConnection.getConnection());

        kecDAO.update(5, "Siantar Sitalasari");
        System.out.println("data berhasil diubah");
    }
}
