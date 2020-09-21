package app;

import dao.MySQLConnection;
import dao.impl.ImplCustomer;
import dao.inface.InfaceCustomer;
import entity.Customer;

public class MainUpdCustomer{
    public static void main(String[] args) throws Exception {
        InfaceCustomer cstDAO = new ImplCustomer(MySQLConnection.getConnection());
        Customer cst = cstDAO.showProfile(1);

        cstDAO.update(cst);
    }
}
