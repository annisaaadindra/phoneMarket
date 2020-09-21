package dao.inface;

import java.util.List;
import entity.Customer;

public interface InfaceCustomer {
    public int insert(Customer cst) throws Exception;
    public int update(Customer cst) throws Exception;
    public int delete(int idCustomer) throws Exception;

    public List<Customer> showAllCst() throws Exception;
    public Customer showProfile(int idCustomer) throws Exception;
}
