package dao.inface;

import java.util.List;

import entity.Address;
import entity.Customer;
public interface InfaceAddress {
    public int insert(Customer cst, Address adr) throws Exception;
    public int update(Address adr) throws Exception;
    public int delete(int idAdr) throws Exception;

    public List<Address> findByCustAddresses(int Cst) throws Exception;
    public Address selectAddress(int idAdr) throws Exception;
}
