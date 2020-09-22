package app;

import dao.MySQLConnection;
import dao.impl.ImplAddress;
import dao.impl.ImplAdm;
import dao.impl.ImplBrand;
import dao.impl.ImplCategory;
import dao.impl.ImplCity;
import dao.impl.ImplColor;
import dao.impl.ImplCustomer;
import dao.impl.ImplKecamatan;
import dao.impl.ImplProv;
import dao.impl.ImplTag;
import dao.impl.ImplVarian;
import dao.inface.InfaceAddress;
import dao.inface.InfaceAdm;
import dao.inface.InfaceBrand;
import dao.inface.InfaceCategory;
import dao.inface.InfaceCity;
import dao.inface.InfaceColor;
import dao.inface.InfaceCustomer;
import dao.inface.InfaceKecamatan;
import dao.inface.InfaceProv;
import dao.inface.InfaceTag;
import dao.inface.InfaceVarian;

public class MainShow {
    public static void main(String[] args) throws Exception {
        InfaceKecamatan kecDAO = new ImplKecamatan(MySQLConnection.getConnection());
        kecDAO.showAll();

        InfaceCity cityDAO = new ImplCity(MySQLConnection.getConnection());
        cityDAO.findByID(1);
        cityDAO.showAllCity();

        InfaceVarian varDAO = new ImplVarian(MySQLConnection.getConnection());
        varDAO.getVarianByID(1);
        varDAO.showAll();

        InfaceTag tagDAO = new ImplTag(MySQLConnection.getConnection());
        tagDAO.showAllTag();

        InfaceProv provDAO = new ImplProv(MySQLConnection.getConnection());
        provDAO.findAll();
        provDAO.viewOneByID(1);

        InfaceAdm admDAO = new ImplAdm(MySQLConnection.getConnection());
        admDAO.findByID(1);
        admDAO.showAll();

        InfaceCustomer cstDAO = new ImplCustomer(MySQLConnection.getConnection());
        cstDAO.showAllCst();
        cstDAO.showProfile(1);

        InfaceAddress addrDAO = new ImplAddress(MySQLConnection.getConnection());
        addrDAO.findByCustAddresses(1);
        addrDAO.selectAddress(2);

        InfaceBrand brandDAO = new ImplBrand(MySQLConnection.getConnection());
        brandDAO.showAllBrand();

        InfaceCategory catDAO = new ImplCategory(MySQLConnection.getConnection());
        catDAO.selectOneCat(1);
        catDAO.showAllCategory();

        InfaceColor colorDAO = new ImplColor(MySQLConnection.getConnection());
        colorDAO.showAllColor();
    }

}
