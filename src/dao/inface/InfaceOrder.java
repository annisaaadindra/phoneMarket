package dao.inface;

import java.util.Date;
import java.util.List;

import entity.Order;

public interface InfaceOrder {
    public int countSubtotalPrize();
    public int addOrder(int idCst, int idOrder, int idAddress, Date dateOrder, int total);
   
    public List<Order> showAllOrder();
    public List<Order> showOrderByDate(Date dateOrder);
    public List<Order> showOrderByCst(int idCst);
}
