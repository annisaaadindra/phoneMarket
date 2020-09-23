package dao.inface;

import java.util.List;

import entity.Customer;
import entity.Order;

public interface InfaceOrder {
    public int countSubtotalPrize(int idOrder) throws Exception;
    public int addOrder(Order order, Customer cst) throws Exception;
   
    public List<Order> showAllOrder() throws Exception;
    public List<Order> showOrderByCst(int idCst) throws Exception;
}
