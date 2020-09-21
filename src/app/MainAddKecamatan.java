package app;

import dao.MySQLConnection;
import dao.impl.ImplKecamatan;
import dao.inface.InfaceKecamatan;
import entity.Kecamatan;

public class MainAddKecamatan {
    public static void main(String[] args) throws Exception {
        InfaceKecamatan kecDAO = new ImplKecamatan(MySQLConnection.getConnection());

        Kecamatan kec = new Kecamatan();
        kec.setNama("Siantar Sitalasari");
        System.out.println(kec.getNama());

        kecDAO.add(kec);
        System.out.println("Kecamatan " +kec.getNama()+ " berhasil ditambahkan");
    }
}
