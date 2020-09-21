package app;

import dao.MySQLConnection;
import dao.impl.ImplAddress;
import dao.impl.ImplCustomer;
import dao.inface.InfaceAddress;
import dao.inface.InfaceCustomer;
import entity.Address;
import entity.Customer;

public class MainAddAddress {
    public static void main(String[] args) throws Exception {
        InfaceCustomer cstDAO = new ImplCustomer(MySQLConnection.getConnection());
        Customer cst = cstDAO.showProfile(1);
        Address adr = new Address();
        adr.setAddress("Jalan Hati");
        adr.setKodePos("20133");
        adr.setNoTelfon("080542398765");
        
        InfaceAddress addrDAO = new ImplAddress(MySQLConnection.getConnection());
        addrDAO.insert(cst, adr);
    }
}
