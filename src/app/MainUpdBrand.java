package app;

import dao.MySQLConnection;
import dao.impl.ImplBrand;
import dao.inface.InfaceBrand;
import entity.Brand;

public class MainUpdBrand {
    public static void main(String[] args) throws Exception {
        Brand brand = new Brand();
        brand.setIdMerk(3);

        InfaceBrand brandDAO = new ImplBrand(MySQLConnection.getConnection());
        brandDAO.updBrand(brand);
    }
}
