package app;

import dao.MySQLConnection;
import dao.impl.ImplBrand;
import dao.inface.InfaceBrand;
import entity.Brand;

public class MainAddBrand {
    public static void main(String[] args) throws Exception {
        Brand brand = new Brand();
        brand.setNama("Redmi");

        InfaceBrand brandDAO = new ImplBrand(MySQLConnection.getConnection());

        brandDAO.addBrand(brand);
        System.out.println("Data berhasil ditambahkan");
    }
}
