package app;

import dao.MySQLConnection;
import dao.impl.ImplKecamatan;
import dao.inface.InfaceKecamatan;

public class MainDelKecamatan {
    public static void main(String[] args) throws Exception {
        InfaceKecamatan kecDAO = new ImplKecamatan(MySQLConnection.getConnection());
        kecDAO.delete(6);
        System.out.println("Data berhasil dihapus");
    }
}
