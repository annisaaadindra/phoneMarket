package dao.inface;

import java.util.Date;
import java.util.List;

import entity.Address;
import entity.Customer;
import entity.Order;

public interface InfaceOrder {
    public int countSubtotalPrize();
    public int addOrder(Customer cst, Address adr, Date dateOrder, int total);
   
    public List<Order> showAllOrder();
    public List<Order> showOrderByDate(Date dateOrder);
    public List<Order> showOrderByCst(int idCst);
}
