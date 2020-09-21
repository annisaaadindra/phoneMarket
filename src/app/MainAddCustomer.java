package app;

import dao.MySQLConnection;
import dao.impl.ImplCustomer;
import dao.inface.InfaceCustomer;
import entity.Customer;

public class MainAddCustomer {
    public static void main(String[] args) throws Exception {
        Customer cst = new Customer("98765123", "Annisaa", "Daulay", "8udsihb@idsr.fdh", "0876tghjki");
        InfaceCustomer cstDAO = new ImplCustomer(MySQLConnection.getConnection());
        cstDAO.insert(cst);
    }
}
